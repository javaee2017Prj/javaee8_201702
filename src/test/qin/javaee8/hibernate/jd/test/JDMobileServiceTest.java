package qin.javaee8.hibernate.jd.test;

import org.junit.Test;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.hibernate.jd.service.JDMobileService;
import qin.jd.JDBasicTest;

public class JDMobileServiceTest extends JDBasicTest implements JavaEE8BaseSupport
{
    JDMobileService jdMobileService = getBean("JDMobileServiceImpl");

    @Override
    public Class getLogClass()
    {
        return JDMobileServiceTest.class;
    }

    @Test
    public void showALLMobileGoods() throws Exception
    {
        jdMobileService.showALLMobileGoods();
    }

    @Test
    public void showAllGoodsType() throws Exception
    {
        superInfo_logger_normal(jdMobileService.showAllGoodsType());
        Object obj = 0;
    }

    @Test
    public void showAllSelectGoodsType() throws Exception
    {
        superInfo_logger_normal(jdMobileService.showAllSelectGoodsType());
        Object obj = 0;
    }

}