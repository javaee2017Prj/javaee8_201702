package qin.javaee8.hibernate.testing;

import qin.javaee8.hibernate.domain.GoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;
import qin.javaee8.hibernate.tools.HuaWeiImages;
import qin.javaee8.hibernate.tools.HuaWeiNames;
import qin.javaee8.hibernate.tools.MeiZuImages;
import qin.javaee8.hibernate.tools.MeiZuNames;
import qin.javaee8.hibernate.tools.OppoGoodsImages;
import qin.javaee8.hibernate.tools.OppoGoodsNames;
import qin.javaee8.hibernate.tools.XiaoMiImagesI;
import qin.javaee8.hibernate.tools.XiaoMiNamesI;

import java.util.Map;
import java.util.TreeMap;

import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BACK_CAMERA_BETWEEN_1200_1999;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BACK_CAMERA_BETWEEN_500_1199;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BACK_CAMERA_HIGHER_200;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BACK_CAMERA_OTHERS;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BATTERY_BETWEEN_1200_1999;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BATTERY_BETWEEN_2000_2999;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BATTERY_BETWEEN_3000_3999;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BATTERY_BETWEEN_4000_5999;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BATTERY_HIGHER_6000;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BATTERY_HIGHER_OTHERS;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_BATTERY_LOWER1200;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_COLOR_BLACK;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_COLOR_GOLD;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_COLOR_GRAY;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_COLOR_OTHERS;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_COLOR_PINK;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_COLOR_RED;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_COLOR_SILVIER;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_COLOR_WHITE;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_FRONT_CAMERA_BELOW_120;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_FRONT_CAMERA_BETWEEN_120_199;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_FRONT_CAMERA_BETWEEN_200_499;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_FRONT_CAMERA_BETWEEN_500_799;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_FRONT_CAMERA_BETWEEN_800_1599;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_FRONT_CAMERA_HIGHER1600;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_FRONT_CAMERA_OTHER;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_ROM_128;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_ROM_16;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_ROM_32;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_ROM_64;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_ROM_8;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_ROM_NO;
import static qin.javaee8.hibernate.domain.MobileProperty.MOBILE_ROM_OTHERS;
import static qin.javaee8.hibernate.domain.MobileProperty.getMobilePrice;

@SuppressWarnings("all")
public class SaveMobileGoods extends MyTest
          implements OppoGoodsNames, OppoGoodsImages,
          HuaWeiNames, HuaWeiImages,
          MeiZuNames, MeiZuImages,
          XiaoMiNamesI, XiaoMiImagesI
{
    /*
    //@Test
    public void save1()
    {
        //region 商品名称
        String[] goodsName = new String[]{
                  "	苗丽珠宝 金丝楠手串 楠木佛珠念珠手链 男女款手珠 ML1122 18mm	",
                  "	苹果 Apple iPhone 6s 4.7英寸4G手机 玫瑰金 公开版(16GROM)标配	",
                  "	苹果Apple iPhone SE (A1723) 玫瑰金 全网通64G ROM 标配	",
                  "	苹果Apple iPhone 6 Plus 4G手机 深空灰 公开版(16GROM)标配	",
                  "	苹果(Apple) iPhone SE 4G手机 深空灰 公开版(64G ROM)标配	",
                  "	苹果 Apple iPhone 6s Plus 4G手机 银色 公开版(16G ROM)	",
                  "	苹果(Apple) iPhone 6s 4G手机 玫瑰金 公开版(16G ROM)标配	",
                  "	苹果Apple iPhone 6 Plus 4G手机 公开版 灰色 16G	",
                  "	苹果 Apple iPhone 6 4G手机 灰色 公开版(16GROM)标配	",
                  "	苹果(Apple) iPhone 7 移动联通电信4G手机 黑色 32G 标配	",
                  "	苹果(Apple) iPhone 7 Plus 移动联通电信4G手机 亮黑 128G 标配	",
                  "	苹果 Apple iPhone7 手机 黑色 移动联通电信4G 128GB ROM标配	",
                  "	苹果 Apple iPhone7 Plus 手机 黑色 移动联通电信4G 128GB ROM	",
                  "	苹果Apple iPhone7 全网通手机 黑色 32GB	",
                  "	苹果 Apple iPhone 7 Plus 移动联通电信4G手机 亮黑色 128G	",
                  "	苹果 Apple iPhone7 4G手机 玫瑰金 全网通(32G)	",
                  "	苹果(Apple) iPhone 7 Plus 4G手机 玫瑰金 全网通(128G)	",
                  "	 苹果（Apple）iPhone 7 Plus 移动联通电信4G手机 玫瑰金全网通(	",
                  "	苹果7 Apple iPhone 7 移动联通电信4G手机 亮黑色 128G	",
                  "	苹果 Apple iPhone 7 Plus 移动联通电信4G手机 亮黑色 128G	",
                  "	苹果Apple iPhone 7 Plus 全网通手机 亮黑色 128GB	",
                  "	Apple iPhone 7（A1660 ）移动联通电信4G手机 黑色 32GB	",
                  "	Apple  iPhone 7 Plus (A1661)  移动联通电信4G手机 黑色 32GB	",
                  "	苹果(Apple) iPhone 7 Plus 移动联通电信4G手机 亮黑色 128G标配	",
                  "	苹果(Apple) iPhone7 移动联通电信4G手机 玫瑰金 32G标配	",
                  "	苹果7 Apple iPhone7 Plus 移动联通电信4G手机 玫瑰金 128G 标配	",
                  "	苹果7 Apple iPhone7 移动联通电信4G手机 黑色 128GB 标配	",
                  "	苹果 Apple iPhone SE 4G手机 玫瑰金色 64GB 标配	",
                  "	苹果 Apple iPhone 6s 4G手机 玫瑰金 32GB 标配	",
                  "	Apple iPhone 7 4.7英寸苹果7手机 金色 全网通 (32G)	",
                  "	Apple iPhone 7 4.7英寸苹果7手机 玫瑰金 全网通 (128G)	",
                  "	Apple iPhone 7 Plus 5.5英寸苹果7p手机 黑色 全网通(32G)	",
                  "	苹果 Apple iPhone 6s 苹果6S手机 金色 32GB(全网通)	",
                  "	苹果 Apple iPhone 6s 苹果6S手机 玫瑰金 32GB(全网通)	",
                  "	苹果 Apple iPhone 6s Plus 4G手机 玫瑰金 32GB 标配	",
                  "	苹果 Apple iPhone 6s 4G手机 深灰色 公开(32G)标配	",
                  "	苹果(Apple) iPhone SE智能4G手机 灰黑色 全网通64G  标配	",
                  "	苹果(Apple) iPhone 6s 4G手机 金色 公开版(32G ROM)标配	",
                  "	九阳（Joyoung）电水壶1.7L电热水壶JYK-17C15	",
                  "	飞科(FLYCO)电吹风机家用FH6621大功率吹风筒 2200W	",
                  "	Apple iPhone 7 Plus 5.5英寸苹果7p手机 银色 全网通(32G)	",
                  "	 vivo X9 全网通 4GB+64GB 移动联通电信4G手机 双卡双待X9i星空	",
                  "	 苹果(Apple) iPhone 7(A1660)移动联通电信4G手机 黑色全网通（3	",
                  "	 苹果(Apple) iPhone 6S (A1700)移动联通电信4G手机 玫瑰金全网	",
                  "	 康巴丝（COMPAS）挂钟 创意时尚时钟静音石英客厅卧室简约钟c285	",
                  "	飞科(FLYCO)FS372全身水洗电动剃须刀刮胡须刀	",
                  "	 小熊（Bear）加湿器JSQ-A30Y1 3L大容量静音卧室办公室加湿器家	",
                  "	Apple iPhone 6 (A1586) 16GB 深空灰色 移动联通电信4G手机	",
                  "	 迪士尼（Disney）防水夜光儿童手表男孩蓝色米奇电子表多功能运	",
                  "	 康夫（Kangfu）电吹风机家用 KF-30371600w电吹风机家用吹风筒送	",
                  "	 半球（Peskoe）电水壶1.8L 食品级304不锈钢电热水壶烧水壶WDF-1	",
                  "	中兴（ZTE）L580 老人手机  移动/联通2G 黑色	",
                  "	苏泊尔（SUPOR)电压力锅高压锅CYSB50FC518-100	",
                  "	 联想 ZUK手机（z1221）白色 64GB 移动联通电信4G手机双卡双待4G	",
                  "	Apple iPhone SE (A1723) 64G 玫瑰金色 移动联通电信4G手机	",
                  "	 飞利浦（PHILIPS）电吹风机 HP8200家用大功率6档冷热风恒温护发	",
                  "	Apple iPhone 6s Plus (A1690) 16G 玫瑰金色 移动4G手机	",
                  "	全球购 Apple iPhone 6 plus 港版  苹果手机 银色 16G	",
                  "	 全球购 Apple iphone SE(A1723) 苹果手机港版移动联通4G手机玫	",
                  "	 全球购 Apple iPhone 7 港版 苹果手机 移动联通4G智能手机 黑色	",
                  "	 Apple iPhone7 苹果 新品 移动联通4G IP67级防水手机 黑色32GB	",
                  "	【eBay精选】Apple/苹果 iPhone 7 32G 港版 金色	",
                  "	中兴(ZTE) A1 灵动白 移动4G双卡双待	",
                  "	华为 畅享5S 金色 移动联通电信4G手机 双卡双待	",
                  "	 三星 Galaxy S7 edge（G9350）4GB+32GB版铂光金移动联通电信4G	",
                  "	三星 Galaxy A9 (SM-A9100) 魔幻金 全网通4G手机 双卡双待	",
                  "	LG G5（H868）流光金 移动联通电信4G 双卡双待	",
                  "	 魅族 魅蓝note3 全网通公开版 16GB 银色 移动联通电信4G手机双	",
                  "	乐视（Le）乐2Pro 4GB+32GB 金色 移动联通电信4G手机 双卡双待	",
                  "	亚都（YADU）超声波加湿器 SC-X100J 大雾量静音加湿	",
                  "	 中兴（ZTE） AXON天机7(A2017) 华尔金 移动联通电信4G 双卡双待	",
                  "	Apple iPhone 7 (A1660) 32G 黑色 移动联通电信4G手机	",
                  "	Apple iPhone 7 Plus (A1661) 32G 黑色 移动联通电信4G手机	",
                  "	Apple iPhone 7 Plus (A1661) 128G 玫瑰金色 移动联通电信4G手机	",
                  "	 荣耀 畅玩5C 全网通 高配版 3GB+32GB 落日金移动联通电信4G手机	",
                  "	 乐视（Le）乐Max2（X820) 6GB+128GB 原力金 移动联通电信4G双卡	",
                  "	 Apple iPhone 7 Plus 32G 金色 移动联通电信4G手机	",
                  "	 Apple iPhone 7 Plus (A1661) 128G 黑色 移动联通电信4G手机	",
                  "	金立M6 摩卡金 4GB+128GB版 移动联通电信4G手机 双卡双待	",
                  "	Apple iPhone 6s (A1700) 32G 玫瑰金色 移动联通电信4G手机	",
                  "	 Apple iPhone 6s (A1700) 32G 金色 移动联通电信4G手机	",
                  "	Apple iPhone 7 (A1660) 128G 玫瑰金色 移动联通电信4G手机	",
                  "	 Apple iPhone 7 Plus 32G 金色 移动联通电信4G手机	",
                  "	 Apple iPhone 7 (A1660) 32G 黑色 移动联通电信4G手机	",
                  "	 Apple iPhone 7 Plus (A1661) 128G 亮黑色 移动联通电信4G手机	",
                  "	 荣耀 畅玩6X 4GB 32GB 全网通4G手机 高配版 铂光金	",
                  "	Apple iPhone 6s Plus (A1699) 32G 玫瑰金色 移动联通电信4G手机	",
                  "	 一加手机3T (A3010) 6GB+64GB 枪灰版 全网通 双卡双待移动联通	",
                  "	Piano At the Movies[无损]	",
                  "	I.Allegro	",
                  "	Humoresque,Op.101	",
                  "	 美的（Midea）电磁炉WK2102T 整板触控 黑晶面板八档火力（赠汤	",
                  "	联想(Lenovo) MA388 老人手机 星夜黑 移动联通2G手机 双卡双待	",
                  "	苹果 Apple iPhone 6 4G手机 银色 公开版(16GROM)标配	",
                  "	苹果 Apple iPhone SE 4G手机 玫瑰金 全网通16G ROM	",
                  "	苹果 Apple iPhone 6s 4.7英寸4G手机 金色 全网通(64G ROM)	",
                  "	苹果(Apple) iPhone 6 4G手机 银色 公开版(16G ROM)标配	",
                  "	苹果 Apple iPhone 6 Plus 深空灰色 全网通(16G ROM)	",
                  "	苹果 Apple iPhone SE 全网通4G 玫瑰金 公开版(16G ROM)	",
                  "	苹果 Apple iPhone 6 4G手机 灰色 公开(16G) 标配	",
                  "	 苹果（Apple）iPhone 6s Plus 4G手机 金色 全网通(128GBROM)公	",
                  "	苹果（Apple）iPhone SE (A1723) 深空灰 全网通(64GB ROM)	",
                  "	 苹果（Apple）iPhone 5s(A1530) 4G手机 金色 移动联通双4G(16GB	",
                  "	苹果 Apple iPhone SE 全网通4G 智能手机 金色 64G	",
                  "	苹果(Apple) iPhone SE 4G手机 金色 全网通4G(16G)	",
                  "	 苹果(Apple) iPhone 7 Plus 移动联通电信4G手机 玫瑰金 128G标	",
                  "	苹果(Apple) iPhone 7 移动联通电信4G手机 玫瑰金 32G ROM	",
                  "	苹果(Apple) iPhone 7 Plus 移动联通电信4G手机 金色 128G ROM	",
                  "	苹果7 iphone7 手机 金色 128G 标配	",
                  "	 苹果（Apple）iPhone 7 (A1660) 移动联通电信4G手机 黑色全网通	",
                  "	苹果(Apple) iPhone 7 移动联通电信4G手机 黑色 128G 标配	",
                  "	 苹果(Apple) iPhone 7 Plus(A1661) 移动联通电信4G手机玫瑰金色	",
                  "	苹果(Apple) iPhone 7 Plus 移动联通电信4G手机 亮黑色 128G标配	",
                  "	苹果(Apple) iPhone7 Plus 移动联通电信4G手机 玫瑰金 32G标配	",
                  "	苹果(Apple) iPhone 6s Plus 4G手机 金色 全网通(32G ROM)	",
                  "	苹果 iphone7 Plus 手机 银色 256G	",
                  "	 苹果（Apple）iPhone7 智能手机 4G全网通 亮黑色官方标配(全网	",
                  "	苹果（Apple）iPhone 6s 4G手机 玫瑰金 全网通(32GB ROM)公开版	",
                  "	 苹果Apple iPhone 6s Plus (A1699) 移动联通电信4G手机 金色公	",
                  "	苹果Apple iPhone 6s Plus 4G手机 玫瑰金 公开版(32GROM)标配	",
                  "	苹果 Apple iphone7 Plus手机 金色 128GB套装	",
                  "	苹果 Apple iPhone 6s Plus 4G手机 银色 公开(128G)	",
                  "	 苹果Apple iPhone 6s (A1700) 移动联通电信4G手机 深空灰公开版	",
                  "	 苹果 Apple iPhone SE 4G智能手机 深空灰 全网通4G (64GROM)标	",
                  "	苹果 Apple iPhone 6s 苹果6S手机 深灰色 公开(32G)标配	",
                  "	 vivo X9 全网通 4GB+64GB 移动联通电信4G手机 双卡双待X9i星空	",
                  "	 苹果(Apple) iPhone 7 Plus(A1661)移动联通电信4G手机 黑色全网	",
                  "	 苹果(Apple) iPhone SE (A1723)移动联通电信4G手机 玫瑰金全网	",
                  "	 苹果（Apple）iphone 6 （A1586）移动联通电信4G手机 星空灰全	",
                  "	 Apple iPhone7 移动联通电信全网通4G苹果手机 金色 官方标配128	",
                  "	 Apple iPhone 7 Plus 移动联通电信4G智能 苹果手机 玫瑰金色官	",
                  "	苹果 Apple iPhone 6 深空灰色 全网通(16G ROM)标配版	",
                  "	 苹果（Apple）iPhone 7 (A1660) 移动联通电信4G手机 黑色全网通	",
                  "	 苹果（Apple）iPhone 7 Plus 移动联通电信4G手机 玫瑰金全网通(	",
                  "	苹果（Apple）iPhone SE (A1723) 玫瑰金 全网通(64GB ROM)	",
                  "	中兴（ZTE）L580 老人手机  移动/联通2G 黑色	",
                  "	 联想 ZUK手机（z1221）白色 64GB 移动联通电信4G手机双卡双待4G	",
                  "	Apple iPhone 6S(A1688) 港行 苹果手机 玫瑰金 16G	",
                  "	Apple iPhone 6S plus(A1687)  港行 苹果手机 灰色 16G	",
                  "	 苹果手机 Apple iPhone SE 手机 SE 苹果手机 移动联通4G 灰色16	",
                  "	Apple iPhone SE苹果手机se 港版移动联通4G手机 银色 16GB	",
                  "	 Apple 苹果 iPhone6s Plus（A1687） 移动联通4G 深空灰色64GB港	",
                  "	Apple 苹果 iPhone6s（A1688） 移动联通4G 玫瑰金色 64GB港版	",
                  "	 Apple iPhone7 Plus苹果新品 移动 联通4G IP67级防水手机 黑色1	",
                  "	【eBay精选】Apple/苹果 iPhone 7 Plus 港版 玫瑰金色 32G	",
                  "	 全球购 Apple iPhone 6 纯正美版 苹果手机 三网通4G智能手机 6P	",
                  "	苹果(Apple) iPhone 5S 4G手机 金色 16GB移动联通双4G版 标配	",
                  "	全球购  苹果 iPhone4s 联通3G智能手机 白色 8GB 联通3G版	",
                  "	Apple iPhone6 plus(A1524) 港版官换 移动联通4G手机 银色 16G	",
                  "	 全球购 Apple 苹果 iPhone7 Plus 智能手机 金色 双4G 港行 32G	",
                  "	 全球购 Apple 苹果 移动联通电信 全网通4G智能手机 iPhone7PLUS	",
                  "	全球购  苹果 iPhone4s 联通3G智能手机 IOS 8.0系统  白色 8GB	",
                  "	 全球购 苹果（Apple）新款 iPad Air2 9.7英寸平板电脑 月光银WI	",
                  "	摩托罗拉 moto x 极( XT1581) 64GB 玛雅黑 移动联通电信4G手机	",
                  "	华为 畅享5S 金色 移动联通电信4G手机 双卡双待	",
                  "	华为 畅享5S 银色 移动联通电信4G手机 双卡双待	",
                  "	LG G5（H868）流光金 移动联通电信4G 双卡双待	",
                  "	华为 G9 青春版 黑色 移动联通电信4G手机 双卡双待 	",
                  "	华为 P9 全网通 3GB+32GB版 皓月银 移动联通电信4G手机 双卡双待	",
                  "	 魅族 魅蓝note3 全网通公开版 16GB 银色 移动联通电信4G手机双	",
                  "	乐视（Le）乐2Pro 4GB+32GB 金色 移动联通电信4G手机 双卡双待	",
                  "	HTC Desire 830 蓝莓布丁 移动联通双4G手机	",
                  "	Apple iPhone 7 Plus (A1661) 128G 玫瑰金色 移动联通电信4G手机	",
                  "	 荣耀 畅玩5C 全网通 高配版 3GB+32GB 落日金移动联通电信4G手机	",
                  "	 Apple iPhone 7 (A1660) 32G 黑色 移动联通电信4G手机	",
                  "	金立M6 摩卡金 4GB+128GB版 移动联通电信4G手机 双卡双待	",
                  "	 Apple iPhone 6s Plus (A1699) 32G 玫瑰金色移动联通电信4G手机	",
                  "	 华为 麦芒5 全网通 4GB+64GB版 玫瑰金 移动联通电信4G手机双卡	",
                  "	 摩托罗拉 Moto Z Play(XT1635-03) 模块化手机 爵士黑移动联通电	",
                  "	 荣耀 畅玩6X 4GB 32GB 全网通4G手机 高配版 铂光金	",
                  "	 Apple iPhone 6s (A1700) 32G 玫瑰金色 移动联通电信4G手机	",
                  "	 乐视（LeEco）乐Pro3 （X720）4GB+32GB 原力金移动联通电信4G手	",
                  "	 一加手机3T (A3010) 6GB+64GB 枪灰版 全网通 双卡双待移动联通	",
                  "	 联想ZUK Edge 臻享版 6G+64G 陶瓷白 全网通4G手机 双卡双待	",
                  "	联想(Lenovo) MA388 老人手机 星夜黑 移动联通2G手机 双卡双待	"
        };
        //endregion

        //苹果手机类型
        GoodsType apple = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='苹果'")
                  .list().get(0);

        for (int i = 0; i < goodsName.length; i++)
        {
            MobileGoods m = new MobileGoods();
            m.setGoods_name(goodsName[i]);
            m.setGoods_number(i);
            m.setGoods_price(getMobilePrice());
            m.setMobile_os(MOBILE_OS_APPLE);
            m.setMobile_memory("6GB");

            //region 其它必备属性
            if (i % 2 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_HIGHER1600);
                m.setMobile_color(MOBILE_COLOR_WHITE);
                m.setMobile_rom(MOBILE_ROM_8);
                m.setMobile_battery(MOBILE_BATTERY_LOWER1200);
            }
            if (i % 3 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_800_1599);
                m.setMobile_color(MOBILE_COLOR_BLACK);
                m.setMobile_rom(MOBILE_ROM_16);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_1200_1999);
            }
            if (i % 4 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_500_799);
                m.setMobile_color(MOBILE_COLOR_GRAY);
                m.setMobile_rom(MOBILE_ROM_32);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_2000_2999);
            }
            if (i % 5 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_OTHERS);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_200_499);
                m.setMobile_color(MOBILE_COLOR_GOLD);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            if (i % 6 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_SILVIER);
                m.setMobile_rom(MOBILE_ROM_128);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 7 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_RED);
                m.setMobile_rom(MOBILE_ROM_NO);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_6000);
            }
            if (i % 8 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_OTHER);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 9 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_OTHERS);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_OTHERS);
            }
            else
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            //endregion

            //region 注释
            //if ( i % 2 == 0) {m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_HIGHER1600);                        m.setMobile_color(MOBILE_COLOR_WHITE);m.setMobile_rom(MOBILE_ROM_8);m.setMobile_battery(MOBILE_BATTERY_LOWER1200);}
            //if ( i % 3 == 0) {m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_800_1599);                        m.setMobile_color(MOBILE_COLOR_BLACK);m.setMobile_rom(MOBILE_ROM_16);m.setMobile_battery(MOBILE_BATTERY_BETWEEN_1200_1999);}
            //if ( i % 4 == 0) {m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_500_799);                        m.setMobile_color(MOBILE_COLOR_GRAY);m.setMobile_rom(MOBILE_ROM_32);m.setMobile_battery(MOBILE_BATTERY_BETWEEN_2000_2999);}
            //if ( i % 5 == 0) {m.setMobile_backCamera(MOBILE_BACK_CAMERA_OTHERS);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_200_499);                        m.setMobile_color(MOBILE_COLOR_GOLD);m.setMobile_rom(MOBILE_ROM_64);m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);}
            //if ( i % 6 == 0) {m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);                        m.setMobile_color(MOBILE_COLOR_SILVIER);m.setMobile_rom(MOBILE_ROM_128);m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);}
            //if ( i % 7 == 0) {m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);                        m.setMobile_color(MOBILE_COLOR_RED);m.setMobile_rom(MOBILE_ROM_NO);m.setMobile_battery(MOBILE_BATTERY_HIGHER_6000);}
            //if ( i % 8 == 0) {m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_OTHER);                        m.setMobile_color(MOBILE_COLOR_PINK);m.setMobile_rom(MOBILE_ROM_OTHERS);m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);}
            //if ( i % 9 == 0) {m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);                        m.setMobile_color(MOBILE_COLOR_OTHERS);m.setMobile_rom(MOBILE_ROM_OTHERS);m.setMobile_battery(MOBILE_BATTERY_HIGHER_OTHERS);}
            //else {m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);     m.setMobile_color(MOBILE_COLOR_PINK);m.setMobile_rom(MOBILE_ROM_64);m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);}
            //endregion

            //region 图片
            Map<Integer, String> imagesMap = new TreeMap<>();
            for (int j = 0; j < images.length; j++)
            {
                imagesMap.put(j, images[j]);
            }

            m.setImagesMap(imagesMap);
            //endregion

            m.setMobileGoodsType(apple);
            apple.getMobileGoodsSet().add(m);

            session.save(m);
            session.update(apple);
        }

        transaction.commit();
    }

    //@org.junit.Test
    public void saveOPPOType()
    {
        GoodsType oppo = new GoodsType("华为");
        GoodsType parent = (GoodsType) session
                  .createQuery("from GoodsType where id=149")
                  .list().get(0);
        parent.getChildrenSet().add(oppo);
        oppo.setParentGoodsType(parent);

        session.save(oppo);
        session.update(parent);

        transaction.commit();
    }

    //@org.junit.Test
    public void saveOPPO()
    {
        GoodsType apple = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='oppo'")
                  .list().get(0);

        for (int i = 0; i < oppoNames.length; i++)
        {
            MobileGoods m = new MobileGoods();
            m.setGoods_name(oppoNames[i]);
            m.setGoods_number(i);
            m.setGoods_price(getMobilePrice());
            m.setMobile_os("android");
            m.setMobile_memory("6GB");

            //region 其它必备属性
            if (i % 2 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_HIGHER1600);
                m.setMobile_color(MOBILE_COLOR_WHITE);
                m.setMobile_rom(MOBILE_ROM_8);
                m.setMobile_battery(MOBILE_BATTERY_LOWER1200);
            }
            if (i % 3 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_800_1599);
                m.setMobile_color(MOBILE_COLOR_BLACK);
                m.setMobile_rom(MOBILE_ROM_16);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_1200_1999);
            }
            if (i % 4 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_500_799);
                m.setMobile_color(MOBILE_COLOR_GRAY);
                m.setMobile_rom(MOBILE_ROM_32);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_2000_2999);
            }
            if (i % 5 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_OTHERS);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_200_499);
                m.setMobile_color(MOBILE_COLOR_GOLD);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            if (i % 6 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_SILVIER);
                m.setMobile_rom(MOBILE_ROM_128);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 7 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_RED);
                m.setMobile_rom(MOBILE_ROM_NO);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_6000);
            }
            if (i % 8 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_OTHER);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 9 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_OTHERS);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_OTHERS);
            }
            else
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            //endregion

            //region 图片
            Map<Integer, String> imagesMap = new TreeMap<>();
            for (int j = 0; j < 1504; j++)
            {
                imagesMap.put(1, images[j]);
            }

            m.setImagesMap(imagesMap);
            //endregion

            m.setMobileGoodsType(apple);
            apple.getMobileGoodsSet().add(m);

            session.save(m);
            session.update(apple);
        }

        transaction.commit();
    }
    */

    //@org.junit.Test
    public void saveHuaWei()
    {
        GoodsType apple = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='华为'")
                  .list().get(0);

        for (int i = 0; i < meiZuNamess.length; i++)
        {
            MobileGoods m = new MobileGoods();
            m.setGoods_name(meiZuNamess[i]);
            m.setGoods_number(i);
            m.setGoods_price(getMobilePrice());
            m.setMobile_os("android");
            m.setMobile_memory("6GB");

            //region 其它必备属性
            if (i % 2 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_HIGHER1600);
                m.setMobile_color(MOBILE_COLOR_WHITE);
                m.setMobile_rom(MOBILE_ROM_8);
                m.setMobile_battery(MOBILE_BATTERY_LOWER1200);
            }
            if (i % 3 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_800_1599);
                m.setMobile_color(MOBILE_COLOR_BLACK);
                m.setMobile_rom(MOBILE_ROM_16);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_1200_1999);
            }
            if (i % 4 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_500_799);
                m.setMobile_color(MOBILE_COLOR_GRAY);
                m.setMobile_rom(MOBILE_ROM_32);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_2000_2999);
            }
            if (i % 5 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_OTHERS);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_200_499);
                m.setMobile_color(MOBILE_COLOR_GOLD);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            if (i % 6 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_SILVIER);
                m.setMobile_rom(MOBILE_ROM_128);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 7 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_RED);
                m.setMobile_rom(MOBILE_ROM_NO);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_6000);
            }
            if (i % 8 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_OTHER);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 9 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_OTHERS);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_OTHERS);
            }
            else
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            //endregion

            //region 图片
            Map<Integer, String> imagesMap = new TreeMap<>();
            for (int j = 0; j < huaweiImages.length; j++)
            {
                imagesMap.put(1, huaweiImages[j]);
            }

            m.setImagesMap(imagesMap);
            //endregion

            m.setMobileGoodsType(apple);
            apple.getMobileGoodsSet().add(m);

            session.save(m);
            session.update(apple);
        }

        transaction.commit();
    }

    //@org.junit.Test
    public void saveOPPOType()
    {
        GoodsType oppo = new GoodsType("魅族");
        GoodsType parent = (GoodsType) session
                  .createQuery("from GoodsType where id=149")
                  .list().get(0);
        parent.getChildrenSet().add(oppo);
        oppo.setParentGoodsType(parent);

        session.save(oppo);
        session.update(parent);

        transaction.commit();
    }

    //@org.junit.Test
    public void saveMeiZu()
    {
        GoodsType apple = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='魅族'")
                  .list().get(0);

        for (int i = 0; i < meiZuNamess.length; i++)
        {
            MobileGoods m = new MobileGoods();
            m.setGoods_name(meiZuNamess[i]);
            m.setGoods_number(i);
            m.setGoods_price(getMobilePrice());
            m.setMobile_os("android");
            m.setMobile_memory("6GB");

            //region 其它必备属性
            if (i % 2 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_HIGHER1600);
                m.setMobile_color(MOBILE_COLOR_WHITE);
                m.setMobile_rom(MOBILE_ROM_8);
                m.setMobile_battery(MOBILE_BATTERY_LOWER1200);
            }
            if (i % 3 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_800_1599);
                m.setMobile_color(MOBILE_COLOR_BLACK);
                m.setMobile_rom(MOBILE_ROM_16);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_1200_1999);
            }
            if (i % 4 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_500_799);
                m.setMobile_color(MOBILE_COLOR_GRAY);
                m.setMobile_rom(MOBILE_ROM_32);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_2000_2999);
            }
            if (i % 5 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_OTHERS);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_200_499);
                m.setMobile_color(MOBILE_COLOR_GOLD);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            if (i % 6 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_SILVIER);
                m.setMobile_rom(MOBILE_ROM_128);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 7 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_RED);
                m.setMobile_rom(MOBILE_ROM_NO);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_6000);
            }
            if (i % 8 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_OTHER);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 9 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_OTHERS);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_OTHERS);
            }
            else
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            //endregion

            //region 图片
            Map<Integer, String> imagesMap = new TreeMap<>();
            for (int j = 0; j < meiZuImagess.length; j++)
            {
                imagesMap.put(i, meiZuImagess[j]);
            }

            m.setImagesMap(imagesMap);
            //endregion

            m.setMobileGoodsType(apple);
            apple.getMobileGoodsSet().add(m);

            session.save(m);
            session.update(apple);
        }

        transaction.commit();
    }

    @org.junit.Test
    public void save_小米()
    {
        GoodsType apple = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='魅族'")
                  .list().get(0);

        for (int i = 0; i < xiaomiNames.length; i++)
        {
            MobileGoods m = new MobileGoods();
            m.setGoods_name(xiaomiNames[i]);
            m.setGoods_number(i);
            m.setGoods_price(getMobilePrice());
            m.setMobile_os("android");
            m.setMobile_memory("6GB");

            //region 其它必备属性
            if (i % 2 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_HIGHER1600);
                m.setMobile_color(MOBILE_COLOR_WHITE);
                m.setMobile_rom(MOBILE_ROM_8);
                m.setMobile_battery(MOBILE_BATTERY_LOWER1200);
            }
            if (i % 3 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_800_1599);
                m.setMobile_color(MOBILE_COLOR_BLACK);
                m.setMobile_rom(MOBILE_ROM_16);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_1200_1999);
            }
            if (i % 4 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_500_799);
                m.setMobile_color(MOBILE_COLOR_GRAY);
                m.setMobile_rom(MOBILE_ROM_32);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_2000_2999);
            }
            if (i % 5 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_OTHERS);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_200_499);
                m.setMobile_color(MOBILE_COLOR_GOLD);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            if (i % 6 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_SILVIER);
                m.setMobile_rom(MOBILE_ROM_128);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 7 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_RED);
                m.setMobile_rom(MOBILE_ROM_NO);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_6000);
            }
            if (i % 8 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_HIGHER_200);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_OTHER);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_4000_5999);
            }
            if (i % 9 == 0)
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BELOW_120);
                m.setMobile_color(MOBILE_COLOR_OTHERS);
                m.setMobile_rom(MOBILE_ROM_OTHERS);
                m.setMobile_battery(MOBILE_BATTERY_HIGHER_OTHERS);
            }
            else
            {
                m.setMobile_backCamera(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
                m.setMobile_frontCamera(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
                m.setMobile_color(MOBILE_COLOR_PINK);
                m.setMobile_rom(MOBILE_ROM_64);
                m.setMobile_battery(MOBILE_BATTERY_BETWEEN_3000_3999);
            }
            //endregion

            //region 图片
            Map<Integer, String> imagesMap = new TreeMap<>();
            for (int j = 0; j < xiaomiImages.length; j++)
            {
                imagesMap.put(i, xiaomiImages[j]);
            }

            m.setImagesMap(imagesMap);
            //endregion

            m.setMobileGoodsType(apple);
            apple.getMobileGoodsSet().add(m);

            session.save(m);
            session.update(apple);
        }

        transaction.commit();
    }
}