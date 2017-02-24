/*

    这个控制层有如下几个方法

        |--热款推荐:
        |--列出所有的手机类型::
        |--每行5个列出商品名称:
        |--其中页面上根据根据条件搜索功能
            价格
            屏幕尺寸
            运行内存
            机身内存
            系统
            电池容量
            cpu核心数
            后置摄像头
            前置摄像头
            机身颜色



返回值+方法名                                                                          简单描述
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
List<MobileGoods> getWishMobileGoods()                    ==>获取推荐手机信息, 图片文字+价格, 首先判断手机信息表中是否存在手机信息记录并且记录条数是否大于5,
                                                                                                            如果不大于5则不显示推荐信息, 在界面上显示请先添加记录!(根据添加时间排序,
                                                                                                            这个功能实现之前必须先更改表结构新增一个及时添加时间字段)
List<GoodsType> getAllGoodsType()                               ==>获取所有手机类型然后在控制层调用(如果没有记录抛出异常)
List<MobileGoods> getMobileGoods(MobileGoods mobileGoods)  ==>根据手机信息来查找完成页面的查找功能


这里要设计一个接收字段的类
之前那些类功能不完善, 不行, 所以这里必须重新建立



 */

package qin.javaee8.hibernate.jd.controller;

import org.springframework.web.servlet.ModelAndView;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.jd.JDMobileEasyUI;

/**
 * 改善版的三月份版的手机控制层<br>
 * (模仿京东实现, 这是第三版了)<br>
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/18
 */
@SuppressWarnings("all")
public interface JDMobileGoodsControllerI extends JavaEE8BaseSupport
{
    //region 一期功能

    //region Controller类最基础的路径
    /**
     * Controller类最基础的路径
     */
    String jdMobileBasePath = "/jdMobile";

    /**
     * 返回手机京东首页
     */
    ModelAndView indexPage = new ModelAndView(jdMobileBasePath + "/index");
    //endregion

    //region 返回京东手机首页

    /**
     * 返回京东手机首页
     *
     * @return
     */
    ModelAndView index();
    //endregion

    //region 显示推荐商品

    /**
     * 显示推荐商品(只显示5条)
     *
     * @throws JavaEE8Exception 捕获输出异常
     */
    void showRecommandMobileGoods() throws JavaEE8Exception;
    //endregion

    //region 显示所有商品信息

    /**
     * 显示所有手机信息
     *
     * @throws JavaEE8Exception
     */
    void showAllMobileGoods() throws JavaEE8Exception;
    //endregion

    //region 根据接收的条件查找

    @Deprecated
    /**
     * 根据接收的手机条件进行查找
     *
     * @param mobileGoods 手机商品
     * @throws JavaEE8Exception
     */
    void searchMobileGoods(JDMobileHTML mobileGoods) throws JavaEE8Exception;
    //endregion

    //endregion

    //region easyui版功能

    /**
     * 根据下拉框选中的值进行查找<br>
     * 思路实现:<br>
     * 1.首先将接收的所有查找条件清空里面所有的空格<br>
     * 2.调用服务层-->数据访问层实现查找, 如果没有此记录弹出对话框是否执行新增数据功能, 并且初始化一个新的方法
     *
     * @param mobileEasyUI 界面上的下拉框控件的值(不能改变, 不能new, 也不能改变值)
     * @throws JavaEE8Exception 输出有异常
     * @author qinzhengying
     * @since 1.8 2017 2017/2/23
     */
    void searchEasyuiMobileGoods(final JDMobileEasyUI mobileEasyUI) throws JavaEE8Exception;

    //region 新增我的手机信息

    /**
     * 新增我的手机信息
     *
     * @param mobileEasyUI 界面上的下拉框控件的值(不能改变, 不能new, 也不能改变值)
     * @throws JavaEE8Exception 输出有异常
     */
    void addMobileGoods(final JDMobileEasyUI mobileEasyUI) throws JavaEE8Exception;
    //endregion


    //endregion
}