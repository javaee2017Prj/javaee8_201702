package qin.javaee8.hibernate.domain;

import qin.javaee8.exceptions.LogClassException;
import qin.javaee8.exceptions.LogException;

/**
 * 手机商品
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
public class MobileGoods extends SuperGoods
{
    //region 构造函数
    @Override
    public Class getLogClass()
    {
        return MobileGoods.class;
    }

    public MobileGoods()
    {
        try
        {
            superInfo_logger_normal(">>>>正在初始化手机类默认构造函数<<<<");
        }
        catch (LogException e)
        {
            e.printStackTrace();
        }
        catch (LogClassException e)
        {
            e.printStackTrace();
        }
    }

    public MobileGoods(String mobile_os, String mobile_memory, String mobile_frontCamera,
                       String mobile_news, String mobile_backCamera, String mobile_battery,
                       String mobile_rom, String mobile_color, JDGoodsType mobileGoodsType)
    {
        this.mobile_os = mobile_os;
        this.mobile_memory = mobile_memory;
        this.mobile_frontCamera = mobile_frontCamera;
        this.mobile_news = mobile_news;
        this.mobile_backCamera = mobile_backCamera;
        this.mobile_battery = mobile_battery;
        this.mobile_rom = mobile_rom;
        this.mobile_color = mobile_color;
        this.mobileGoodsType = mobileGoodsType;

        StringBuilder sb = new StringBuilder("MobileGoods{");
        sb.append("mobile_os='").append(mobile_os).append('\'');
        sb.append(", mobile_memory='").append(mobile_memory).append('\'');
        sb.append(", mobile_frontCamera='").append(mobile_frontCamera).append('\'');
        sb.append(", mobile_news=").append(mobile_news);
        sb.append(", mobile_backCamera='").append(mobile_backCamera).append('\'');
        sb.append(", mobile_battery='").append(mobile_battery).append('\'');
        sb.append(", mobile_rom='").append(mobile_rom).append('\'');
        sb.append(", mobile_color='").append(mobile_color).append('\'');
        sb.append('}');
        try
        {
            superInfo_logger_normal("正在初始化手机有参构造函数:" + sb.toString());
        }
        catch (LogException e)
        {
            e.printStackTrace();
        }
        catch (LogClassException e)
        {
            e.printStackTrace();
        }
    }
    //endregion

    //region 手机专有的属性

    //region 手机系统
    /**
     * 手机系统
     */
    private String mobile_os;

    public String getMobile_os()
    {
        return mobile_os;
    }

    public void setMobile_os(String mobile_os)
    {
        this.mobile_os = mobile_os;
    }
    //endregion

    //region 运行内存
    /**
     * 运行内存
     */
    private String mobile_memory;

    public String getMobile_memory()
    {
        return mobile_memory;
    }

    public void setMobile_memory(String mobile_memory)
    {
        this.mobile_memory = mobile_memory;
    }
    //endregion

    //region 前置摄像头像素
    /**
     * 前置摄像头像素
     */
    private String mobile_frontCamera;

    public String getMobile_frontCamera()
    {
        return mobile_frontCamera;
    }

    public void setMobile_frontCamera(String mobile_frontCamera)
    {
        this.mobile_frontCamera = mobile_frontCamera;
    }
    //endregion

    //region 热点
    /**
     * 热点
     */
    private String mobile_news;

    public String getMobile_news()
    {
        return mobile_news;
    }

    public void setMobile_news(String mobile_news)
    {
        this.mobile_news = mobile_news;
    }
    //endregion

    //region 后置摄像头像素
    /**
     * 后置摄像头像素
     */
    private String mobile_backCamera;

    public String getMobile_backCamera()
    {
        return mobile_backCamera;
    }

    public void setMobile_backCamera(String mobile_backCamera)
    {
        this.mobile_backCamera = mobile_backCamera;
    }
    //endregion

    //region 电池容量
    /**
     * 电池容量
     */
    private String mobile_battery;

    public String getMobile_battery()
    {
        return mobile_battery;
    }

    public void setMobile_battery(String mobile_battery)
    {
        this.mobile_battery = mobile_battery;
    }
    //endregion

    //region 机身内存
    /**
     * 机身内存
     */
    private String mobile_rom;

    public String getMobile_rom()
    {
        return mobile_rom;
    }

    public void setMobile_rom(String mobile_rom)
    {
        this.mobile_rom = mobile_rom;
    }
    //endregion

    //region 机身颜色
    /**
     * 机身颜色
     */
    private String mobile_color;

    public String getMobile_color()
    {
        return mobile_color;
    }

    public void setMobile_color(String mobile_color)
    {
        this.mobile_color = mobile_color;
    }
    //endregion

    //region 关联商品类型
    private JDGoodsType mobileGoodsType;

    public JDGoodsType getMobileGoodsType()
    {
        return mobileGoodsType;
    }

    public void setMobileGoodsType(JDGoodsType mobileGoodsType)
    {
        this.mobileGoodsType = mobileGoodsType;
    }
    //endregion

    //endregion

    //region toString

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("MobileGoods{");
        sb.append("mobile_os='").append(mobile_os).append('\'');
        sb.append(", mobile_memory='").append(mobile_memory).append('\'');
        sb.append(", mobile_frontCamera='").append(mobile_frontCamera).append('\'');
        sb.append(", mobile_news='").append(mobile_news).append('\'');
        sb.append(", mobile_backCamera='").append(mobile_backCamera).append('\'');
        sb.append(", mobile_battery='").append(mobile_battery).append('\'');
        sb.append(", mobile_rom='").append(mobile_rom).append('\'');
        sb.append(", mobile_color='").append(mobile_color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //endregion

    /*
    机身颜色
    机身内存
    电池
    商品编号
    价格
    手机系统
     */
}
