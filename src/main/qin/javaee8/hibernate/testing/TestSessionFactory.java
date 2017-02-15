package qin.javaee8.hibernate.testing;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSessionFactory
{

    public SessionFactory sessionFactory = (SessionFactory) new
              ClassPathXmlApplicationContext("applicationContext.xml")
              .getBean("sessionFactory");


    @org.junit.Test
    public void make()
    {
    }
}