package qin.javaee8.hibernate.dao;

import qin.javaee8.core.dao.DAOSupport8;
import qin.javaee8.core.dao.exceptions.GoodsTypeNULLException;
import qin.javaee8.core.dao.exceptions.HibernateDAOException;
import qin.javaee8.core.dao.exceptions.SameResultException;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.domain.GoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.util.List;
import java.util.Map;

/**
 * 改进版的手机商品数据访问层(easyui版的)
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/4
 */
@SuppressWarnings("all")
public interface MobileEasyuiDAO extends DAOSupport8<MobileGoods, Long>
{
    //region 一期功能

    //-------------------------------------------since 2017/2/5

    //region 手机商品信息在表中一共有多少条

    /**
     * 手机商品信息在表中一共有多少条
     *
     * @return 条数
     * @throws HibernateDAOException 发生了数据访问层里的错误
     */
    default Integer mobileGoodsSize() throws HibernateDAOException
    {
        return findAll().size();
    }
    //endregion

    //region 批量新增商品

    /**
     * 批量新增商品
     *
     * @param goods     批量商品实体类
     * @param goodsType 根据商品来新增
     * @return 返回回调的方法
     * @throws SameResultException 如果出现相同的商品名称则抛出异常
     */
    Object batchAddMobileGoods(String goodsType, MobileGoods... goods)
              throws SameResultException, GoodsTypeNULLException;

    //endregion

    //region 批量删除手机商品

    /**
     * 批量删除手机商品
     *
     * @param mobileGoods 批量手机商品实体
     * @return
     */
    Object batchDeleteMobileGoods(MobileGoods... mobileGoods);
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
    Object batchUpdateMobileGoodsType(GoodsType type, MobileGoods... mobileGoods)
              throws JavaEE8Exception;

    //endregion

    //region 根据商品名称查找商品

    /**
     * 根据商品名称查找商品
     *
     * @param goods_name 商品名称
     * @return 键返回商品集合, 值返回查找记录数
     */
    Map<List<MobileGoods>, Integer> findMobileGoodsByName(String goods_name);
    //endregion

    //-------------------------------------------since 2017/2/5

    //endregion
}