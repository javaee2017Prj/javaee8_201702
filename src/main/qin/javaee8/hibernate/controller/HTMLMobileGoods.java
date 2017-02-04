package qin.javaee8.hibernate.controller;

/**
 * 接收界面html控件值
 */
public class HTMLMobileGoods
{
    //region 商品类型
    private String HTMLMobileGoodsType;

    public String getHTMLMobileGoodsType()
    {
        return HTMLMobileGoodsType;
    }

    public void setHTMLMobileGoodsType(String HTMLMobileGoodsType)
    {
        this.HTMLMobileGoodsType = HTMLMobileGoodsType;
    }
    //endregion

    //region 商品主键
    private String htmlMobileGoodsId;

    public String getHtmlMobileGoodsId()
    {
        return htmlMobileGoodsId;
    }

    public void setHtmlMobileGoodsId(String htmlMobileGoodsId)
    {
        this.htmlMobileGoodsId = htmlMobileGoodsId;
    }

    //endregion

    //region 查询以什么开头
    private String mobileGoodsStart;

    public String getMobileGoodsStart()
    {
        return mobileGoodsStart;
    }

    public void setMobileGoodsStart(String mobileGoodsStart)
    {
        this.mobileGoodsStart = mobileGoodsStart;
    }
    //endregion

    //region 按钮操作
    private String jspOperator;

    public String getJspOperator()
    {
        return jspOperator;
    }

    public void setJspOperator(String jspOperator)
    {
        this.jspOperator = jspOperator;
    }
    //endregion
}