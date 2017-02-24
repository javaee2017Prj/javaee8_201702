package qin.javaee8.hibernate.jd.dao.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import qin.javaee8.core.dao.exceptions.HibernateDAOException;
import qin.javaee8.core.dao.exceptions.ListNULLException;
import qin.javaee8.core.dao.impl.DAOSupport8Impl;
import qin.javaee8.hibernate.domain.JDGoodsType;
import qin.javaee8.hibernate.jd.dao.JDMobileDAO;
import qin.javaee8.hibernate.jd.domain.JDMobileGoods;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 京东手机数据访问层实现
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/19
 */
@Repository
@SuppressWarnings("all")
public class JDMobileDAOImpl
          extends DAOSupport8Impl<JDMobileGoods, Serializable>
          implements JDMobileDAO
{
    private static final long serialVersionUID = -2470981070328313459L;

    //region 重写父类的方法

    @Override
    public Class getLogClass()
    {
        return JDMobileDAOImpl.class;
    }

    @Override
    public Class<JDMobileGoods> getEntityClass()
    {
        return JDMobileGoods.class;
    }
    //endregion

    //region 查询所有手机商品信息

    /**
     * 查询所有手机商品信息
     *
     * @return 如果查询成功返回一个集合, 如果失败返回一个异常
     * @throws HibernateDAOException 查询失败作为异常返回
     */
    @Override
    public Object findAllMobileGoods() throws HibernateDAOException
    {
        Object result = 0;

        Session session = getSessionFactory().openSession();
        //查询结果是根据日期降序
        List<JDMobileGoods> mobileGoodsList = session
                  .createQuery("from JDMobileGoods order by addDate desc ").list();

        //判断大小
        if (mobileGoodsList.size() > 0)
        {
            result = mobileGoodsList;
        }
        else
        {
            result = new ListNULLException("at line54:public Object findAllMobileGoods()方法执行异常!");
        }

        return result;
    }
    //endregion

    //region 查询商品类型信息

    /**
     * 查询商品类型信息
     *
     * @return 键key返回商品类型集合, 值value返回select下拉框字符串
     * @throws HibernateDAOException 如果查询失败抛出异常
     */
    @Override
    public Map<List<JDGoodsType>, StringBuilder> showAllGoodsType() throws HibernateDAOException
    {
        Map<List<JDGoodsType>, StringBuilder> result = new HashMap<>();

        Session session = getSessionFactory().openSession();
        List<JDGoodsType> goodsTypeList = findAllGoodsType(session);

        StringBuilder sb = new StringBuilder();

        if (goodsTypeList.size() > 0)
        {
            //language=html
            sb.append("<option value='0'>请选择</option>");

            int _forEach = 1;

            //拼接字符串
            for (Iterator<JDGoodsType> it = goodsTypeList.iterator(); it.hasNext(); )
            {
                JDGoodsType goodsType = it.next();
                //language=html
                sb
                          .append("<option value='")
                          .append(_forEach)
                          .append("'>")
                          .append(goodsType.getGoods_typeName())
                          .append("</option>\n");

                _forEach++;
            }

            result.put(goodsTypeList, sb);
        }
        else
        {
            result.put(emptyList, sb);
            throw new
                      ListNULLException("at line 85:public Map<List<JDGoodsType>, StringBuilder> showAllGoodsType()发生异常!找不到商品类型!");
        }

        return result;
    }

    //region 查询所有商品类型信息

    /**
     * 查询所有商品类型信息
     * <br>为了避免同时打开两个session这里传递session参数来避免
     *
     * @return
     */
    @Override
    public List<JDGoodsType> findAllGoodsType(Session session)
    {
        //如果session为空则开启Session
        if (session == null)
        {
            session = getSessionFactory().openSession();
        }

        return session.createQuery("from JDGoodsType ").list();
    }
    //endregion

    //endregion
}