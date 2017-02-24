package qin.javaee8.hibernate.jd.controller;

import java.util.Random;

import static java.lang.Math.floor;

/**
 * 手机京东html接收字段实体类
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/18
 */
public class JDMobileHTML
{
    //region 所属类型
    private String htmlMobileType;

    public String getHtmlMobileType()
    {
        return htmlMobileType;
    }

    public void setHtmlMobileType(String htmlMobileType)
    {
        this.htmlMobileType = htmlMobileType;
    }
    //endregion

    //region 手机价格

    //region 自定义价格
    /**
     * 起始价格
     */
    private String htmlStartPrice;

    /**
     * 结束价格
     */
    private String htmlEndPrice;

    public String getHtmlStartPrice()
    {
        return htmlStartPrice;
    }

    public void setHtmlStartPrice(String htmlStartPrice)
    {
        this.htmlStartPrice = htmlStartPrice;
    }

    public String getHtmlEndPrice()
    {
        return htmlEndPrice;
    }

    public void setHtmlEndPrice(String htmlEndPrice)
    {
        this.htmlEndPrice = htmlEndPrice;
    }
    //endregion

    //region 价格选择区
    /**
     * 0-499
     */
    public final String MOBILE_PRICE__BETWEEN_0_499 = "0-499";

    /**
     * 500-999
     */
    public final String MOBILE_PRICE__BETWEEN_500_999 = "500-999";

    /**
     * 1000-1699
     */
    public final String MOBILE_PRICE__BETWEEN_1000_1699 = "1000-1699";

    /**
     * 1700-2799
     */
    public final String MOBILE_PRICE__BETWEEN_1700_2799 = "1700-2799";

    /**
     * 2800-4499
     */
    public final String MOBILE_PRICE__BETWEEN_2800_4499 = "2800-4499";

    /**
     * 4500-11999
     */
    public final String MOBILE_PRICE__BETWEEN_4500_11999 = "4500-11999";

    /**
     * 在12000元以上的价格
     */
    public final String MOBILE_PRICE__OVER_12000 = ">12000";
    //endregion

    //endregion

    private final String STR_OTHER = "其他";

    //region 运行内存
    private String htmlRunMemory;

    public String getHtmlRunMemory()
    {
        return htmlRunMemory;
    }

    public void setHtmlRunMemory(String htmlRunMemory)
    {
        this.htmlRunMemory = htmlRunMemory;
    }
    //endregion

    //region 机身内存
    private String htmlROM;

    public String getHtmlROM()
    {
        return htmlROM;
    }

    public void setHtmlROM(String htmlROM)
    {
        this.htmlROM = htmlROM;
    }
    //endregion

    //region 前置摄像头

    /**
     * 1600万及以上
     */
    public final String MOBILE_FRONT_CAMERA_HIGHER1600 = "1600万及以上";

    /**
     * 800万-1599万
     */
    public final String MOBILE_FRONT_CAMERA_BETWEEN_800_1599 = "800万-1599万";

    /**
     * 500万-799万
     */
    public final String MOBILE_FRONT_CAMERA_BETWEEN_500_799 = "500万-799万";

    /**
     * 200万-499万
     */
    public final String MOBILE_FRONT_CAMERA_BETWEEN_200_499 = "200万-499万";

    /**
     * 120万-199万
     */
    public final String MOBILE_FRONT_CAMERA_BETWEEN_120_199 = "120万-199万";

    /**
     * 120万以下
     */
    public final String MOBILE_FRONT_CAMERA_BELOW_120 = "120万以下";

    /**
     * 其他
     */
    public final String MOBILE_FRONT_CAMERA_OTHER = STR_OTHER;

    //endregion

    //region 后置摄像头
    /**
     * 2000万及以上
     */
    public final String MOBILE_BACK_CAMERA_HIGHER_200 = "2000万及以上";

    /**
     * 1200万-1999万
     */
    public final String MOBILE_BACK_CAMERA_BETWEEN_1200_1999 = "1200万-1999万";

    /**
     * 500万-1199万
     */
    public final String MOBILE_BACK_CAMERA_BETWEEN_500_1199 = "500万-1199万";

    public final String MOBILE_BACK_CAMERA_OTHERS = STR_OTHER;

    //endregion

    //region 机身颜色

    /**
     * 白色
     */
    public final String MOBILE_COLOR_WHITE = "白色";

    /**
     * 黑色
     */
    public final String MOBILE_COLOR_BLACK = "黑色";

    /**
     * 灰色
     */
    public final String MOBILE_COLOR_GRAY = "灰色";

    /**
     * 金色
     */
    public final String MOBILE_COLOR_GOLD = "金色";

    /**
     * 银色
     */
    public final String MOBILE_COLOR_SILVIER = "银色";

    /**
     * 红色
     */
    public final String MOBILE_COLOR_RED = "红色";

    /**
     * 粉色
     */
    public final String MOBILE_COLOR_PINK = "粉色";

    /**
     * 其他
     */
    public final String MOBILE_COLOR_OTHERS = STR_OTHER;

    //endregion

    //region 机身内存

    /**
     * 8G
     */
    public final String MOBILE_ROM_8 = "8G";

    /**
     * 16G
     */
    public final String MOBILE_ROM_16 = "16G";

    /**
     * 32G
     */
    public final String MOBILE_ROM_32 = "32G";

    /**
     * 64G
     */
    public final String MOBILE_ROM_64 = "64G";

    /**
     * 128G
     */
    public final String MOBILE_ROM_128 = "128G";

    /**
     * 无
     */
    public final String MOBILE_ROM_NO = "无";

    /**
     * 其他
     */
    public final String MOBILE_ROM_OTHERS = STR_OTHER;

    //endregion

    //region 电池

    /**
     * 1200mAh以下
     */
    public final String MOBILE_BATTERY_LOWER1200 = "1200mAh以下";

    /**
     * 1200mAh-1999mAh
     */
    public final String MOBILE_BATTERY_BETWEEN_1200_1999 = "1200mAh-1999mAh";

    /**
     * 2000mAh-2999mAh
     */
    public final String MOBILE_BATTERY_BETWEEN_2000_2999 = "2000mAh-2999mAh";

    /**
     * 3000mAh-3999mAh
     */
    public final String MOBILE_BATTERY_BETWEEN_3000_3999 = "3000mAh-3999mAh";

    /**
     * 4000mAh-5999mAh
     */
    public final String MOBILE_BATTERY_BETWEEN_4000_5999 = "4000mAh-5999mAh";

    /**
     * 6000mAh及以上
     */
    public final String MOBILE_BATTERY_HIGHER_6000 = "6000mAh及以上";

    public final String MOBILE_BATTERY_HIGHER_OTHERS = STR_OTHER;

    //endregion

    //region 获取随机价格

    /**
     * 获取随机价格
     *
     * @return 获取的价格
     */
    public final Double getMobilePrice()
    {
        Random random = new Random();
        return Double.valueOf(floor(random.nextDouble() * 500));
    }
    //endregion

    //region 手机系统

    /**
     * 苹果
     */
    public final String MOBILE_OS_APPLE = "苹果";

    /**
     * 安卓
     */
    public final String MOBILE_OS_ANDROID = "安卓";

    //endregion
}