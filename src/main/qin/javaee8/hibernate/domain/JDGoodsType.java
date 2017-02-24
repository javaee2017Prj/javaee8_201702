package qin.javaee8.hibernate.domain;

import qin.javaee8.core.JavaEE8BaseSupportImpl;
import qin.javaee8.core.SuperEntity8;
import qin.javaee8.exceptions.LogClassException;
import qin.javaee8.exceptions.LogException;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_goodsType8")
@SuppressWarnings("all")
public class JDGoodsType
          extends JavaEE8BaseSupportImpl
          implements SuperEntity8<Integer>
{
    private static final long serialVersionUID = 8691972996048790501L;

    //region 主键
    private Integer id;

    @Override
    @Id
    @GeneratedValue
    @Column(name = "goods_pk")
    public Integer getId()
    {
        return id;
    }

    @Override
    public void setId(Integer id)
    {
        this.id = id;
    }
    //endregion

    //region 名称
    /**
     * 名称
     */
    private String goods_typeName;

    @Column(length = 40, unique = true)
    public String getGoods_typeName()
    {
        return goods_typeName;
    }

    public void setGoods_typeName(String goods_typeName)
    {
        this.goods_typeName = goods_typeName;
    }
    //endregion

    //region 描述
    /**
     * 描述
     */
    private String goods_typeDescription;

    @Column(length = 5000)
    public String getGoods_typeDescription()
    {
        return goods_typeDescription;
    }

    public void setGoods_typeDescription(String goods_typeDescription)
    {
        this.goods_typeDescription = goods_typeDescription;
    }
    //endregion

    //region 上级类型
    /**
     * 上级类型
     */
    private JDGoodsType parentGoodsType;

    @ManyToOne(targetEntity = JDGoodsType.class, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "goodsType_parentId", foreignKey = @ForeignKey(name = "fk_parent"))
    public JDGoodsType getParentGoodsType()
    {
        return parentGoodsType;
    }

    public void setParentGoodsType(JDGoodsType parentGoodsType)
    {
        this.parentGoodsType = parentGoodsType;
    }
    //endregion

    //region 下级分类
    /**
     * 下级分类
     */
    private Set<JDGoodsType> childrenSet = new HashSet<>();

    @OneToMany(targetEntity = JDGoodsType.class, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinTable
              (
                        name = "goodstype_childrenSet",
                        joinColumns = @JoinColumn(name = "goodsType_childrenSet", foreignKey = @ForeignKey(name = "fk_children"))
              )
    public Set<JDGoodsType> getChildrenSet()
    {
        return childrenSet;
    }

    public void setChildrenSet(Set<JDGoodsType> childrenSet)
    {
        this.childrenSet = childrenSet;
    }
    //endregion

    //region 构造函数

    @Transient
    @Override
    public Class getLogClass()
    {
        return JDGoodsType.class;
    }

    public JDGoodsType()
    {
        try
        {
            superInfo_logger_normal(">>>>正在初始化商品类型实体类默认构造函数<<<<");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public JDGoodsType(String goods_typeName)
    {
        this.goods_typeName = goods_typeName;
        try
        {
            superInfo_logger_normal(">>>>正在初始化商品类型实体类构造函数:类型名称为<<<<" + goods_typeName);
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

    //region 关联手机商品
    private Set<MobileGoods> mobileGoodsSet = new HashSet<>();

    @OneToMany(targetEntity = MobileGoods.class, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinTable
              (
                        name = "mobileGoodsSet_goodsType",
                        joinColumns = @JoinColumn(name = "goodsType_mobileSet", foreignKey = @ForeignKey(name = "fk_mobileGoodsSet"))
              )
    public Set<MobileGoods> getMobileGoodsSet()
    {
        return mobileGoodsSet;
    }

    public void setMobileGoodsSet(Set<MobileGoods> mobileGoodsSet)
    {
        this.mobileGoodsSet = mobileGoodsSet;
    }
    //endregion

}