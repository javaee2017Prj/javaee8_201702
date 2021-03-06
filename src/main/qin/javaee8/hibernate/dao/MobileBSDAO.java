package qin.javaee8.hibernate.dao;

import qin.javaee8.core.dao.DAOSupport8;
import qin.javaee8.core.dao.exceptions.GoodsTypeNULLException;
import qin.javaee8.core.dao.exceptions.HibernateDAOException;
import qin.javaee8.core.dao.exceptions.SameResultException;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.domain.JDGoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 改进版的手机商品数据访问层(bootstrap版本的)
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/4
 */
@SuppressWarnings("all")
public interface MobileBSDAO extends DAOSupport8<MobileGoods, Long>
{
    //region 一期功能

    //-------------------------------------------since 2017/2/5

    //region 手机商品信息在表中一共有多少条

    /**
     * 手机商品信息在表中一共有多少条
     *
     * @return 条数
     * @throws HibernateDAOException 发生了数据访问层里的错误
     */
    default Integer mobileGoodsSize() throws HibernateDAOException
    {
        return findAll().size();
    }
    //endregion

    //region 批量新增商品

    /**
     * 批量新增商品
     *
     * @param goods     批量商品实体类
     * @param goodsType 根据商品来新增
     * @return 返回回调的方法
     * @throws SameResultException 如果出现相同的商品名称则抛出异常
     */
    Object batchAddMobileGoods(String goodsType, MobileGoods... goods)
              throws SameResultException, GoodsTypeNULLException;

    //endregion

    //region 批量删除手机商品

    /**
     * 批量删除手机商品
     *
     * @param mobileGoods 批量手机商品实体
     * @return
     */
    Object batchDeleteMobileGoods(MobileGoods... mobileGoods);
    //endregion

    //region 批量修改手机类型

    /**
     * 批量修改手机类型
     *
     * @param type        手机类型
     * @param mobileGoods 手机商品
     * @return
     * @throws JavaEE8Exception 抛出大异常
     */
    Object batchUpdateMobileGoodsType(JDGoodsType type, MobileGoods... mobileGoods)
              throws JavaEE8Exception;

    //endregion

    //region 根据商品名称查找商品

    /**
     * 根据商品名称查找商品
     *
     * @param goods_name 商品名称
     * @return 键返回商品集合, 值返回查找记录数
     */
    Map<List<MobileGoods>, Integer> findMobileGoodsByName(String goods_name);
    //endregion

    //-------------------------------------------since 2017/2/5

    //endregion

    //region 二期功能

    //region 查询所有手机商品类型

    /**
     * 查询所有手机商品类型
     *
     * @return 类型集合
     */
    List<JDGoodsType> getAllMobileGoodsType();
    //endregion

    //region 获取所有手机类型名字

    /**
     * 获取所有手机类型名字
     *
     * @return
     */
    default List<String> getAllMobileGoodsTypeNames()
    {
        List<String> resultList = new ArrayList<>();

        getAllMobileGoodsType().forEach
                  (
                            e ->
                            {
                                resultList.add(e.getGoods_typeName());
                            }
                  );

        return resultList;
    }

    //endregion

    //region 新增商品类型

    /**
     * 新增商品类型
     *
     * @param htmlGoodsTypeParent       商品上级分类select下拉框
     * @param htmlGoodsTypeName_        商品上级分类名称
     * @param htmlGoodsTypeDescription_ 商品上级描述
     * @return 新增结果
     * @throws SameResultException    如果类型存在抛出异常
     * @throws GoodsTypeNULLException 如果上级商品类型为空则抛出异常
     */
    @Deprecated
    Serializable addGoodsType(String htmlGoodsTypeParent, String htmlGoodsTypeName_,
                              String htmlGoodsTypeDescription_) throws JavaEE8Exception;

    /**
     * 改善版的新增商品类型
     *
     * @param isHasParent               此商品类型是否具有上级类型
     * @param htmlGoodsTypeParent       如果有则接收此上级类型
     * @param htmlGoodsTypeDescription_ 上级类型描述
     * @param htmlGoodsTypeName_        上级类型名称添加
     * @return 添加结果类型
     * @throws JavaEE8Exception 如果添加失败抛出大异常
     */
    Serializable addGoodsType(Boolean isHasParent, String htmlGoodsTypeParent, String htmlGoodsTypeDescription_,
                              String htmlGoodsTypeName_) throws JavaEE8Exception;
    //endregion

    //region 获取所有名字下拉框数据

    /**
     * 获取所有名字下拉框数据
     *
     * @return
     */
    default String getAllGoodsTypeSelect()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("<option value=\"\">请选择</option>");

        List<JDGoodsType> goodsTypeList = getAllMobileGoodsType();

        for (int i = 0; i < goodsTypeList.size(); i++)
        {
            JDGoodsType goodsType = goodsTypeList.get(i);
            sb.append("<option value=\"\">" + goodsType.getGoods_typeName() + "</option>");
        }

        return sb.toString();
    }
    //endregion

    //endregion
}