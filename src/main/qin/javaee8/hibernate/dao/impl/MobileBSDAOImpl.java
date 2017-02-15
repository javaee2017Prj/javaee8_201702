package qin.javaee8.hibernate.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import qin.javaee8.core.dao.exceptions.GoodsTypeNULLException;
import qin.javaee8.core.dao.exceptions.SameResultException;
import qin.javaee8.core.dao.impl.DAOSupport8Impl;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.dao.MobileBSDAO;
import qin.javaee8.hibernate.domain.GoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Repository(value = "bsMobileDAOImpl8")
@SuppressWarnings("all")
public class MobileBSDAOImpl
          extends DAOSupport8Impl<MobileGoods, Long>
          implements MobileBSDAO
{
    private static final long serialVersionUID = -3780978384906857940L;

    //region 重写JavaEE8方法

    @Override
    public Class getLogClass()
    {
        return MobileBSDAOImpl.class;
    }

    @Override
    public Class<MobileGoods> getEntityClass()
    {
        return MobileGoods.class;
    }

    //endregion

    //region 一期功能

    //region 批量新增商品

    /**
     * 批量新增商品
     *
     * @param callBack  回调
     * @param goods     批量商品实体类
     * @param goodsType 根据商品来新增
     * @return 返回回调的方法
     * @throws SameResultException 如果出现相同的商品名称则抛出异常
     */
    @Override
    public Object batchAddMobileGoods(String goodsType, MobileGoods... goods)
              throws SameResultException, GoodsTypeNULLException
    {
        Object result = 0;

        try
        {
            Session session = getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            GoodsType myGoodsType = (GoodsType) session
                      .createQuery("from GoodsType where goods_typeName='" + goodsType + "'")
                      .list().get(0);

            //1.在新增前必须要检查一下商品类型是否为空, 如果商品类型为空抛出异常
            if (goodsType == null) throw new GoodsTypeNULLException("商品类型为空!无法新增!");

            //2.实现批量新增(在新增前要在表中查询是否有相同的商品名称)

            //region 实现批量新增(在新增前要在表中查询是否有相同的商品名称)
            for (int i = 0; i < goods.length; i++)
            {
                Map<List<MobileGoods>, Integer> maps = findMobileGoodsByName(goods[i].getGoods_name());
                //3.获取值
                Set<List<MobileGoods>> keySet = maps.keySet();
                Integer value = 0;
                for (Iterator<List<MobileGoods>> it = keySet.iterator(); it.hasNext(); )
                {
                    value = maps.get(it.next());
                }
                //判断值
                if (value == 0)
                {
                    //4.实现批量新增
                    //设置类型
                    goods[i].setMobileGoodsType(myGoodsType);
                    myGoodsType.getMobileGoodsSet().add(goods[i]);

                    session.save(goods[i]);
                    session.update(myGoodsType);
                }
                else
                {
                    //抛出异常
                    throw new SameResultException("找到相同记录!无法添加");
                }
            } //end for
            //endregion

            //5.提交事务完成新增
            transaction.commit();
            //成功返回1
            result = 1;
        }
        catch (Exception ex)
        {
            //失败返回0
            result = 0;
            superInfo_logger_expection("批量新增手机商品失败!" + ex);
        }
        finally
        {
            return result;
        }
    }
    //endregion

    //region 批量删除手机商品

    /**
     * 批量删除手机商品
     *
     * @param mobileGoods 批量手机商品实体
     * @return
     */
    @Override
    public Object batchDeleteMobileGoods(MobileGoods... mobileGoods)
    {
        Object resultObj = "";

        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try
        {
            //1.实现批量删除
            for (int i = 0; i < mobileGoods.length; i++)
            {
                session.delete(mobileGoods[i]);
            }
            transaction.commit();
            resultObj = 1;
        }
        catch (Exception ex)
        {
            resultObj = 0;
            superInfo_logger_expection("批量删除手机商品失败" + ex);
        }
        finally
        {
            return resultObj;
        }
    }
    //endregion

    //region 批量修改手机类型

    /**
     * 批量修改手机类型
     *
     * @param type        手机类型
     * @param mobileGoods 手机商品
     * @return
     * @throws JavaEE8Exception 抛出大异常
     */
    @Override
    public Object batchUpdateMobileGoodsType(GoodsType type, MobileGoods... mobileGoods)
              throws JavaEE8Exception
    {
        Object resultObj = "";

        try
        {
            Session session = getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            for (int i = 0; i < mobileGoods.length; i++)
            {
                mobileGoods[i].setMobileGoodsType(type);
                type.getMobileGoodsSet().add(mobileGoods[i]);

                session.update(mobileGoods[i]);
            }

            session.update(type);

            transaction.commit();
            resultObj = 1;
        }
        catch (Exception ex)
        {
            resultObj = 0;
        }
        finally
        {
            return resultObj;
        }
    }
    //endregion

    //region 根据商品名称查找商品

    /**
     * 根据商品名称查找商品
     *
     * @param goods_name 商品名称
     * @return 键返回商品集合, 值返回查找记录数
     */
    @Override
    public Map<List<MobileGoods>, Integer> findMobileGoodsByName(String goods_name)
    {
        Map<List<MobileGoods>, Integer> resultMap = new HashMap<>();

        List<MobileGoods> mobileGoodsList = getSessionFactory().openSession()
                  .createQuery("from MobileGoods where goods_name='" + goods_name + "'")
                  .list();

        resultMap.put(mobileGoodsList, mobileGoodsList.size());

        return resultMap;
    }
    //endregion

    //endregion

    //region 二期功能

    @Override
    public List<GoodsType> getAllMobileGoodsType()
    {
        return getSessionFactory().openSession()
                  .createQuery("select goods_typeName from GoodsType")
                  .list();
    }

    //region 新增商品类型

    /**
     * 新增商品类型(第一版, 第二版为接收多个商品类型, 这里并没有实现)<br>
     * 实现思路而是根据类型名称里的html分隔符进行切割然后循环添加
     *
     * @param htmlGoodsTypeParent       商品上级分类select下拉框
     * @param htmlGoodsTypeName_        商品上级分类名称
     * @param htmlGoodsTypeDescription_ 商品上级描述
     * @return 新增结果
     * @throws SameResultException    如果类型存在抛出异常
     * @throws GoodsTypeNULLException 如果上级商品类型为空则抛出异常
     */
    @Deprecated
    @Override
    public Serializable addGoodsType(String htmlGoodsTypeParent, String htmlGoodsTypeName_,
                                     String htmlGoodsTypeDescription_) throws JavaEE8Exception
    {
        Serializable result = 0;

        try
        {
            Session session = getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            //如果接收的上级类型不为空则查找上级类型
            GoodsType parent = new GoodsType();
            if (htmlGoodsTypeParent.length() > 0)
            {
                parent = (GoodsType) session
                          .createQuery(new StringBuilder().append("from GoodsType where goods_typeName='").append(htmlGoodsTypeParent).append("'").toString())
                          .list().get(0);
            }

            //1.首先比对如果商品名称在表中已有重复则报错不添加
            Integer searchSize = 0;
            List<GoodsType> goodsTypeList = session
                      .createQuery(new StringBuilder().append("from GoodsType where goods_typeName='")
                                             .append(htmlGoodsTypeName_).append("'").toString())
                      .list();

            if (goodsTypeList.size() > 0)
            {
                searchSize = goodsTypeList.size();
            }
            else
            {
                searchSize = 0;
            }

            List<String> goodsTypeNamesList = new ArrayList<>();
            boolean isHasManyGoodsTypeNames = false;

            if (htmlGoodsTypeName_.contains("<br>"))
            {
                isHasManyGoodsTypeNames = true;

                String[] splitTypeNames = htmlGoodsTypeName_.split("<br>");
                for (int i = 0; i < splitTypeNames.length; i++)
                {
                    goodsTypeNamesList.add(splitTypeNames[i]);
                }
            }

            boolean isHasParent = false;

            if (htmlGoodsTypeParent.length() > 0) isHasParent = true;

            if (searchSize == 0)
            {
                //2.要判断是否接收多个商品类型名称只需要判断接收的名称中是否有<br>
                //3.如果有则分割, 如果没有就是一个.
                //4.接下来判断是否有上级类型, 有为true, 无为false, 将boolean判断结果变量传递到已封装的方法中
                //进行添加操作

                //上级不为空并且有多个商品类型
                if (isHasParent && isHasManyGoodsTypeNames)
                {
                    for (int i = 0; i < goodsTypeNamesList.size(); i++)
                    {
                        String _names = goodsTypeNamesList.get(i);
                        save(true, parent, session, htmlGoodsTypeDescription_, _names);
                    }
                }
                //上级为空并且有多个商品类型
                if (isHasParent == false && isHasManyGoodsTypeNames)
                {
                    for (int i = 0; i < goodsTypeNamesList.size(); i++)
                    {
                        String _names = goodsTypeNamesList.get(i);
                        save(false, parent, session, htmlGoodsTypeDescription_, _names);
                    }
                }
                //上级不为空并且只有一个商品类型
                if (isHasParent && (isHasManyGoodsTypeNames == false))
                {
                    save(true, parent, session, htmlGoodsTypeDescription_, htmlGoodsTypeName_);
                }
                //上级为空并且只有一个商品类型
                if (isHasParent == false && (isHasManyGoodsTypeNames == false))
                {
                    save(false, parent, session, htmlGoodsTypeDescription_, htmlGoodsTypeName_);
                }
            }
            else
            {
                throw new SameResultException("发现了相同的商品类型异常!");
            }

            transaction.commit();

            return STR_SUCCESS;
        }
        catch (Exception ex)
        {
            superInfo_logger_normal("=======================================\n");
            superInfo_logger_expection(ex);
            superInfo_logger_normal("=======================================\n");

            return ex;
        }
    }

    //endregion

    //region 二期添加商品类型封装功能
    @Deprecated
    private void save(boolean goodsTypeIsHasParent,
                      GoodsType parent, Session session, String description,
                      String... goodsTypeNames)
    {
        if (goodsTypeIsHasParent)
        {
            saveOrUpdate(true, parent, session, description, goodsTypeNames);
        }
        else
        {
            saveOrUpdate(false, null, session, description, goodsTypeNames);
        }
    }

    @Deprecated
    private void saveOrUpdate(boolean goodsTypeIsHasParent,
                              GoodsType parent, Session session, String description,
                              String... goodsTypeNames)
    {
        for (int i = 0; i < goodsTypeNames.length; i++)
        {
            GoodsType childrenGoodsTypeSet = new GoodsType(goodsTypeNames[i]);

            if (goodsTypeIsHasParent)
            {
                childrenGoodsTypeSet.setParentGoodsType(parent);
                parent.getChildrenSet().add(childrenGoodsTypeSet);
                session.save(childrenGoodsTypeSet);
                session.update(parent);
            }
            else
            {
                session.save(childrenGoodsTypeSet);
            }
        }
    }
    //endregion

    //region 改善版的新增商品类型

    /**
     * 改善版的新增商品类型
     *
     * @param isHasParent               此商品类型是否具有上级类型
     * @param htmlGoodsTypeParent       如果有则接收此上级类型
     * @param htmlGoodsTypeDescription_ 上级类型描述
     * @param htmlGoodsTypeName_        上级类型名称添加
     *                                  z @return 添加结果类型
     * @throws JavaEE8Exception 如果添加失败抛出大异常
     */
    @Override
    public Serializable addGoodsType(Boolean isHasParent, String htmlGoodsTypeParent,
                                     String htmlGoodsTypeDescription_, String htmlGoodsTypeName_) throws JavaEE8Exception
    {
        Serializable result = 0;

        try
        {
            Session session = getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            GoodsType childrenTypes = new GoodsType(htmlGoodsTypeName_);

            //比对如果商品名称在表中已有重复则报错不添加
            Integer searchSize = 0;
            List<GoodsType> goodsTypeList = session
                      .createQuery(new StringBuilder().append("from GoodsType where goods_typeName='")
                                             .append(htmlGoodsTypeName_).append("'").toString())
                      .list();

            if (goodsTypeList.size() > 0)
            {
                searchSize = goodsTypeList.size();
                throw new SameResultException("已在表中查询到了相同的商品类型记录!");
            }
            else
            {
                searchSize = 0;
                childrenTypes.setGoods_typeName(htmlGoodsTypeName_);
                childrenTypes.setGoods_typeDescription(htmlGoodsTypeDescription_);
            }

            GoodsType parent = new GoodsType();

            //获取上级类型
            if (isHasParent)
            {
                parent = (GoodsType) session
                          .createQuery(new StringBuilder()
                                                 .append("from GoodsType where goods_typeName='")
                                                 .append(htmlGoodsTypeParent).append("'").toString())
                          .list().get(0);
                childrenTypes.setParentGoodsType(parent);
                parent.getChildrenSet().add(childrenTypes);
                session.save(childrenTypes);
                session.update(parent);
            }
            else
            {
                //没有上级类型
                session.save(childrenTypes);
            }

            transaction.commit();
            result = 1;

            return result;
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("数据访问层添加商品类型失败!");
            return ex;
        }
    }
    //endregion

    /**
     * 获取所有名字下拉框数据
     *
     * @return
     */
    @Override
    public String getAllGoodsTypeSelect()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("<option value=\"\">请选择</option>");

        List<GoodsType> goodsTypeList = getSessionFactory().openSession()
                  .createQuery("from GoodsType ")
                  .list();

        for (int i = 0; i < goodsTypeList.size(); i++)
        {
            GoodsType goodsType = goodsTypeList.get(i);
            sb.append("<option value=\"\">" + goodsType.getGoods_typeName() + "</option>");
        }

        return sb.toString();
    }

//endregion
}

//region 逻辑类测试
/*


@SuppressWarnings("all")
class Test
{
    Session session = null;

    //假设有一个上级类型
    GoodsType parent = null;

    */
/*
    有这么几种情况
1.上级为空并且新增多个类型名称
2.上级为空并且新增一个类型名称
3.上级不为空并且新增多个类型名称
4.上级不为空并且新增一个类型名称

     *//*

    void save(boolean goodsTypeIsHasParent, String... goodsTypeNames)
    {
        if (goodsTypeIsHasParent)
        {
            saveOrUpdate(true, goodsTypeNames);
        }
        else
        {
            saveOrUpdate(false, goodsTypeNames);
        }
    }

    private void saveOrUpdate(boolean goodsTypeIsHasParent, String... goodsTypeNames)
    {
        for (int i = 0; i < goodsTypeNames.length; i++)
        {
            GoodsType childrenGoodsTypeSet = new GoodsType(goodsTypeNames[i]);

            if (goodsTypeIsHasParent)
            {
                childrenGoodsTypeSet.setParentGoodsType(parent);
                parent.getChildrenSet().add(childrenGoodsTypeSet);
                session.save(childrenGoodsTypeSet);
                session.update(parent);
            }
            else
            {
                session.save(childrenGoodsTypeSet);
            }
        }
    }
}

*/
//endregion
