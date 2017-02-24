package qin.javaee8.hibernate.dao;

import qin.javaee8.core.dao.DAOSupport8;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.domain.JDGoodsType;

import java.io.Serializable;

@SuppressWarnings("all")
public interface MobileBatchAddGoodsTypeDAO extends DAOSupport8<JDGoodsType, Integer>
{
    //region 新增商品类型

    /**
     * 改善版的新增商品类型实现类<br>
     *
     * @param htmlGoodsTypeParent       上级分类
     * @param htmlGoodsTypeName_        上级名称
     * @param htmlGoodsTypeDescription_ 上级描述
     * @return 添加结果
     * @throws JavaEE8Exception 抛出JavaEE8大异常
     */
    Serializable addGoodsType(String htmlGoodsTypeParent,
                              String htmlGoodsTypeName_, String htmlGoodsTypeDescription_) throws JavaEE8Exception;
    //endregion
}