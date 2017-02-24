package qin.javaee8.hibernate.jd.domain;

import qin.javaee8.core.JavaEE8BaseSupportImpl;
import qin.javaee8.core.SuperEntity8;
import qin.javaee8.exceptions.JavaEE8Exception;

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

/**
 * 京东手机类型实体类
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/20
 */
@Entity
@Table(name = "jd_JDGoodsType8")
@SuppressWarnings("all")
public class JDGoodsType extends JavaEE8BaseSupportImpl implements SuperEntity8<Integer>
{
    private static final long serialVersionUID = -6947863482473984034L;

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
    private JDGoodsType parentJDGoodsType;

    @ManyToOne(targetEntity = JDGoodsType.class, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "JDGoodsType_parentId", foreignKey = @ForeignKey(name = "fk_parent"))
    public JDGoodsType getParentJDGoodsType()
    {
        return parentJDGoodsType;
    }

    public void setParentJDGoodsType(JDGoodsType parentJDGoodsType)
    {
        this.parentJDGoodsType = parentJDGoodsType;
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
                        name = "JD_GoodsType_childrenSet",
                        joinColumns = @JoinColumn(name = "JDGoodsType_childrenSet", foreignKey = @ForeignKey(name = "fk_children"))
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
        catch (JavaEE8Exception e)
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
        catch (JavaEE8Exception ex)
        {
            ex.printStackTrace();
        }
    }
    //endregion
}