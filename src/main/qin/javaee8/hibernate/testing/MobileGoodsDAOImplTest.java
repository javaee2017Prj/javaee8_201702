package qin.javaee8.hibernate.testing;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.hibernate.dao.impl.MobileGoodsDAOImpl;
import qin.javaee8.hibernate.domain.GoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.util.Iterator;
import java.util.List;

import static qin.javaee8.hibernate.dao.MobileGoodsDAO.doNotSearchWhatStart;

/**
 * Created by Administrator on 2017/1/31 1-031-31.<br/>
 *
 * @author qinzhengying
 */
public class MobileGoodsDAOImplTest
{
    ApplicationContext applicationContext = new
              ClassPathXmlApplicationContext("applicationContext.xml");
    SessionFactory sessionFactory = (SessionFactory)
              applicationContext.getBean("sessionFactory");
    Session session = sessionFactory.openSession();

    //@Test
    public void searachNames()
    {
        List<MobileGoods> mobileGoodsList = session
                  .createQuery("from MobileGoods ")
                  .list();
        StringBuilder sb = new StringBuilder();

        for (Iterator<MobileGoods> it = mobileGoodsList.iterator(); it.hasNext(); )
        {
            MobileGoods m = it.next();
            sb.append(m.getId()).append("-------------").append(m.getGoods_name()).append("\n");
        }

        System.out.println(sb.toString());
    }

    @Test
    public void saveType()
    {
        GoodsType goodsType = new GoodsType("myOthers");
        session.save(goodsType);
        session.beginTransaction().commit();
    }

    @Test
    public void batchUpdateGoodsType() throws Exception
    {
        MobileGoodsDAOImpl m = (MobileGoodsDAOImpl) applicationContext.getBean("mobileGoodsDAOImpl");
        String[] mobileIds = new String[]{
                  "1", "39", "40", "46"
        };
        m.batchUpdateGoodsType(mobileIds, "苹果");
    }

    @Test
    public void testGoods()
    {
        MobileGoods m = (MobileGoods) session.get(MobileGoods.class, new Long(39));
        System.out.println(m.getMobileGoodsType().getGoods_typeName());
    }

    @Test
    public void batchUpdate2()
    {
        List<MobileGoods> mobileGoodsList = session
                  .createQuery("from MobileGoods ")
                  .list();
        for (Iterator<MobileGoods> it = mobileGoodsList.iterator(); it.hasNext(); )
        {
            MobileGoods m = it.next();
            m.setGoods_name(m.getGoods_name().trim());
            session.update(m);
        }

        session.beginTransaction().commit();
    }

    @Test
    public void searchTest()
    {
        List<MobileGoods> mobileGoodsList = session
                  .createQuery("from MobileGoods ")
                  .list();
        for (int i = 0; i < mobileGoodsList.size(); i++)
        {
            MobileGoods m = mobileGoodsList.get(i);
            String mobileGoodsName = m.getGoods_name();
            if (!mobileGoodsName.startsWith("苹果"))
            {
                System.out.println("===================================显示记录" + m.getId() + "===================================");
            }
        }
    }

    @Test
    public void hibernateHighTest()
    {
        Criteria c = session.createCriteria(MobileGoods.class);
        System.out.println(c.list().size());
    }

    @Test
    public void daoTest2() throws Exception
    {
        String s = "-----------";
        MobileGoodsDAOImpl m = (MobileGoodsDAOImpl)
                  applicationContext.getBean("mobileGoodsDAOImpl");
        List<MobileGoods> mobileGoodsList = m.search_mobileGoodsStart("苹果", doNotSearchWhatStart);
        for (Iterator<MobileGoods> it = mobileGoodsList.iterator(); it.hasNext(); )
        {
            MobileGoods mobileGoods = it.next();
            System.out.println(mobileGoods.getId() + s + mobileGoods.getGoods_name() +
                                         s + mobileGoods.getMobileGoodsType().getGoods_typeName());
        }
    }

    @Test
    public void jspTest1()
    {
        List<GoodsType> goodsTypeList = session
                  .createQuery("from GoodsType where parentGoodsType.id=149")
                  .list();
        Object obj = 0;
    }

    @Test
    public void saveType1()
    {
        GoodsType goodsType = (GoodsType)
                  session.get(GoodsType.class, new Integer(1326));
        GoodsType parent = (GoodsType)
                  session.get(GoodsType.class, new Integer(149));
        goodsType.setParentGoodsType(parent);
        parent.getChildrenSet().add(goodsType);

        session.update(goodsType);
        session.update(parent);

        session.beginTransaction().commit();
    }

}












