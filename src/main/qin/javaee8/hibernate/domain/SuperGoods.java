package qin.javaee8.hibernate.domain;


import qin.javaee8.core.JavaEE8BaseSupportImpl;
import qin.javaee8.core.SuperEntity8;
import qin.javaee8.exceptions.LogClassException;
import qin.javaee8.exceptions.LogException;

import java.util.Map;
import java.util.TreeMap;

/**
 * 商品父类
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public class SuperGoods extends JavaEE8BaseSupportImpl implements SuperEntity8<Long>
{
    private static final long serialVersionUID = 1298751317225015173L;

    //region 主键
    private Long id;

    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId(Long id)
    {
        this.id = id;
    }
    //endregion

    //region 商品必备属性

    //region 商品编号
    /**
     * 商品编号
     */
    private Integer goods_number;

    public Integer getGoods_number()
    {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number)
    {
        this.goods_number = goods_number;
    }
    //endregion

    //region 名称
    /**
     * 名称
     */
    private String goods_name;

    public String getGoods_name()
    {
        return goods_name;
    }

    public void setGoods_name(String goods_name)
    {
        this.goods_name = goods_name;
    }
    //endregion

    //region 价格
    /**
     * 价格
     */
    private Double goods_price;

    public Double getGoods_price()
    {
        return goods_price;
    }

    public void setGoods_price(Double goods_price)
    {
        this.goods_price = goods_price;
    }
    //endregion

    //region 描述
    /**
     * 描述
     */
    private String goods_description;

    public String getGoods_description()
    {
        return goods_description;
    }

    public void setGoods_description(String goods_description)
    {
        this.goods_description = goods_description;
    }
    //endregion

    //region 对应图片
    private Map<Integer, String> imagesMap = new TreeMap<>();

    public Map<Integer, String> getImagesMap()
    {
        return imagesMap;
    }

    public void setImagesMap(Map<Integer, String> imagesMap)
    {
        this.imagesMap = imagesMap;
    }
    //endregion

    //endregion

    //region 构造函数


    @Override
    public Class getLogClass()
    {
        return SuperGoods.class;
    }

    public SuperGoods()
    {
        try
        {
            superInfo_logger_normal(">>>>正在初始化商品默认构造函数<<<<");
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

    public SuperGoods(Integer goods_number, String goods_name, Double goods_price,
                      String goods_description, Map<Integer, String> imagesMap)
    {
        this.goods_number = goods_number;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
        this.goods_description = goods_description;
        this.imagesMap = imagesMap;
    }
    //endregion
}