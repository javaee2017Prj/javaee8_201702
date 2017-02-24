package qin.javaee8.hibernate.jd;

@SuppressWarnings("all")
public class JDMobileEasyUI
{
    //region 搜索界面的下拉框

    /**
     * 类型
     */
    public String search_mobileType;

    /**
     * 价格
     */
    public String search_mobilePrice;

    /**
     * 运行内存
     */
    public String search_mobileMemory;

    /**
     * 机身内存
     */
    public String search_mobileROM;

    /**
     * 电池容量
     */
    public String search_mobileBattery;

    /**
     * 后置摄像头
     */
    public String search_mobileBackCamera;

    /**
     * 前置摄像头
     */
    public String search_mobileFrontCamera;

    /**
     * 机身颜色
     */
    public String search_mobileColor;

    public String getSearch_mobileType()
    {
        return search_mobileType;
    }

    public void setSearch_mobileType(String search_mobileType)
    {
        this.search_mobileType = search_mobileType;
    }

    public String getSearch_mobilePrice()
    {
        return search_mobilePrice;
    }

    public void setSearch_mobilePrice(String search_mobilePrice)
    {
        this.search_mobilePrice = search_mobilePrice;
    }

    public String getSearch_mobileMemory()
    {
        return search_mobileMemory;
    }

    public void setSearch_mobileMemory(String search_mobileMemory)
    {
        this.search_mobileMemory = search_mobileMemory;
    }

    public String getSearch_mobileROM()
    {
        return search_mobileROM;
    }

    public void setSearch_mobileROM(String search_mobileROM)
    {
        this.search_mobileROM = search_mobileROM;
    }

    public String getSearch_mobileBattery()
    {
        return search_mobileBattery;
    }

    public void setSearch_mobileBattery(String search_mobileBattery)
    {
        this.search_mobileBattery = search_mobileBattery;
    }

    public String getSearch_mobileBackCamera()
    {
        return search_mobileBackCamera;
    }

    public void setSearch_mobileBackCamera(String search_mobileBackCamera)
    {
        this.search_mobileBackCamera = search_mobileBackCamera;
    }

    public String getSearch_mobileFrontCamera()
    {
        return search_mobileFrontCamera;
    }

    public void setSearch_mobileFrontCamera(String search_mobileFrontCamera)
    {
        this.search_mobileFrontCamera = search_mobileFrontCamera;
    }

    public String getSearch_mobileColor()
    {
        return search_mobileColor;
    }

    public void setSearch_mobileColor(String search_mobileColor)
    {
        this.search_mobileColor = search_mobileColor;
    }
    //endregion

    //region toString

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("JDMobileEasyUI{");
        sb.append("search_mobileType='").append(search_mobileType).append('\'');
        sb.append(", search_mobilePrice='").append(search_mobilePrice).append('\'');
        sb.append(", search_mobileMemory='").append(search_mobileMemory).append('\'');
        sb.append(", search_mobileROM='").append(search_mobileROM).append('\'');
        sb.append(", search_mobileBattery='").append(search_mobileBattery).append('\'');
        sb.append(", search_mobileBackCamera='").append(search_mobileBackCamera).append('\'');
        sb.append(", search_mobileFrontCamera='").append(search_mobileFrontCamera).append('\'');
        sb.append(", search_mobileColor='").append(search_mobileColor).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //endregion
}