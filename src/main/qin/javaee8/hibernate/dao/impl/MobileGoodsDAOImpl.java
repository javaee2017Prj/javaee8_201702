package qin.javaee8.hibernate.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import qin.javaee8.core.dao.impl.DAOSupport8Impl;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.exceptions.LogClassException;
import qin.javaee8.exceptions.LogException;
import qin.javaee8.hibernate.dao.MobileGoodsDAO;
import qin.javaee8.hibernate.domain.JDGoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 手机商品数据访问层实现类
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/1/31
 */
//@Repository
@SuppressWarnings("all")
public class MobileGoodsDAOImpl
          extends DAOSupport8Impl<MobileGoods, Long>
          implements MobileGoodsDAO
{
    private static final long serialVersionUID = -1692140088652296430L;

    //region 构造函数
    public MobileGoodsDAOImpl()
    {
        try
        {
            superInfo_logger_normal("=========正在初始化手机商品数据访问层实现类=========");
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

    //region 查询所有商品类型

    /**
     * 查询所有商品类型
     *
     * @return 查询商品类型结果集合
     * @throws Exception 查询失败抛出异常
     */
    @Override
    public List<JDGoodsType> findAllGoodsTypes() throws Exception
    {
        //当什么时候抛出异常很简单, 只有当查询结果条数为0时抛出异常
        Session session = null;
        List<JDGoodsType> goodsTypeList = new ArrayList<>();

        try
        {
            session = getSessionFactory().openSession();
            //查询
            goodsTypeList = session.createQuery("from JDGoodsType ").list();

            //如果查询结果为空抛出异常
            if (goodsTypeList.size() == 0) throw new JavaEE8Exception("查询结果为空!查询商品类型错误!");
        }
        finally
        {
            session.close();
            return goodsTypeList;
        }
    }
    //endregion

    //region 查询所有手机商品信息

    /**
     * 查询所有手机商品信息
     *
     * @return 所有手机信息集合(目前是1345条数据)
     * @throws Exception
     */
    @Override
    public List<MobileGoods> findAllGoods() throws Exception
    {
        //当什么时候抛出异常很简单, 只有当查询结果条数为0时抛出异常
        Session session = null;
        List<MobileGoods> mobileGoodsList = new ArrayList<>();

        try
        {
            session = getSessionFactory().openSession();
            //查询
            mobileGoodsList = session.createQuery("from MobileGoods ").list();

            //如果查询结果为空抛出异常
            if (mobileGoodsList.size() == 0) throw new JavaEE8Exception("查询结果为空!查询手机商品信息错误!");
        }
        finally
        {
            //session.close();
            return mobileGoodsList;
        }
    }
    //endregion

    //region 批量修改商品类型信息

    /**
     * 批量修改商品类型信息<br>
     * 根据主键和商品类型来进行修改
     *
     * @param mobileGoodsIds       手机商品主键
     * @param html_mobileGoodsType 需要修改的商品类型
     * @return
     * @throws Exception
     */
    @Override
    public String batchUpdateGoodsType(String[] mobileGoodsIds, String html_mobileGoodsType) throws Exception
    {
        String msg = "";
        Session session = null;

        try
        {
            session = getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            //1.查询商品类型
            JDGoodsType mobileType = (JDGoodsType) session
                      .createQuery
                                (
                                          new StringBuilder()
                                                    .append("from GoodsType where goods_typeName='")
                                                    .append(html_mobileGoodsType)
                                                    .append("'").toString()
                                )
                      .list().get(0);
            //2.设置商品类型(首先获取手机商品)
            for (int i = 0; i < mobileGoodsIds.length; i++)
            {
                //转换主键
                Long mobileId = Long.valueOf(mobileGoodsIds[i]);
                //是否转换成功
                if (mobileId == null) throw new JavaEE8Exception("商品主键转换失败!");
                //否则就是转化成功了
                //查找
                MobileGoods mobileGoods = (MobileGoods) session.get(MobileGoods.class, mobileId);
                //修改类型
                mobileGoods.setMobileGoodsType(mobileType);
                mobileType.getMobileGoodsSet().add(mobileGoods);
                session.update(mobileGoods);
                session.update(mobileType);
            }

            transaction.commit();
        }
        finally
        {
            session.close();
            return msg;
        }
    }
    //endregion

    //region 根据jsp页面传回来的操作来查找

    @Override
    public List<MobileGoods> search_mobileGoodsStart(String mobileGoodsStart, String jspOperator)
              throws Exception
    {
        //首先新建一个集合查询出手机商品信息里的所有记录
        //然后建立一个新的集合用于存放开头信息含有这指定字符的手机商品信息
        List<MobileGoods> resultList = new ArrayList<>();

        //用两个包含和不包含的list来实现
        //根据jspOperator操作符来实现, 如果接收的字符串是包含则返回第一个包含list
        //如果是不包含则返回第二个字符串
        List<MobileGoods> mobileGoodsList1 = new ArrayList<>();
        List<MobileGoods> mobileGoodsList2 = new ArrayList<>();

        try
        {
            Session session = getSessionFactory().openSession();
            //查询所有手机商品信息的记录
            List<MobileGoods> mobileGoodsList = session.createCriteria(MobileGoods.class).list();
            for (Iterator<MobileGoods> it = mobileGoodsList.iterator(); it.hasNext(); )
            {
                MobileGoods m = it.next();
                String mobileGoodsName = m.getGoods_name();
                //查看前两个字符是否等于接收的开头字符串
                if (mobileGoodsName.startsWith(mobileGoodsStart))
                {
                    mobileGoodsList1.add(m);
                }
                //不等于
                else
                {
                    mobileGoodsList2.add(m);
                }
            }

            //根据jspOperator判断
            if (jspOperator == searchWhatStart)
            {
                resultList.addAll(mobileGoodsList1);
            }
            else
            {
                resultList.addAll(mobileGoodsList2);
            }
        }
        catch (Exception ex)
        {
            resultList = emptyList;
            throw new JavaEE8Exception("查询指定字符串集合为空!" + ex);
        }
        finally
        {
            return resultList;
        }
    }

    //endregion

    //region 查询苹果
    @Override
    public List<MobileGoods> searchAppleInfo() throws Exception
    {
        List<MobileGoods> resultList = new ArrayList<>();

        try
        {
            Session session = getSessionFactory().openSession();
            //查询所有手机商品信息的记录
            List<MobileGoods> mobileGoodsList = session.createCriteria(MobileGoods.class).list();
            for (Iterator<MobileGoods> it = mobileGoodsList.iterator(); it.hasNext(); )
            {
                MobileGoods m = it.next();
                String mobileGoodsName = m.getGoods_name();
                //查看前两个字符是否等于接收的开头字符串
                if (!mobileGoodsName.startsWith("苹果")) resultList.add(m);
            }
        }
        catch (Exception ex)
        {
            resultList = emptyList;
            throw new JavaEE8Exception("异常:!" + ex);
        }
        finally
        {
            return resultList;
        }
    }
    //endregion
}