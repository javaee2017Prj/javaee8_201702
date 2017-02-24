package qin.javaee8.hibernate.dao;

import qin.javaee8.core.dao.DAOSupport8;
import qin.javaee8.hibernate.domain.JDGoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.util.List;

/**
 * 手机商品数据访问层
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/1/31
 */
@Deprecated
public interface MobileGoodsDAO extends DAOSupport8<MobileGoods, Long>
{
    //region 查询所有商品类型

    /**
     * 查询所有商品类型
     *
     * @return 查询商品类型结果集合
     * @throws Exception 查询失败抛出异常
     */
    List<JDGoodsType> findAllGoodsTypes() throws Exception;
    //endregion

    //region 查询所有手机商品信息

    /**
     * 查询所有手机商品信息
     *
     * @return 所有手机信息集合(目前是1345条数据)
     * @throws Exception
     */
    List<MobileGoods> findAllGoods() throws Exception;
    //endregion

    //region 批量修改商品类型信息

    /**
     * 批量修改商品类型信息<br>
     * 根据主键和商品类型来进行修改
     *
     * @param mobileGoodsIds       手机商品主键
     * @param html_mobileGoodsType 需要修改的商品类型
     * @return
     * @throws Exception
     */
    String batchUpdateGoodsType(String[] mobileGoodsIds, String html_mobileGoodsType) throws Exception;
    //endregion

    //region 操作规则
    /**
     * 以什么开头
     */
    @Deprecated
    String searchWhatStart = "searchWhatStart";

    /**
     * 不以什么开头
     */
    @Deprecated
    String doNotSearchWhatStart = "doNotSearchWhatStart";
    //endregion

    //region 根据jsp页面传回来的操作来查找

    /**
     * 根据jsp页面传回来的操作来查找
     *
     * @param mobileGoodsStart 手机商品开始字符串
     * @param jspOperator      是根据什么来查找
     * @return 查找结果
     */
    @Deprecated
    List<MobileGoods> search_mobileGoodsStart(String mobileGoodsStart, String jspOperator)
              throws Exception;
    //endregion

    //region 查询苹果
    List<MobileGoods> searchAppleInfo() throws Exception;
    //endregion
}
