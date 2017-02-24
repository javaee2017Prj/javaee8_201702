package qin.javaee8.hibernate.jd.dao;

import org.hibernate.Session;
import qin.javaee8.core.dao.DAOSupport8;
import qin.javaee8.core.dao.exceptions.HibernateDAOException;
import qin.javaee8.hibernate.domain.JDGoodsType;
import qin.javaee8.hibernate.jd.domain.JDMobileGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 京东手机数据访问层
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/19
 */
public interface JDMobileDAO extends DAOSupport8<JDMobileGoods, Serializable>
{
    //region 一期功能

    //region 查询所有手机商品信息

    /**
     * 查询所有手机商品信息
     *
     * @return 如果查询成功返回一个集合, 如果失败返回一个异常
     * @throws HibernateDAOException 查询失败作为异常返回
     */
    Object findAllMobileGoods() throws HibernateDAOException;
    //endregion

    //region 查询商品类型信息

    /**
     * 查询商品类型信息
     *
     * @return 键key返回商品类型集合, 值value返回select下拉框字符串
     * @throws HibernateDAOException 如果查询失败抛出异常
     */
    Map<List<JDGoodsType>, StringBuilder> showAllGoodsType() throws HibernateDAOException;
    //endregion

    //region 此数据访问层独有功能

    /**
     * 查询所有商品类型信息
     *
     * @return
     */
    List<JDGoodsType> findAllGoodsType(Session session);
    //endregion

    //endregion
}
