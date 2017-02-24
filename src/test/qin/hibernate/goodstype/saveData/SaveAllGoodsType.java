package qin.hibernate.goodstype.saveData;

import org.junit.Test;
import qin.hibernate.BasicTest;
import qin.javaee8.hibernate.domain.JDGoodsType;

import java.util.HashSet;
import java.util.Set;

public class SaveAllGoodsType extends BasicTest
{
    @Test
    public void saveMobileGoodsType()
    {
        JDGoodsType mobileParent = new JDGoodsType("手机");
        //保存名牌手机一共5个
        //苹果 小米 vivo oppo 华为
        JDGoodsType appleType = new JDGoodsType("手机\\苹果");
        appleType.setParentGoodsType(mobileParent);
        JDGoodsType xiaomoType = new JDGoodsType("手机\\小米");
        xiaomoType.setParentGoodsType(mobileParent);
        JDGoodsType vivoType = new JDGoodsType("vivo");
        vivoType.setParentGoodsType(mobileParent);
        JDGoodsType oppoType = new JDGoodsType("oppo");
        oppoType.setParentGoodsType(mobileParent);
        JDGoodsType huaweiType = new JDGoodsType("手机\\华为");
        huaweiType.setParentGoodsType(mobileParent);

        Set<JDGoodsType> childrenSet = new HashSet<>();
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