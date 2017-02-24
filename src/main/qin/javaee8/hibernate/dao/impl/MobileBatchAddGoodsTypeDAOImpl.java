package qin.javaee8.hibernate.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import qin.javaee8.core.dao.impl.DAOSupport8Impl;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.dao.MobileBatchAddGoodsTypeDAO;
import qin.javaee8.hibernate.domain.JDGoodsType;

import javax.transaction.Transactional;
import java.io.Serializable;

/**
 * 改进版的手机类型数据访问层(二期功能不够完善所以再新建一个类来实现)
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/14
 */
@Repository("_2_mobileBatchAddGoodsTypeDAOImpl8")
@Transactional
@SuppressWarnings("all")
public class MobileBatchAddGoodsTypeDAOImpl
          extends DAOSupport8Impl<JDGoodsType, Integer>
          implements MobileBatchAddGoodsTypeDAO
{
    private static final long serialVersionUID = 2033726755966496881L;

    //region 重写父类的方法

    @Override
    public Class getLogClass()
    {
        return MobileBatchAddGoodsTypeDAOImpl.class;
    }

    @Override
    public Class<JDGoodsType> getEntityClass()
    {
        return JDGoodsType.class;
    }
    //endregion

    //region 改善版的新增商品类型实现类
    /*
        此方法思路:
        1.首先要判断以下几个条件:
            |--上级类型是否为空
            |--是否新增多个商品类型
        2.如下几种情况
            设是否有上级为isHasParent, 是否增加多个商品类型为isManyNames

            //>>有上级类型并且多个商品名称
            if (isHasParent&&isManyNames)
            //>>有上级类型并且只有一个商品名称
            if (isHasParent&&!isManyNames)
            //>>没有上级类型并且多个商品名称
            if (!isHasParent&&isManyNames)
            //>>没有上级类型并且只有一个商品名称
            if (!isHasParent&&!isManyNames)

    void example(boolean isHasParent, boolean isManyNames,
                 //      类型名称             上级
                 String typeNames, GoodsType parent, Session session)
    {
        if (isHasParent)
        {
            if (isManyNames)
            {
                //分割假设分割成如下数组
                String[] names = typeNames.split("<br>");
                //循环添加
                for (int i = 0; i < names.length; i++)
                {
                    addGoodsType(names[i], parent, session);
                }
            }
            else
            {
                addGoodsType(typeNames, parent, session);
            }
        }
        else
        {
            if (isManyNames)
            {
                //分割假设分割成如下数组
                String[] names = typeNames.split("<br>");
                //循环添加
                for (int i = 0; i < names.length; i++)
                {
                    addGoodsType(names[i], session);
                }
            }
            else
            {
                addGoodsType(typeNames, session);
            }
        }
    }

    private void addGoodsType(String typeNames, Session session)
    {
        GoodsType children = new GoodsType(typeNames);
        session.save(children);
    }

    private void addGoodsType(String typeNames, GoodsType parent, Session session)
    {
        GoodsType children = new GoodsType(typeNames);
        parent.getChildrenSet().add(children);
        children.setParentGoodsType(parent);
        session.save(children);
        session.update(parent);
    }
    */

    private void addGoodsType(String typeNames, Session session)
    {
        JDGoodsType children = new JDGoodsType(typeNames);
        session.save(children);
    }

    private void addGoodsType(String typeNames, JDGoodsType parent, Session session)
    {
        JDGoodsType children = new JDGoodsType(typeNames);
        parent.getChildrenSet().add(children);
        children.setParentGoodsType(parent);
        session.save(children);
        session.update(parent);
    }

    /**
     * 改善版的新增商品类型实现类
     *
     * @param htmlGoodsTypeParent       上级分类
     * @param htmlGoodsTypeName_        上级名称
     * @param htmlGoodsTypeDescription_ 上级描述
     * @return 添加结果
     * @throws JavaEE8Exception 抛出JavaEE8大异常
     */
    @Override
    public Serializable addGoodsType(String htmlGoodsTypeParent,
                                     String htmlGoodsTypeName_, String htmlGoodsTypeDescription_) throws JavaEE8Exception
    {
        Serializable result = 0;

        try
        {
            Session session = getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            //是否含有上级
            boolean isHasParent = false;
            //是否接收了多个商品类型名称
            boolean isManyNames = false;

            //初始化父类商品类型
            JDGoodsType parent = new JDGoodsType();

            //如果有父类
            if (htmlGoodsTypeParent.length() > 0)
            {
                isHasParent = true;
                //根据父类名称来接收
                parent = (JDGoodsType) session
                          .createQuery(new StringBuilder()
                                                 .append("from GoodsType where goods_typeName='")
                                                 .append(htmlGoodsTypeParent).append("'").toString())
                          .list().get(0);
            }

            if (htmlGoodsTypeName_.contains("<br>"))
            {
                isManyNames = true;
            }

            if (isHasParent)
            {
                if (isManyNames)
                {
                    //分割假设分割成如下数组
                    String[] names = htmlGoodsTypeName_.split("<br>");
                    //循环添加
                    for (int i = 0; i < names.length; i++)
                    {
                        addGoodsType(names[i], parent, session);
                    }
                }
                else
                {
                    addGoodsType(htmlGoodsTypeName_, parent, session);
                }
            }
            else
            {
                if (isManyNames)
                {
                    //分割假设分割成如下数组
                    String[] names = htmlGoodsTypeName_.split("<br>");
                    //循环添加
                    for (int i = 0; i < names.length; i++)
                    {
                        addGoodsType(names[i], session);
                    }
                }
                else
                {
                    addGoodsType(htmlGoodsTypeName_, session);
                }
            }

            transaction.commit();

            return result;
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("商品类型添加失败!" + ex);
            return ex;
        }
    }
    //endregion
}