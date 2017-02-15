package qin.javaee8.hibernate.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qin.javaee8.core.dao.exceptions.HibernateDAOException;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.dao.MobileBSDAO;
import qin.javaee8.hibernate.domain.MobileGoods;
import qin.javaee8.hibernate.service.MobileBSService;

import javax.annotation.Resource;
import java.io.Serializable;

@Service(value = "bsMobileServiceImpl8")
@Transactional
public class MobileBSServiceImpl implements MobileBSService
{
    //region 注入数据访问层
    private MobileBSDAO mobileBSDAO;

    public MobileBSDAO getMobileBSDAO()
    {
        return mobileBSDAO;
    }

    @Resource//(name = "JQuery_mobileDAOImpl8")
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

    //region 新增商品类型

    /**
     * 新增商品类型
     *
     * @param htmlGoodsTypeParent       商品上级分类select下拉框
     * @param htmlGoodsTypeName_        商品上级分类名称
     * @param htmlGoodsTypeDescription_ 商品上级描述
     * @return 新增结果
     * @throws HibernateDAOException 如果类型存在抛出异常
     */
    @Override
    public Serializable addGoodsType(String htmlGoodsTypeParent, String htmlGoodsTypeName_,
                                     String htmlGoodsTypeDescription_) throws HibernateDAOException
    {
        Serializable result = 0;

        try
        {
            boolean isHasParent = false;

            //判断是否有上级类型
            if (htmlGoodsTypeParent.length() > 0)
            {
                //如果有返回true, 没有则返回false
                isHasParent = true;
            }
            else
            {
                isHasParent = false;
            }

            //判断是否接收了多个商品类型名称
            //如果是则for循环添加

            if (htmlGoodsTypeName_.indexOf("<br>") > 0)
            {
                String[] goodsTypeNames = htmlGoodsTypeName_.split("<br>");
                for (String s : goodsTypeNames)
                {
                    //这里将是否具有上级类型的判断参数传入数据访问层
                    result = mobileBSDAO.addGoodsType(isHasParent, htmlGoodsTypeParent, htmlGoodsTypeDescription_, s);
                }
            }
            else
            {
                //一个商品名称
                result = mobileBSDAO
                          .addGoodsType(isHasParent, htmlGoodsTypeParent, htmlGoodsTypeDescription_, htmlGoodsTypeName_);
            }

            return result;
        }
        catch (Exception ex)
        {
            return ex;
        }
    }
    //endregion

    /**
     * 获取所有名字下拉框数据
     *
     * @return
     */
    @Override
    public String getAllGoodsTypeSelect()
    {
        return mobileBSDAO.getAllGoodsTypeSelect();
    }
}