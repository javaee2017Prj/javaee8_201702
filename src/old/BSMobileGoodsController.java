/*

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
import qin.javaee8.core.JavaEE8BaseSupportImpl;
import qin.javaee8.hibernate.domain.MobileGoods;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
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
    private BSMobileService bsMobileService;

    public BSMobileService getBsMobileService()
    {
        return bsMobileService;
    }

    @Resource
    public void setBsMobileService(BSMobileService bsMobileService)
    {
        this.bsMobileService = bsMobileService;
    }
    //endregion

    //region 新增手机记录
    /**新增手机记录*/
    @RequestMapping(value = "/addMobileGoods")
    public void addMobileGoods(BSHTMLMobile mobile, HttpServletResponse response) {
        try {
            MobileGoods mobileGoods = new MobileGoods();
            List<String> mobileGoodsNameList = new ArrayList<>();

            //region 接收界面字段并判断

            //region 商品编号-NOT NULL-11
            //商品编号-NOT NULL-11
            String goodsNumber = mobile.getHTMLGoodsNumber().trim();

            if (goodsNumber.length() > 11) {
                returnJson("商品编号不能超过11个字符!", response);
                return ;
            } else {
                //判断是否全部是数字
                if (goodsNumber.matches("[0-9]*")) {
                    //执行赋值
                    mobileGoods.setGoods_number(Integer.valueOf(goodsNumber));
                }
            }
            //endregion

            //region 手机名称
            //手机名称-NOT NULL-80
            String goodsName = mobile.getHTMLGoodsName().trim();

            if (goodsName.length() > 80 ) {
                returnJson("商品名称不能超过80个字符!", response);
                return ;
            } else {
                //1.手机名称不能全部为数字并且不能以数字开头
                if (goodsName.matches("[0-9]*")) {
                    returnJson("手机名称不能全部为数字!", response);
                    return ;
                } else {
                    //2.是否含有<br>符号, 如果含有<br>则是批量添加, 然后判断每一个商品是否全部不是数字, 如果不是数字则添加
                    //并且设置商品编号
                    //region 判断是否保存多个产品
                    if (goodsName.contains(STR_BR)) {
                        //3.根据<br>切割并且做判断
                        String[] brGoodsName = goodsName.split(STR_BR);
                        //4.一个个地判断
                        for (int i = 0; i < brGoodsName.length; i ++) {
                            if (brGoodsName[i].matches("[0-9]*")) {
                                returnJson("商品名称不能全部为数字!", response);
                                return ;
                            } else {
                                //5.当判断结束以后所有的字段都符合标准, 就在结尾时实现批量新增(先使用List集合存储)
                                mobileGoodsNameList.add(brGoodsName[i]);
                            }
                        }
                    }
                    //endregion
                    //否则就是没有<br>操作符
                    else {
                        //5.直接保存即可
                        mobileGoods.setGoods_name(goodsName);
                    }
                }

            }
            //endregion

            //region 手机价格
            //手机价格-NOT NULL
            String goodsPrice = mobile.getHTMLGoodsPrice().trim();

            //1.如果手机价格里不包含.则里面全部必须都是数字
            //2.如果手机价格里包含.则要截取并且判断前后是否都是数字
            if (goodsPrice.contains(".")) {
                //3.截取.的位置
                int index = goodsPrice.indexOf(".");
                //4.前面的数字
                String frontPrice = goodsPrice.substring(0, index);
                //5.后面的数字(index截取到的符号是.)
                String backPrice = goodsPrice.substring(index + 1, goodsPrice.length());
                //6.实现判断
                if (frontPrice.matches("[0-9]*") && backPrice.matches("[0-9]*")) {
                    //7.正确
                    mobileGoods.setGoods_price(Double.valueOf(goodsPrice));
                }
            }

            //endregion

            //手机描述
            String goodsDescription = mobile.getHTMLGoodsDescription().trim();
            //手机系统-NOT NULL-10
            String goodsOS = mobile.getHTMLGoodsOS().trim();
            //手机内存-NOT NULL-20
            String goodsMemory = mobile.getHTMLGoodsMemory().trim();
            //前置摄像头-30
            String goodsFrontCamera = mobile.getHTMLGoodsFrontCamera().trim();
            //热点-3000
            String goodsNews = mobile.getHTMLGoodsNews().trim();
            //后置摄像头-50
            String goodsBackCamera = mobile.getHTMLGoodsBackCamera().trim();
            //电池-NOT NULL-50
            String goodsBattery = mobile.getHTMLGoodsBattery().trim();
            //机身内存-NOT NULL-40
            String goodsROM = mobile.getHTMLGoodsROM().trim();
            //机身颜色-NOT NULL-50
            String goodsColor = mobile.getHTMLGoodsColor().trim();
            //endregion


        } catch (Exception ex) {
        }
    }
    //endregion

    //region 删除手机记录
    /** 删除手机记录*/@RequestMapping(value = "/deleteMobileGoods")
    public void deleteMobileGoods(BSHTMLMobile mobile, HttpServletResponse response) {
        try {
        } catch (Exception ex) {
        }
    }
    //endregion

    //region 修改手机记录
    /** 修改手机记录*/@RequestMapping(value = "/updateMobileGoods")
    public void updateMobileGoods(BSHTMLMobile mobile, HttpServletResponse response) {
        try {
        } catch (Exception ex) {
        }
    }
    //endregion

    //region 根据名称查询手机记录
    /** 根据名称查询手机记录*/@RequestMapping(value = "/searchMobileGoodsByName")
    public void searchMobileGoodsByName(BSHTMLMobile mobile, HttpServletResponse response) {
        try {
        } catch (Exception ex) {
        }
    }
    //endregion

    //region 批量修改手机类型
    /** 批量修改手机类型*/@RequestMapping(value = "/batchUpdateGoodsType")
    public void batchUpdateGoodsType(BSHTMLMobile mobile, HttpServletResponse response) {
        try {
        } catch (Exception ex) {
        }
    }
    //endregion

    //region 实现排序
    /** 实现排序*/@RequestMapping(value = "/sortMobileGoods")
    public void sortMobileGoods(BSHTMLMobile mobile, HttpServletResponse response) {
        try {
        } catch (Exception ex) {
        }
    }
    //endregion
}






















