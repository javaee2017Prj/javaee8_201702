package qin.javaee8.hibernate.test;

import org.junit.Test;
import qin.javaee8.hibernate.domain.MobileGoods;
import qin.javaee8.hibernate.testing.MyTest;

import java.util.Iterator;
import java.util.List;

public class MobileGoodsDAOImplTest1 extends MyTest
{
    @Test
    public void t1()
    {
        List<MobileGoods> mobileGoodsList = session.createCriteria(MobileGoods.class).list();

        for (Iterator<MobileGoods> it = mobileGoodsList.iterator(); it.hasNext(); )
        {
            MobileGoods m = it.next();
            if (m.getGoods_name().startsWith("苹果"))
            {
                System.out.println(m.getGoods_name());
            }
        }

        /*GoodsType goodsType = new GoodsType("垃圾分类");
        session.save(goodsType);
        transaction.commit();*/
    }

}