package qin.javaee8.hibernate.jd.domain;

import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.util.Date;

/**
 * 京东手机商城实体类
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/20
 */
@SuppressWarnings("all")
public class JDMobileGoods extends MobileGoods
{
    private static final long serialVersionUID = 2957066177497663432L;

    //region 重写父类方法

    @Override
    public Class getLogClass()
    {
        return JDMobileGoods.class;
    }

    public JDMobileGoods()
    {
        try
        {
            superInfo_logger_normal("正在初始化京东手机实体类构造函数");
        }
        catch (JavaEE8Exception e)
        {
            e.printStackTrace();
        }
    }

    //endregion

    //region 京东专属手机字段

    //region 是否推荐
    private Integer isRecommand;

    public Integer getIsRecommand()
    {
        return isRecommand;
    }

    public void setIsRecommand(Integer isRecommand)
    {
        this.isRecommand = isRecommand;
    }
    //endregion

    //region 库存
    private Long marketCount;

    public Long getMarketCount()
    {
        return marketCount;
    }

    public void setMarketCount(Long marketCount)
    {
        this.marketCount = marketCount;
    }
    //endregion

    //region 添加时间
    private Date addDate;

    public Date getAddDate()
    {
        return addDate;
    }

    public void setAddDate(Date addDate)
    {
        this.addDate = addDate;
    }
    //endregion

    //endregion
}