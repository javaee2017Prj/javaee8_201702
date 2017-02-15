package qin.javaee8.hibernate.service;

import qin.javaee8.hibernate.domain.GoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.util.List;

/**
 * 手机服务层
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@Deprecated
public interface MobileGoodsService
{
    //region 查询所有商品类型
    List<GoodsType> findAllGoodsTypes() throws Exception;
    //endregion

    //region 查询所有商品信息
    List<MobileGoods> findAllGoods() throws Exception;
    //endregion

    //region 查询苹果
    List<MobileGoods> searchAppleInfo() throws Exception;
    //endregion

    //region 批量更新商品类型
    String batchUpdateGoodsType(String[] mobileGoodsIds, String html_mobileGoodsType) throws Exception;
    //endregion

    //region 根据jsp页面传回来的操作来查找
    @Deprecated
    List<MobileGoods> search_mobileGoodsStart(String mobileGoodsStart, String jspOperator)
              throws Exception;
    //endregion

}
