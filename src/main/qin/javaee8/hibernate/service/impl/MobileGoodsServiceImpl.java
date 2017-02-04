package qin.javaee8.hibernate.service.impl;

import org.springframework.stereotype.Service;
import qin.javaee8.hibernate.dao.MobileGoodsDAO;
import qin.javaee8.hibernate.domain.GoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;
import qin.javaee8.hibernate.service.MobileGoodsService;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;


/**
 * 商品服务层实现
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/1/31
 */
@Service
@Transactional
public class MobileGoodsServiceImpl implements MobileGoodsService
{
    //region 注入服务层
    private MobileGoodsDAO mobileGoodsDAO;

    public MobileGoodsDAO getMobileGoodsDAO()
    {
        return mobileGoodsDAO;
    }

    @Resource
    public void setMobileGoodsDAO(MobileGoodsDAO mobileGoodsDAO)
    {
        this.mobileGoodsDAO = mobileGoodsDAO;
    }
    //endregion

    //region 查询所有商品类型
    @Override
    public List<GoodsType> findAllGoodsTypes() throws Exception
    {
        return mobileGoodsDAO.findAllGoodsTypes();
    }
    //endregion

    //region 查询所有商品
    @Override
    public List<MobileGoods> findAllGoods() throws Exception
    {
        return mobileGoodsDAO.findAllGoods();
    }
    //endregion

    //region 批量修改商品类型

    @Override
    public String batchUpdateGoodsType(String[] mobileGoodsIds, String html_mobileGoodsType) throws Exception
    {
        return mobileGoodsDAO.batchUpdateGoodsType(mobileGoodsIds, html_mobileGoodsType);
    }

    //endregion

    //region 根据jsp页面传回来的操作来查找

    @Override
    @Deprecated
    public List<MobileGoods> search_mobileGoodsStart(String mobileGoodsStart, String jspOperator) throws Exception
    {
        return mobileGoodsDAO.search_mobileGoodsStart(mobileGoodsStart, jspOperator);
    }

    //endregion

    //region 查询苹果
    @Override
    public List<MobileGoods> searchAppleInfo() throws Exception
    {
        return mobileGoodsDAO.searchAppleInfo();
    }
    //endregion
}