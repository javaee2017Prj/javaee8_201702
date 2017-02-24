package qin.javaee8.hibernate.jd.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qin.javaee8.core.dao.exceptions.HibernateDAOException;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.domain.JDGoodsType;
import qin.javaee8.hibernate.jd.dao.JDMobileDAO;
import qin.javaee8.hibernate.jd.domain.JDMobileGoods;
import qin.javaee8.hibernate.jd.service.JDMobileService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@Transactional
public class JDMobileServiceImpl implements JDMobileService
{
    private static final long serialVersionUID = 634819439309340123L;

    //region 注入京东手机数据访问层
    /**
     * 注入京东手机数据访问层
     */
    private JDMobileDAO jdMobileDAO;

    public JDMobileDAO getJdMobileDAO()
    {
        return jdMobileDAO;
    }

    @Resource
    public void setJdMobileDAO(JDMobileDAO jdMobileDAO)
    {
        this.jdMobileDAO = jdMobileDAO;
    }
    //endregion

    //region 一期功能实现

    //region 以集合形式显示所有手机信息

    /**
     * 以集合形式显示所有手机信息
     * <br>
     * 调用数据访问层实现(如果返回值是List就说明有记录, 否则就直接抛出
     * <code>{@link HibernateDAOException}</code>
     * 异常
     *
     * @return 以集合形式返回
     * @throws JavaEE8Exception 抛出JavaEE8大异常
     */
    @Override
    public List<JDMobileGoods> showALLMobileGoods() throws JavaEE8Exception
    {
        Object object = jdMobileDAO.findAllMobileGoods();

        List<JDMobileGoods> result = new ArrayList<>();

        //判断返回结果是不是List集合
        if (object instanceof List)
        {
            List<JDMobileGoods> mobileGoodsList = (List<JDMobileGoods>) object;
            if (mobileGoodsList.size() > 0)
            {
                result.addAll(mobileGoodsList);
            }
        }
        else
        {
            //否则返回空集合
            result = emptyList;
        }

        return result;
    }
    //endregion

    //region 显示所有商品类型信息

    /**
     * 显示所有商品类型信息(集合方式显示)
     *
     * @return 以集合方式来显示
     * @throws JavaEE8Exception
     */
    @Override
    public List<JDGoodsType> showAllGoodsType() throws JavaEE8Exception
    {
        Map<List<JDGoodsType>, StringBuilder> map = jdMobileDAO.showAllGoodsType();

        //获取key==>List<GoodsType>
        List<JDGoodsType> goodsTypeList = new ArrayList<>();

        if (map.size() > 0)
        {
            //将key转成Set并且放入List集合
            Set<List<JDGoodsType>> goodsTypeListSet = map.keySet();

            for (Iterator<List<JDGoodsType>> it = goodsTypeListSet.iterator(); it.hasNext(); )
            {
                List<JDGoodsType> myGoodsTypeList = it.next();

                for (Iterator<JDGoodsType> gIt = myGoodsTypeList.iterator(); gIt.hasNext(); )
                {
                    goodsTypeList.add(gIt.next());
                }
            }
        }
        else
        {
            goodsTypeList = emptyList;
        }

        return goodsTypeList;
    }
    //endregion

    //region html下拉框显示

    /**
     * html下拉框显示
     *
     * @return select下拉框
     * @throws JavaEE8Exception
     */
    @Override
    public StringBuilder showAllSelectGoodsType() throws JavaEE8Exception
    {
        Map<List<JDGoodsType>, StringBuilder> map = jdMobileDAO.showAllGoodsType();

        StringBuilder sb = new StringBuilder();

        if (map.size() > 0)
        {
            //将key转成Set并且放入List集合
            Set<List<JDGoodsType>> goodsTypeListSet = map.keySet();

            for (List<JDGoodsType> key : goodsTypeListSet) sb = map.get(key);
        }
        else
        {
            sb = new StringBuilder();
        }

        return sb;
    }
    //endregion

    //endregion
}