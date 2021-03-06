package qin.javaee8.hibernate.service;

import qin.javaee8.core.dao.exceptions.HibernateDAOException;
import qin.javaee8.exceptions.JavaEE8Exception;

import java.io.Serializable;

public interface MobileBSService
{
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
    void save
    (
              String goodsName, Integer goodsNumber, Double goodsPrice,
              String goodsDescription, String goodsOS, String goodsMemory,
              String goodsFrontCamera, String goodsNews, String goodsBackCamera,
              String goodsBattery, String goodsROM, String goodsColor, String goodsType
    ) throws JavaEE8Exception;
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
    Serializable addGoodsType(String htmlGoodsTypeParent, String htmlGoodsTypeName_,
                              String htmlGoodsTypeDescription_) throws HibernateDAOException;
    //endregion

    //region 获取所有名字下拉框数据

    /**
     * 获取所有名字下拉框数据
     *
     * @return
     */
    String getAllGoodsTypeSelect();
    //endregion
}
