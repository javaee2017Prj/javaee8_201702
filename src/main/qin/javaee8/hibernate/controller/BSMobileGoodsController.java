/*

---------------------------------------------------------------------

页面jsp控件及表单所在行数

方法名称或控件名称                                   所在行数
_cleanDivAndAppend                                 54
MobileUtils
    |--doWrongEvent                                107
    |--checkNotNULL                                126
    |--checkOthers                                 247
$(function())
    |--btn_addMobileGoods按钮添加事件               288
    |--ajax实现新增手机商品                          354
    |--弹出新增商品类型对话框                        365
    |--添加商品类型                                 374

控件id                                       描述
myModal                                 错误信息提示框
modal_addGoodsType                      新增手机类型弹出框
frm_addGoodsType                        新增手机类型的表单
HTMLGoodsTypeParent                     上级手机类型下拉框控件
HTMLGoodsTypeName_                      商品类型名称text
HTMLGoodsTypeDescription_               商品类型描述textarea
btn_addGoodsType                        确定添加商品类型
frm_addMobileGoods                      新增手机商品的表单
HTMLGoodsType                           商品类型下拉框
btn_openAddGoodsTypeModal               如果下拉框中没有合适的分类就弹出一个对话框新建一个自己想要的商品类型
HTMLGoodsColor                          手机的机身颜色
HTMLGoodsROM                            手机机身内存
HTMLGoodsBattery                        手机电池
HTMLGoodsBackCamera                     后置摄像头
HTMLGoodsNews                           手机资讯
HTMLGoodsFrontCamera                    前置摄像头
HTMLGoodsMemory                         手机内存
HTMLGoodsNumber                         手机编号
HTMLGoodsPrice                          手机价格
HTMLGoodsName                           手机名称
HTMLGoodsDescription                    手机描述
HTMLGoodsOS                             手机系统
btn_addMobileGoods                      添加手机商品信息

---------------------------------------------------------------------


    手机控制层

    1.新增手机记录
    2.删除手机记录
    3.修改手机记录
    4.根据名称查询手机记录
    5.批量修改手机类型
    6.实现排序

 */

package qin.javaee8.hibernate.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee8.core.JavaEE8BaseSupportImpl;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.dao.MobileBatchAddGoodsTypeDAO;
import qin.javaee8.hibernate.domain.MobileGoods;
import qin.javaee8.hibernate.service.MobileBSService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 * 手机商品控制层
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/8
 */
@Controller(value = "bsMobileController8")
@Scope("prototype")
@RequestMapping(value = "/bsMobileGoods8")
@SuppressWarnings("all")
public class BSMobileGoodsController extends JavaEE8BaseSupportImpl
{
    private static final long serialVersionUID = 316694956496534479L;

    //region 重写父类的方法

    @Override
    public Class getLogClass()
    {
        return BSMobileGoodsController.class;
    }

    //endregion

    //region 注入服务层
    private MobileBSService mobileBSService;

    public MobileBSService getMobileBSService()
    {
        return mobileBSService;
    }

    @Resource
    public void setMobileBSService(MobileBSService mobileBSService)
    {
        this.mobileBSService = mobileBSService;
    }
    //endregion

    //region 一期功能

    //region 新增手机记录

    /**
     * 新增手机记录
     */
    @RequestMapping(value = "/addMobileGoods")
    public void addMobileGoods(BSHTMLMobile mobile, HttpServletResponse response) throws JavaEE8Exception
    {
        try
        {
            MobileGoods mobileGoods = new MobileGoods();

            //region 手机类型
            String goodsType = mobile.getHTMLGoodsType();
            //endregion

            //region 接收界面字段并判断

            //region 商品编号-NOT NULL-11
            //商品编号-NOT NULL-11
            String goodsNumber = mobile.getHTMLGoodsNumber().trim();

            if (goodsNumber.length() > 11)
            {
                returnJson("商品编号不能超过11个字符!", response);
                return;
            }
            //endregion

            //region 手机名称
            //手机名称-NOT NULL-80
            String goodsName = mobile.getHTMLGoodsName().trim();

            if (goodsName.length() > 80)
            {
                returnJson("商品名称不能超过80个字符!", response);
                return;
            }
            else
            {
                //手机名称不能全部为数字并且不能以数字开头
                if (goodsName.matches("[0-9]*"))
                {
                    returnJson("手机名称不能全部为数字!", response);
                    return;
                }
            }
            //endregion

            //region 手机价格
            //手机价格-NOT NULL
            String goodsPrice = mobile.getHTMLGoodsPrice().trim();

            //1.如果手机价格里不包含.则里面全部必须都是数字
            //2.如果手机价格里包含.则要截取并且判断前后是否都是数字
            if (goodsPrice.contains("."))
            {
                //3.截取.的位置
                int index = goodsPrice.indexOf(".");
                //4.前面的数字
                String frontPrice = goodsPrice.substring(0, index);
                //5.后面的数字(index截取到的符号是.)
                String backPrice = goodsPrice.substring(index + 1, goodsPrice.length());
                //6.实现判断
                if (!frontPrice.matches("[0-9]*") && backPrice.matches("[0-9]*"))
                {
                    returnJson("手机价格必须包含.或者数字", response);
                    return;
                }
            }

            //endregion

            //region 手机描述
            //手机描述
            String goodsDescription = mobile.getHTMLGoodsDescription().trim();
            //endregion

            //region 手机系统
            //手机系统-NOT NULL-10
            String goodsOS = mobile.getHTMLGoodsOS().trim();
            //endregion

            //region 手机内存
            //手机内存-NOT NULL-20
            String goodsMemory = mobile.getHTMLGoodsMemory().trim();
            //endregion

            //region 前置摄像头
            //前置摄像头-30
            String goodsFrontCamera = mobile.getHTMLGoodsFrontCamera().trim();
            //endregion

            //region 热点
            //热点-3000
            String goodsNews = mobile.getHTMLGoodsNews().trim();

            if (goodsNews.length() > 3000)
            {
                returnJson("手机热点不能超过3000个字!", response);
                return;
            }

            //endregion

            //region 后置摄像头
            //后置摄像头-50
            String goodsBackCamera = mobile.getHTMLGoodsBackCamera().trim();
            //endregion

            //region 电池
            //电池-NOT NULL-50
            String goodsBattery = mobile.getHTMLGoodsBattery().trim();
            //endregion

            //region 机身内存
            //机身内存-NOT NULL-40
            String goodsROM = mobile.getHTMLGoodsROM().trim();
            //endregion

            //region 机身颜色
            //机身颜色-NOT NULL-50
            String goodsColor = mobile.getHTMLGoodsColor().trim();
            //endregion

            //endregion

            //region 实现保存
            //1.根据<br>切割并且做判断
            String[] brGoodsName = goodsName.split(STR_BR);
            //2.一个个地判断
            if (goodsName.contains(STR_BR))
            {
                for (int i = 0; i < brGoodsName.length; i++)
                {
                    if (brGoodsName[i].matches("[0-9]*"))
                    {
                        returnJson("商品名称不能全部为数字!", response);
                        return;
                    }
                    else
                    {
                        //实现批量保存
                        mobileBSService.save
                                  (
                                            brGoodsName[i], Integer.valueOf(goodsNumber), Double.valueOf(goodsPrice),
                                            goodsDescription, goodsOS, goodsMemory, goodsFrontCamera, goodsNews,
                                            goodsBackCamera, goodsBattery, goodsROM, goodsColor, goodsType
                                  );
                    }
                }
            }
            else
            {
                mobileBSService.save
                          (
                                    goodsName, Integer.valueOf(goodsNumber), Double.valueOf(goodsPrice),
                                    goodsDescription, goodsOS, goodsMemory, goodsFrontCamera, goodsNews,
                                    goodsBackCamera, goodsBattery, goodsROM, goodsColor, goodsType
                          );
            }

            //endregion

            returnJson(STR_SUCCESS, response);

        }
        catch (Exception ex)
        {
            superInfo_logger_expection("保存失败" + ex);
        }
    }
    //endregion

    //region 删除手机记录

    /**
     * 删除手机记录
     */
    @RequestMapping(value = "/deleteMobileGoods")
    public void deleteMobileGoods(BSHTMLMobile mobile, HttpServletResponse response)
    {
        try
        {
        }
        catch (Exception ex)
        {
        }
    }
    //endregion

    //region 修改手机记录

    /**
     * 修改手机记录
     */
    @RequestMapping(value = "/updateMobileGoods")
    public void updateMobileGoods(BSHTMLMobile mobile, HttpServletResponse response)
    {
        try
        {
        }
        catch (Exception ex)
        {
        }
    }
    //endregion

    //region 根据名称查询手机记录

    /**
     * 根据名称查询手机记录
     */
    @RequestMapping(value = "/searchMobileGoodsByName")
    public void searchMobileGoodsByName(BSHTMLMobile mobile, HttpServletResponse response)
    {
        try
        {
        }
        catch (Exception ex)
        {
        }
    }
    //endregion

    //region 批量修改手机类型

    /**
     * 批量修改手机类型
     */
    @RequestMapping(value = "/batchUpdateGoodsType")
    public void batchUpdateGoodsType(BSHTMLMobile mobile, HttpServletResponse response)
    {
        try
        {
        }
        catch (Exception ex)
        {
        }
    }
    //endregion

    //region 实现排序

    /**
     * 实现排序
     */
    @RequestMapping(value = "/sortMobileGoods")
    public void sortMobileGoods(BSHTMLMobile mobile, HttpServletResponse response)
    {
        try
        {
        }
        catch (Exception ex)
        {
        }
    }
    //endregion

    //endregion

    //region 二期功能

    //region 注入改善版的商品类型添加数据访问层
    private MobileBatchAddGoodsTypeDAO mobileBatchAddGoodsTypeDAO;

    public MobileBatchAddGoodsTypeDAO getMobileBatchAddGoodsTypeDAO()
    {
        return mobileBatchAddGoodsTypeDAO;
    }

    @Resource
    public void setMobileBatchAddGoodsTypeDAO(MobileBatchAddGoodsTypeDAO mobileBatchAddGoodsTypeDAO)
    {
        this.mobileBatchAddGoodsTypeDAO = mobileBatchAddGoodsTypeDAO;
    }
    //endregion

    //region 添加商品类型
    @RequestMapping(value = "/addGoodsType")
    public void addGoodsType(BSHTMLMobile mobile, HttpServletResponse response) throws Exception
    {
        Serializable addResult = 0;

        try
        {
            //接收手机商品类型
            //1.上级类型
            String HTMLGoodsTypeParent = mobile.getHTMLGoodsTypeParent().trim();
            //2.类型名称
            String HTMLGoodsTypeName_ = mobile.getHTMLGoodsTypeName_().trim();
            //3.类型描述
            String HTMLGoodsTypeDescription_ = mobile.getHTMLGoodsTypeDescription_().trim();

            //addResult = mobileBSService.addGoodsType(HTMLGoodsTypeParent, HTMLGoodsTypeName_, HTMLGoodsTypeDescription_);

            addResult = mobileBatchAddGoodsTypeDAO
                      .addGoodsType(HTMLGoodsTypeParent, HTMLGoodsTypeName_, HTMLGoodsTypeDescription_);

            returnJson(addResult, response);

            superInfo_logger_normal("添加结果为:" + addResult);
        }
        catch (Exception ex)
        {
            superInfo_logger_expection(ex);
        }
    }
    //endregion

    //region 获取所有的手机类型
    @RequestMapping(value = "/getMobileGoodsType")
    public void getMobileGoodsType(HttpServletResponse response)
    {
        try
        {
            returnJson(mobileBSService.getAllGoodsTypeSelect(), response);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    //endregion

    //region 返回新增手机页面

    /**
     * 返回新增手机页面
     *
     * @return
     */
    @RequestMapping(value = "/returnAddMobileGoodsPage")
    public ModelAndView returnAddMobileGoodsPage()
    {
        return new ModelAndView("/bsMobileGoods8/addMobileGoods");
    }
    //endregion


    //endregion
}