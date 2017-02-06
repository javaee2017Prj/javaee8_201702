package qin.javaee8.hibernate.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import qin.javaee8.core.DAOCallBack;
import qin.javaee8.core.dao.exceptions.GoodsTypeNULLException;
import qin.javaee8.core.dao.exceptions.SameResultException;
import qin.javaee8.core.dao.impl.DAOSupport8Impl;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.dao.MobileEasyuiDAO;
import qin.javaee8.hibernate.domain.GoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Repository(value = "JQuery_mobileDAOImpl8")
@SuppressWarnings("all")
public class MobileEasyuiDAOImpl
        extends DAOSupport8Impl<MobileGoods, Long>
        implements MobileEasyuiDAO
{
    private static final long serialVersionUID = -3780978384906857940L;

    //region 重写JavaEE8方法

    @Override
    public Class getLogClass()
    {
        return MobileEasyuiDAOImpl.class;
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
        return doExecute(new DAOCallBack()
                         {
                             @Override
                             public Object doDelete(Session session, Transaction transaction)
                             {
                                 Object resultObj = "";

                                 session = getSessionFactory().openSession();
                                 transaction = session.beginTransaction();

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
                         }
        );
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
        return doExecute(new DAOCallBack()
                         {
                             @Override
                             public Object doUpdate(Session session, Transaction transaction)
                             {
                                 Object resultObj = "";

                                 try
                                 {
                                     session = getSessionFactory().openSession();
                                     transaction = session.beginTransaction();

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
                         }
        );
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
}