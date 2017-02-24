package qin.javaee8.hibernate.jd.service;

import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.domain.JDGoodsType;
import qin.javaee8.hibernate.jd.domain.JDMobileGoods;

import java.util.List;

/**
 * 京东手机服务层
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/19
 */
@SuppressWarnings("all")
public interface JDMobileService extends JavaEE8BaseSupport
{
    //region 一期功能(主要是首页的显示)

    //region 以集合形式显示所有手机信息

    /**
     * 以集合形式显示所有手机信息
     * <br>
     * 调用数据访问层实现(如果返回值是List就说明有记录, 否则就直接抛出
     * <code>{@link qin.javaee8.core.dao.exceptions.HibernateDAOException}</code>
     * 异常
     *
     * @return 以集合形式返回
     * @throws JavaEE8Exception 抛出JavaEE8大异常
     */
    List<JDMobileGoods> showALLMobileGoods() throws JavaEE8Exception;
    //endregion

    //region 显示所有商品类型信息

    //region 集合方式显示

    /**
     * 显示所有商品类型信息(集合方式显示)
     *
     * @return 以集合方式来显示
     * @throws JavaEE8Exception
     */
    List<JDGoodsType> showAllGoodsType() throws JavaEE8Exception;
    //endregion

    //region html下拉框方式显示

    /**
     * html下拉框显示
     *
     * @return select下拉框
     * @throws JavaEE8Exception
     */
    StringBuilder showAllSelectGoodsType() throws JavaEE8Exception;
    //endregion

    //endregion

    //endregion
}