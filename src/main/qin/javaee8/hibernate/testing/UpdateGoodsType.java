package qin.javaee8.hibernate.testing;

import org.junit.Test;
import qin.javaee8.hibernate.domain.GoodsType;

public class UpdateGoodsType extends MyTest
{
    @Test
    public void update85()
    {
        GoodsType goodsType = (GoodsType)
                  session.createQuery("from GoodsType where id=1097")
                            .list().get(0);
        goodsType.setGoods_typeName("面部护肤\\卸妆");
        session.update(goodsType);

        transaction.commit();
    }
}