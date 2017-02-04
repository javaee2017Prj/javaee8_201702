package qin.hibernate.goodstype.saveData;

import org.junit.Test;
import qin.hibernate.BasicTest;
import qin.javaee8.hibernate.domain.GoodsType;

import java.util.HashSet;
import java.util.Set;

public class SaveAllGoodsType extends BasicTest
{
    @Test
    public void saveMobileGoodsType()
    {
        GoodsType mobileParent = new GoodsType("手机");
        //保存名牌手机一共5个
        //苹果 小米 vivo oppo 华为
        GoodsType appleType = new GoodsType("手机\\苹果");
        appleType.setParentGoodsType(mobileParent);
        GoodsType xiaomoType = new GoodsType("手机\\小米");
        xiaomoType.setParentGoodsType(mobileParent);
        GoodsType vivoType = new GoodsType("vivo");
        vivoType.setParentGoodsType(mobileParent);
        GoodsType oppoType = new GoodsType("oppo");
        oppoType.setParentGoodsType(mobileParent);
        GoodsType huaweiType = new GoodsType("手机\\华为");
        huaweiType.setParentGoodsType(mobileParent);

        Set<GoodsType> childrenSet = new HashSet<>();
        childrenSet.add(appleType);
        childrenSet.add(xiaomoType);
        childrenSet.add(vivoType);
        childrenSet.add(oppoType);
        childrenSet.add(huaweiType);

        session.save(appleType);
        session.save(xiaomoType);
        session.save(vivoType);
        session.save(oppoType);
        session.save(huaweiType);
        session.save(mobileParent);
        transaction.commit();
    }
}