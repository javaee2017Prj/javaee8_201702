package qin.javaee8.hibernate.domain;

import java.util.Random;

import static java.lang.Math.floor;

/**
 * 手机属性封装
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public final class MobileProperty
{
    private static final String STR_OTHER = "其他";

    //region 前置摄像头

    /**
     * 1600万及以上
     */
    public static final String MOBILE_FRONT_CAMERA_HIGHER1600 = "1600万及以上";

    /**
     * 800万-1599万
     */
    public static final String MOBILE_FRONT_CAMERA_BETWEEN_800_1599 = "800万-1599万";

    /**
     * 500万-799万
     */
    public static final String MOBILE_FRONT_CAMERA_BETWEEN_500_799 = "500万-799万";

    /**
     * 200万-499万
     */
    public static final String MOBILE_FRONT_CAMERA_BETWEEN_200_499 = "200万-499万";

    /**
     * 120万-199万
     */
    public static final String MOBILE_FRONT_CAMERA_BETWEEN_120_199 = "120万-199万";

    /**
     * 120万以下
     */
    public static final String MOBILE_FRONT_CAMERA_BELOW_120 = "120万以下";

    /**
     * 其他
     */
    public static final String MOBILE_FRONT_CAMERA_OTHER = STR_OTHER;

    //endregion

    //region 后置摄像头
    /**
     * 2000万及以上
     */
    public static final String MOBILE_BACK_CAMERA_HIGHER_200 = "2000万及以上";

    /**
     * 1200万-1999万
     */
    public static final String MOBILE_BACK_CAMERA_BETWEEN_1200_1999 = "1200万-1999万";

    /**
     * 500万-1199万
     */
    public static final String MOBILE_BACK_CAMERA_BETWEEN_500_1199 = "500万-1199万";

    public static final String MOBILE_BACK_CAMERA_OTHERS = STR_OTHER;

    //endregion

    //region 机身颜色

    /**
     * 白色
     */
    public static final String MOBILE_COLOR_WHITE = "白色";

    /**
     * 黑色
     */
    public static final String MOBILE_COLOR_BLACK = "黑色";

    /**
     * 灰色
     */
    public static final String MOBILE_COLOR_GRAY = "灰色";

    /**
     * 金色
     */
    public static final String MOBILE_COLOR_GOLD = "金色";

    /**
     * 银色
     */
    public static final String MOBILE_COLOR_SILVIER = "银色";

    /**
     * 红色
     */
    public static final String MOBILE_COLOR_RED = "红色";

    /**
     * 粉色
     */
    public static final String MOBILE_COLOR_PINK = "粉色";

    /**
     * 其他
     */
    public static final String MOBILE_COLOR_OTHERS = STR_OTHER;

    //endregion

    //region 机身内存

    /**
     * 8G
     */
    public static final String MOBILE_ROM_8 = "8G";

    /**
     * 16G
     */
    public static final String MOBILE_ROM_16 = "16G";

    /**
     * 32G
     */
    public static final String MOBILE_ROM_32 = "32G";

    /**
     * 64G
     */
    public static final String MOBILE_ROM_64 = "64G";

    /**
     * 128G
     */
    public static final String MOBILE_ROM_128 = "128G";

    /**
     * 无
     */
    public static final String MOBILE_ROM_NO = "无";

    /**
     * 其他
     */
    public static final String MOBILE_ROM_OTHERS = STR_OTHER;

    //endregion

    //region 电池

    /**
     * 1200mAh以下
     */
    public static final String MOBILE_BATTERY_LOWER1200 = "1200mAh以下";

    /**
     * 1200mAh-1999mAh
     */
    public static final String MOBILE_BATTERY_BETWEEN_1200_1999 = "1200mAh-1999mAh";

    /**
     * 2000mAh-2999mAh
     */
    public static final String MOBILE_BATTERY_BETWEEN_2000_2999 = "2000mAh-2999mAh";

    /**
     * 3000mAh-3999mAh
     */
    public static final String MOBILE_BATTERY_BETWEEN_3000_3999 = "3000mAh-3999mAh";

    /**
     * 4000mAh-5999mAh
     */
    public static final String MOBILE_BATTERY_BETWEEN_4000_5999 = "4000mAh-5999mAh";

    /**
     * 6000mAh及以上
     */
    public static final String MOBILE_BATTERY_HIGHER_6000 = "6000mAh及以上";

    public static final String MOBILE_BATTERY_HIGHER_OTHERS = STR_OTHER;

    //endregion

    //region 获取随机价格

    /**
     * 获取随机价格
     *
     * @return 获取的价格
     */
    public static final Double getMobilePrice()
    {
        Random random = new Random();
        return Double.valueOf(floor(random.nextDouble() * 500));
    }
    //endregion

    //region 手机系统

    /**
     * 苹果
     */
    public static final String MOBILE_OS_APPLE = "苹果";

    /**
     * 安卓
     */
    public static final String MOBILE_OS_ANDROID = "安卓";

    //endregion
}