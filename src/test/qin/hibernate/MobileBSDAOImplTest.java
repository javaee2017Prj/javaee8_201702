package qin.hibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.hibernate.dao.MobileBSDAO;

@SuppressWarnings("all")
public class MobileBSDAOImplTest
{
    //bsMobileDAOImpl8
    MobileBSDAO m = (MobileBSDAO) new
              ClassPathXmlApplicationContext("applicationContext.xml")
              .getBean("bsMobileDAOImpl8");

    @org.junit.Test
    public void addTest() throws Exception
    {
        /*
        addGoodsType(Boolean isHasParent, String htmlGoodsTypeParent,
                                     String htmlGoodsTypeDescription_, String htmlGoodsTypeName_)
         */
        m.addGoodsType(true, "电脑办公", BeanFactory.class.toString(), "电脑办公\\微星台式机");
    }
}