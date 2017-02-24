package qin.jd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBasicTest
{
    public <T> T getBean(String beanName)
    {
        return (T) new ClassPathXmlApplicationContext("applicationContext.xml")
                  .getBean(beanName);
    }
}