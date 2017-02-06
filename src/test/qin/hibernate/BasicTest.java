package qin.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.hibernate.testing.MyTest;

public class BasicTest extends MyTest
{
    public ApplicationContext applicationContext = new
            ClassPathXmlApplicationContext("applicationContext.xml");
}