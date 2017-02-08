package qin.javaee8.hibernate.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.dao.MobileBSDAO;
import qin.javaee8.hibernate.domain.MobileGoods;
import qin.javaee8.hibernate.service.BSMobileService;

import javax.annotation.Resource;

@Service
@Transactional
public class BSMobileServiceImpl implements BSMobileService
{
    //region 注入数据访问层
    private MobileBSDAO mobileBSDAO;

    public MobileBSDAO getMobileBSDAO()
    {
        return mobileBSDAO;
    }

    @Resource
    public void setMobileBSDAO(MobileBSDAO mobileBSDAO)
    {
        this.mobileBSDAO = mobileBSDAO;
    }
    //endregion

    //region 保存手机信息

    /**
     * 保存手机信息
     *
     * @param goodsName        手机名称
     * @param goodsNumber      手机编号
     * @param goodsPrice       手机价格
     * @param goodsDescription 手机描述
     * @param goodsOS          手机系统
     * @param goodsMemory      手机内存
     * @param goodsFrontCamera 手机前置摄像头
     * @param goodsNews        资讯
     * @param goodsBackCamera  手机后置摄像头
     * @param goodsBattery     手机电池
     * @param goodsROM         手机机身存储
     * @param goodsColor       手机机身颜色
     * @param goodsType        商品类型
     */
    @Override
    public void save
    (
            String goodsName, Integer goodsNumber, Double goodsPrice,
            String goodsDescription, String goodsOS, String goodsMemory,
            String goodsFrontCamera, String goodsNews, String goodsBackCamera,
            String goodsBattery, String goodsROM, String goodsColor, String goodsType
    ) throws JavaEE8Exception
    {
        MobileGoods mobileGoods = new MobileGoods();
        mobileGoods.setGoods_name(goodsName);
        mobileGoods.setGoods_number(goodsNumber);
        mobileGoods.setGoods_price(goodsPrice);
        mobileGoods.setGoods_description(goodsDescription);
        mobileGoods.setMobile_os(goodsOS);
        mobileGoods.setMobile_memory(goodsMemory);
        mobileGoods.setMobile_frontCamera(goodsFrontCamera);
        mobileGoods.setMobile_news(goodsNews);
        mobileGoods.setMobile_backCamera(goodsBackCamera);
        mobileGoods.setMobile_battery(goodsBattery);
        mobileGoods.setMobile_rom(goodsROM);
        mobileGoods.setMobile_color(goodsColor);

        mobileBSDAO.batchAddMobileGoods(goodsType, mobileGoods);
    }
    //endregion
}