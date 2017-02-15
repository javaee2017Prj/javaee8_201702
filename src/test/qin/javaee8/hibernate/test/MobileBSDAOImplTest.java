package qin.javaee8.hibernate.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.hibernate.dao.impl.MobileBSDAOImpl;

/**
 * Created by Administrator on 2017/2/13 2-013-13.<br/>
 *
 * @author qinzhengying
 */
public class MobileBSDAOImplTest
{
    MobileBSDAOImpl m = (MobileBSDAOImpl) new
              ClassPathXmlApplicationContext("applicationContext.xml")
              .getBean("bsMobileDAOImpl8");

    /*
public Serializable addGoodsType(String htmlGoodsTypeParent, String htmlGoodsTypeName_,
                                     String htmlGoodsTypeDescription_) throws SameResultException, GoodsTypeNULLException
     */
    //582
    @Test
    public void addGoodsType() throws Exception
    {
        //1.上级为空并且新增多个类型名称

       /* String htmlGoodsTypeName_ = "电脑\\台式机<br>电脑\\一体机";
        String htmlGoodsTypeDescription_ = BeanFactory.class.toString();

        m.addGoodsType("", htmlGoodsTypeName_, htmlGoodsTypeDescription_);*/

        //2.上级为空并且新增一个类型名称

        /*String htmlGoodsTypeName_ = "电脑\\微星台式机";
        String htmlGoodsTypeDescription_ = BeanFactory.class.toString();

        m.addGoodsType("", htmlGoodsTypeName_, htmlGoodsTypeDescription_);*/

        //3.上级不为空并且新增多个类型名称
        String parentGoodsType = "电脑办公";

        String htmlGoodsTypeName_ = "电脑\\微星台式机<br>电脑\\微星台式机2";
        String htmlGoodsTypeDescription_ = BeanFactory.class.toString();

        m.addGoodsType(parentGoodsType, htmlGoodsTypeName_, htmlGoodsTypeDescription_);

        //4.上级不为空并且新增一个类型名称
    }

}


























