package qin.javaee8.hibernate.testing;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

public class NiceBoxTest1
{
    //@Test
    public void makeProduct1()
    {
        //产品名称(必填)	图片名称(必填)	产品缩略图	产品简介
        String[] productNames = new String[]
                  {
                            " 毕扬美乳霜 美胸贴膏产后丰乳增大霜胸部护理精油产品排行榜",
                            " 丝芙伦胸部护理精油 美胸精油 丰满美胸精油 按摩精油少女丰乳霜",
                            " Rends 究极美乳房真人倒模仿真胸部 男用乳交自慰器 自慰器 男士",
                            " 泰国圣荷美胸霜丰胸100g 美胸产品丰乳精油霜露膏胸部护理霜按摩",
                            "妙正丰胸霜丰美胸霜胸部增大丰乳美胸膏精油贴胸部按摩产后护理产",
                            " 俏皮天使充气娃娃男用自慰器成人情趣性用品任意姿+智能口交+阴",
                            " 丝芙伦胸部护理精油 美胸精油 丰满美胸精油 按摩精油少女丰乳霜",
                            "爱肤宜丰胸霜精油 紧实丰满产后美胸美乳产品粉嫩胸部按摩护理乳",
                            " 丝芙伦胸部护理精油 精油丰满护理精油 按摩精油少女丰乳霜产后",
                            " 丝芙伦健美创研健胸膏 丰韵美胸霜胸部丰满少女丰乳霜产后美胸紧",
                            " 爱肤宜美白精华面膜10ml 涂抹式水光针紧致补水保湿护肤精华液一",
                            " 丝芙伦健美创研健胸膏 丰韵美胸霜胸部丰满少女丰乳霜产后美胸紧",
                            " 爱肤宜丰胸霜精油 紧实丰满产后美胸美乳产品粉嫩胸部按摩护理乳",
                            " 丝芙伦胸部护理精油30ml 美胸精油 丰满美胸精油 按摩精油少女丰",
                            "独爱   润滑液 润滑剂 成人用品 情趣性用品 20克瓶装",
                            " 爱肤宜私处护理 粉嫩紧致私密护理 紧致嫩红素凝胶美肤白皙女性",
                            " 爱肤宜丰胸霜精油 紧实丰满产后美胸美乳产品粉嫩胸部按摩护理乳",
                            " 爱肤宜丰胸精油 紧实丰满产后增大美胸美乳产品胸部护理乳霜精油",
                            " 久爱充气娃娃加厚无缝一体带阴毛胸部注水冲气实体成人用品A款口",
                            " 爱肤宜丰胸霜膏乳房增大产后下垂胸部护理套装按摩精油美乳霜100",
                            " (买1送1同款) 柔肤多效bb霜女保湿裸妆遮瑕隔离粉底霜液优于美肤",
                            " （买1送5）爱肤宜祛斑霜去淡化祛黄黑斑色斑辐射斑中老人晒斑男",
                            " （买2瓶送1瓶）爱肤宜丰胸精油 紧实丰满产后增大美胸美乳产品胸",
                            "爱肤宜丰胸精油产后胸部按摩精油乳房增大护理产品 美乳精油1瓶",
                            " 爱肤宜丰胸霜100g美乳增大紧实丰满产后丰韵美胸产品胸部按摩护",
                            " 久爱充气娃娃加厚无缝一体带阴毛胸部注水冲气实体成人用品F款口",
                            " 爱肤宜丰胸霜丰韵美乳增大紧实丰满产后美胸产品胸部按摩护理乳",
                            " 爱肤宜口红 不掉色不沾杯口红唇膏 持久保湿润唇口红女士咬唇妆",
                            " 爱肤宜丰胸精油胸部按摩精油产后丰美胸精油按摩胸部护理增挺大",
                            " 秘语 男用充气娃娃真人比例自慰器成人情趣性用品美女+乳交阴交",
                            " 丰韵美胸霜 不含激素妙正丰胸霜胸部护理丰乳胸精油贴增大美乳霜",
                            " 男性自慰器仿真乳房阴部胸部倒模咪咪球男用飞机杯成人情趣用品",
                            " 爱肤宜丰胸霜 紧实丰满产后增大美胸美乳产品胸部护理乳霜精油贴",
                            " 卡芙尼诗(C.E.C) 绿茶净透卸妆水300ml温和不刺激女士控油脸部眼",
                            " 卡芙尼诗 丰胸产品 丰韵美胸霜 丰满胸部(经典款）50g 按摩精油",
                            " 爱肤宜丰胸精油 挺翘美乳霜产品 胸部增大产后丰盈胸部乳贴美胸",
                            " 卡芙尼诗祛痘膏凝胶快速祛痘印去痘痕青春痘霜芦荟胶淡痘印女男",
                            " 丰韵美胸霜 不含激素妙正丰胸霜胸部护理丰乳胸精油贴增大美乳霜",
                            "卡芙尼诗(C.E.C) 芦荟胶300ml祛去痘淡化痘印修护补水保湿面霜",
                            " RENDS 大魔王美乳房倒模仿真胸部大咪咪 男用乳交自慰器具肤色大",
                            " RENDS 大魔王美乳房倒模仿真胸部大咪咪 男用乳交自慰器具肉色大",
                            " 爱肤宜纤体霜100g 瘦肚子减脂肪肥胖塑形霜 瘦减身霜瘦手臂脸全",
                            " 艾美坊美胸精华液60ml 挺翘美乳霜 胸部增大产后丰盈胸部乳贴",
                            " 茗振MZ-666F9无线隐形丰胸仪 电动 美乳电动胸部按摩仪胸部乳房",
                            " 名古一体式充气娃娃真人比例成人用品自慰器任意姿+下体加热+实",
                            "茗振MZ-666F9  美胸宝胸部按摩器电动按摩仪 无线美胸宝",
                            "美人誌丰胸贴 丰满胸部产品 产后增大丰乳美乳护理非精油乳霜膏",
                            " 丰韵美乳精油 紧实丰满产后美胸美乳产品粉嫩胸部按摩护理乳霜膏",
                            "贝诗黛儿 美乳霜 丰韵霜精油乳房护理美胸仪帖胸部护理增大按摩霜",
                            " 美人誌丰胸美乳贴4贴/盒 丰满胸部产品产后增大美胸护理优于精油",
                            " 久爱男用充气娃娃真人比例自慰器倒模成人情趣性用品玲玲升级版+",
                            " 莱薇尔LAVER丰胸精油 丰胸产品丰胸霜美乳美胸丰乳霜贴胸部护理",
                            " 莱薇尔LAVER丰胸精油 丰胸产品丰胸霜美乳美胸丰乳霜贴胸部护理",
                            " 泰国圣荷纳诺美胸精华露丰胸15ml 坚挺增大 产后护理精油霜产品",
                            " 少女丰韵美胸霜 不含激素妙正丰胸霜增大美乳霜产后紧致产品胸部",
                            " 杜蕾斯 避孕套 男用 安全套 计生用品 LOVE装10只装 成人用品Dur",
                            " 美人誌丰胸贴非膏霜优于丰满美乳胸膏霜胸部护理非按摩精油贴产",
                            " 胸部护理精油 美胸按摩精油 丰韵美胸精油 按摩精油 30ML紧实坚",
                            " COB 女用自慰器 仿真阳具 充电AV震动按摩棒 潘朵拉 PANDORA成人",
                            "谜姬大咪咪胸部倒模乳房玩具成人情趣性用品",
                            "  紧实丰满产后增大美胸美乳产品 胸部护理乳霜膏精油贴 1袋2片装",
                            "谜姬 成人用品 大咪咪仿真胸部 实体乳房倒模飞机杯  "
                  };
        System.out.println(productNames.length);

        //region images
        String[] images = new String[]
                  {
                            "/xiong/20170128161208923.jpg",
                            "/xiong/20170128161209950.jpg",
                            "/xiong/20170128161210514.jpg",
                            "/xiong/20170128161212785.jpg",
                            "/xiong/20170128161214733.jpg",
                            "/xiong/20170128161216205.jpg",
                            "/xiong/20170128161218324.jpg",
                            "/xiong/20170128161219139.jpg",
                            "/xiong/20170128161221476.jpg",
                            "/xiong/20170128161222330.jpg",
                            "/xiong/20170128161224313.jpg",
                            "/xiong/20170128161225286.jpg",
                            "/xiong/20170128161227582.jpg",
                            "/xiong/2017012816122866.jpg",
                            "/xiong/20170128161230719.jpg",
                            "/xiong/20170128161231147.jpg",
                            "/xiong/20170128161233144.jpg",
                            "/xiong/20170128161234102.jpg",
                            "/xiong/20170128161236834.jpg",
                            "/xiong/20170128161238936.jpg",
                            "/xiong/2017012816124057.jpg",
                            "/xiong/20170128161242355.jpg",
                            "/xiong/20170128161244720.jpg",
                            "/xiong/20170128161247945.jpg",
                            "/xiong/20170128161250352.jpg",
                            "/xiong/20170128161253358.jpg",
                            "/xiong/2017012816125611.jpg",
                            "/xiong/20170128161258402.jpg",
                            "/xiong/20170128161300904.jpg",
                            "/xiong/20170128161349101.jpg",
                            "/xiong/20170128161349146.jpg",
                            "/xiong/201701281613503.jpg",
                            "/xiong/2017012816135057.jpg",
                            "/xiong/20170128161351580.jpg",
                            "/xiong/20170128161352786.jpg",
                            "/xiong/20170128161353136.jpg",
                            "/xiong/20170128161355222.jpg",
                            "/xiong/20170128161356530.jpg",
                            "/xiong/20170128161357104.jpg",
                            "/xiong/20170128161358507.jpg",
                            "/xiong/20170128161359983.jpg",
                            "/xiong/20170128161400807.jpg",
                            "/xiong/20170128161401734.jpg",
                            "/xiong/20170128161403902.jpg",
                            "/xiong/20170128161404618.jpg",
                            "/xiong/20170128161405449.jpg",
                            "/xiong/20170128161407747.jpg",
                            "/xiong/20170128161408821.jpg",
                            "/xiong/20170128161409767.jpg",
                            "/xiong/2017012816141095.jpg",
                            "/xiong/20170128161411202.jpg",
                            "/xiong/20170128161412100.jpg",
                            "/xiong/20170128161413523.jpg",
                            "/xiong/20170128161414153.jpg",
                            "/xiong/20170128161415622.jpg",
                            "/xiong/20170128161417457.jpg",
                            "/xiong/20170128161418792.jpg",
                            "/xiong/20170128161419169.jpg",
                            "/xiong/20170128161439227.jpg",
                            "/xiong/20170128161439517.jpg",
                            "/xiong/20170128161439580.jpg",
                            "/xiong/20170128161440560.jpg",
                            "/xiong/20170128161440957.jpg",
                            "/xiong/20170128161441240.jpg",
                            "/xiong/20170128161442470.jpg",
                            "/xiong/20170128161443558.jpg",
                            "/xiong/20170128161444827.jpg",
                            "/xiong/20170128161445710.jpg",
                            "/xiong/20170128161446614.jpg",
                            "/xiong/20170128161446875.jpg",
                            "/xiong/20170128161447952.jpg",
                            "/xiong/20170128161448274.jpg",
                            "/xiong/20170128161449108.jpg",
                            "/xiong/20170128161450428.jpg",
                            "/xiong/20170128161451289.jpg",
                            "/xiong/2017012816145251.jpg",
                            "/xiong/20170128161453363.jpg",
                            "/xiong/20170128161454206.jpg",
                            "/xiong/20170128161455138.jpg",
                            "/xiong/20170128161456532.jpg",
                            "/xiong/20170128161457462.jpg",
                            "/xiong/20170128161457857.jpg",
                            "/xiong/2017012816145852.jpg",
                            "/xiong/20170128161459125.jpg",
                            "/xiong/20170128161500415.jpg",
                            "/xiong/20170128161501996.jpg",
                            "/xiong/20170128161502920.jpg"
                  };
        //endregion

        String[] newImages = Arrays.copyOfRange(images, 0, 62);
        System.out.println(newImages.length);

//        System.out.println(images.length);
//
        String s = "<table width=\"1750\" border=\"0\">\n" +
                  "  <tr>\n" +
                  "    <td>a</td>\n" +
                  "    <td>b</td>\n" +
                  "    <td>c</td>\n" +
                  "    <td>d</td>\n" +
                  "  </tr>\n";
        for (int i = 0; i < productNames.length; i++)
        {
            s += "  <tr>\n" +
                      "    <td>" + productNames[i] + "</td>\n" +
                      "    <td>" + newImages[i] + "</td>\n" +
                      "    <td>" + newImages[i] + "</td>\n" +
                      "    <td>" + productNames[i] + "</td>\n" +
                      "  </tr>\n";
        }
        s += "</table>";

        System.out.println(s);

    }

    @Test
    public void makeProduct2()
    {
        //产品名称(必填)	图片名称(必填)	产品缩略图	产品简介
        String[] productNames = new String[]
                  {
                            " 美人誌丰胸霜贴 丰满胸部产品 产后增大美胸护理精油乳贴3盒12片",
                            " 美人誌丰胸贴 满胸部美乳霜膏精油产品胸部护理丰乳胸贴精油贴按",
                            " 美人誌丰胸贴 丰盈美乳美胸产品 胸部增大产后丰盈护理美胸贴精",
                            " 美人誌丰胸贴 丰满胸部美胸美乳产品 胸部按摩乳霜精油仪器一盒4",
                            " 毕扬美乳霜 美胸贴膏产后丰乳增大霜胸部护理精油产品排行榜",
                            "XYZ 网眼开档做爱免脱丝袜 连体网袜性感女士情趣内衣诱惑黑丝",
                            " 丝芙伦胸部护理精油 美胸精油 丰满美胸精油 按摩精油少女丰乳霜",
                            " 爱肤宜丰胸霜美乳增大紧实丰满产后丰韵美胸产品胸部按摩护理乳",
                            " Rends 究极美乳房真人倒模仿真胸部 男用乳交自慰器 自慰器 男士",
                            " 泰国圣荷美胸霜丰胸100g 美胸产品丰乳精油霜露膏胸部护理霜按摩",
                            "春节不打烊任意下单加99元换购专享链接，单拍不发货",
                            "妙正丰胸霜丰美胸霜胸部增大丰乳美胸膏精油贴胸部按摩产后护理产",
                            " 俏皮天使充气娃娃男用自慰器成人情趣性用品任意姿+智能口交+阴",
                            " 丝芙伦胸部护理精油 美胸精油 丰满美胸精油 按摩精油少女丰乳霜",
                            " （买一发6）爱肤宜撕拉式吸去黑头面膜男女士去粉刺补水保湿收缩",
                            " 爱肤宜丰胸霜精油 紧实丰满产后美胸美乳产品粉嫩胸部按摩护理乳",
                            " 丝芙伦胸部护理精油 精油丰满护理精油 按摩精油少女丰乳霜产后",
                            "爱肤宜丰胸霜 丰满胸部产品 （产后增大美胸护理非精油乳贴）",
                            " 丝芙伦健美创研健胸膏 丰韵美胸霜胸部丰满少女丰乳霜产后美胸紧",
                            " 爱肤宜美白精华面膜10ml 涂抹式水光针紧致补水保湿护肤精华液一",
                            " 丝芙伦健美创研健胸膏 丰韵美胸霜胸部丰满少女丰乳霜产后美胸紧",
                            " 爱肤宜丰胸霜精油 紧实丰满产后美胸美乳产品粉嫩胸部按摩护理乳",
                            " 丝芙伦胸部护理精油30ml 美胸精油 丰满美胸精油 按摩精油少女丰",
                            "独爱   润滑液 润滑剂 成人用品 情趣性用品 20克瓶装",
                            " 爱肤宜私处护理 粉嫩紧致私密护理 紧致嫩红素凝胶美肤白皙女性",
                            " 萱晴丰美胸霜 产后增丰盈美胸产品 美乳大胸部护理淡化乳晕美胸",
                            " 爱肤宜丰胸霜精油 紧实丰满产后美胸美乳产品粉嫩胸部按摩护理乳",
                            " 爱肤宜丰胸精油 紧实丰满产后增大美胸美乳产品胸部护理乳霜精油",
                            " 久爱充气娃娃加厚无缝一体带阴毛胸部注水冲气实体成人用品A款口",
                            " 爱肤宜丰胸霜膏乳房增大产后下垂胸部护理套装按摩精油美乳霜100",
                            " （买2瓶送1瓶）爱肤宜丰胸精油 紧实丰满产后增大美胸美乳产品胸",
                            "爱肤宜丰胸精油产后胸部按摩精油乳房增大护理产品 美乳精油1瓶",
                            " 久爱充气娃娃加厚无缝一体带阴毛胸部注水冲气实体成人用品F款口",
                            " 爱肤宜丰胸霜丰韵美乳增大紧实丰满产后美胸产品胸部按摩护理乳",
                            " 爱肤宜口红 不掉色不沾杯口红唇膏 持久保湿润唇口红女士咬唇妆",
                            " 爱肤宜丰胸精油胸部按摩精油产后丰美胸精油按摩胸部护理增挺大",
                            " 秘语 男用充气娃娃真人比例自慰器成人情趣性用品美女+乳交阴交",
                            " 丰韵美胸霜 不含激素妙正丰胸霜胸部护理丰乳胸精油贴增大美乳霜",
                            " 男性自慰器仿真乳房阴部胸部倒模咪咪球男用飞机杯成人情趣用品",
                            " 爱肤宜丰胸霜 紧实丰满产后增大美胸美乳产品胸部护理乳霜精油贴",
                            " 卡芙尼诗(C.E.C) 绿茶净透卸妆水300ml温和不刺激女士控油脸部眼",
                            " 卡芙尼诗 丰胸产品 丰韵美胸霜 丰满胸部(经典款）50g 按摩精油",
                            " 爱肤宜丰胸精油 挺翘美乳霜产品 胸部增大产后丰盈胸部乳贴美胸",
                            " 卡芙尼诗祛痘膏凝胶快速祛痘印去痘痕青春痘霜芦荟胶淡痘印女男",
                            " 丰韵美胸霜 不含激素妙正丰胸霜胸部护理丰乳胸精油贴增大美乳霜",
                            "卡芙尼诗(C.E.C) 芦荟胶300ml祛去痘淡化痘印修护补水保湿面霜",
                            " RENDS 大魔王美乳房倒模仿真胸部大咪咪 男用乳交自慰器具肤色大",
                            " RENDS 大魔王美乳房倒模仿真胸部大咪咪 男用乳交自慰器具肉色大",
                            " 艾美坊美胸精华液60ml 挺翘美乳霜 胸部增大产后丰盈胸部乳贴",
                            " 茗振MZ-666F9无线隐形丰胸仪 电动 美乳电动胸部按摩仪胸部乳房",
                            " 名古一体式充气娃娃真人比例成人用品自慰器任意姿+下体加热+实",
                            "茗振MZ-666F9  美胸宝胸部按摩器电动按摩仪 无线美胸宝",
                            "美人誌丰胸贴 丰满胸部产品 产后增大丰乳美乳护理非精油乳霜膏",
                            " 丰韵美乳精油 紧实丰满产后美胸美乳产品粉嫩胸部按摩护理乳霜膏",
                            "贝诗黛儿 美乳霜 丰韵霜精油乳房护理美胸仪帖胸部护理增大按摩霜",
                            " 美人誌丰胸美乳贴4贴/盒 丰满胸部产品产后增大美胸护理优于精油",
                            " 久爱 男用充气娃娃真人比例自慰器成人情趣性用品美女升级版+处",
                            " 莱薇尔LAVER丰胸精油 丰胸产品丰胸霜美乳美胸丰乳霜贴胸部护理",
                            " 莱薇尔LAVER丰胸精油 丰胸产品丰胸霜美乳美胸丰乳霜贴胸部护理",
                            " 泰国Stherb圣荷纳诺美胸霜丰胸产品精油霜15ml/支胸部护理按摩霜",
                            " 泰国圣荷纳诺美胸精华露丰胸15ml 坚挺增大 产后护理精油霜产品",
                            " 少女丰韵美胸霜 不含激素妙正丰胸霜增大美乳霜产后紧致产品胸部",
                            " 泰国圣荷私处护理精华 缩阴产品阴道收缩紧致滋润女性私密护理洗",
                            " 杜蕾斯 避孕套 男用 安全套 计生用品 LOVE装10只装 成人用品Dur",
                            " 美人誌丰胸贴非膏霜优于丰满美乳胸膏霜胸部护理非按摩精油贴产",
                            "谜姬大咪咪胸部倒模乳房玩具成人情趣性用品",
                            "  紧实丰满产后增大美胸美乳产品 胸部护理乳霜膏精油贴 1袋2片装",
                            "谜姬 成人用品 大咪咪仿真胸部 实体乳房倒模飞机杯  "
                  };
        System.out.println(productNames.length);

        //region images
        String[] images = new String[]
                  {
                            "/xiong2/20170129194928795.jpg",
                            "/xiong2/20170129194929973.jpg",
                            "/xiong2/20170129194931571.jpg",
                            "/xiong2/20170129194933327.jpg",
                            "/xiong2/20170129194935902.jpg",
                            "/xiong2/20170129194938633.jpg",
                            "/xiong2/20170129194941885.jpg",
                            "/xiong2/20170129194944472.jpg",
                            "/xiong2/20170129194947392.jpg",
                            "/xiong2/20170129194949566.jpg",
                            "/xiong2/20170129194950192.jpg",
                            "/xiong2/20170129194953498.jpg",
                            "/xiong2/20170129194954762.jpg",
                            "/xiong2/20170129194955134.jpg",
                            "/xiong2/20170129194958857.jpg",
                            "/xiong2/20170129195000154.jpg",
                            "/xiong2/20170129195002820.jpg",
                            "/xiong2/20170129195003664.jpg",
                            "/xiong2/20170129195004245.jpg",
                            "/xiong2/20170129195006852.jpg",
                            "/xiong2/20170129195010804.jpg",
                            "/xiong2/20170129195013480.jpg",
                            "/xiong2/20170129195014417.jpg",
                            "/xiong2/20170129195015934.jpg",
                            "/xiong2/20170129195016430.jpg",
                            "/xiong2/20170129195017467.jpg",
                            "/xiong2/20170129195019354.jpg",
                            "/xiong2/20170129195020424.jpg",
                            "/xiong2/20170129195022446.jpg",
                            "/xiong2/2017012919503746.jpg",
                            "/xiong2/20170129195038152.jpg",
                            "/xiong2/20170129195038497.jpg",
                            "/xiong2/20170129195039239.jpg",
                            "/xiong2/20170129195040959.jpg",
                            "/xiong2/20170129195041566.jpg",
                            "/xiong2/20170129195042575.jpg",
                            "/xiong2/20170129195044608.jpg",
                            "/xiong2/20170129195045389.jpg",
                            "/xiong2/20170129195046257.jpg",
                            "/xiong2/20170129195047519.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195048843.jpg",
                            "/xiong2/20170129195049420.jpg",
                            "/xiong2/20170129195051570.jpg",
                            "/xiong2/20170129195052747.jpg",
                            "/xiong2/20170129195053554.jpg",
                            "/xiong2/20170129195054379.jpg",
                            "/xiong2/2017012919505576.jpg",
                            "/xiong2/20170129195056235.jpg",
                            "/xiong2/20170129195057929.jpg",
                            "/xiong2/20170129195058262.jpg",
                            "/xiong2/20170129195100967.jpg",
                            "/xiong2/20170129195101362.jpg",
                            "/xiong2/2017012919510216.jpg",
                            "/xiong2/20170129195104710.jpg",
                            "/xiong2/20170129195105677.jpg",
                            "/xiong2/20170129195106688.jpg",
                            "/xiong2/20170129195107537.jpg",
                            "/xiong2/20170129195108242.jpg",
                            "/xiong2/20170129195108242.jpg",
                            "/xiong2/20170129195108242.jpg",
                            "/xiong2/20170129195108242.jpg",
                            "/xiong2/20170129195108242.jpg",
                            "/xiong2/20170129195108242.jpg",
                            "/xiong2/20170129195108242.jpg"
                  };
        //endregion

        String[] newImages = Arrays.copyOfRange(images, 0, productNames.length);
        System.out.println(newImages.length);

        String s = "<table width=\"1750\" border=\"0\">\n" +
                  "  <tr>\n" +
                  "    <td>a</td>\n" +
                  "    <td>b</td>\n" +
                  "    <td>c</td>\n" +
                  "    <td>d</td>\n" +
                  "  </tr>\n";
        for (int i = 0; i < productNames.length; i++)
        {
            s += "  <tr>\n" +
                      "    <td>" + productNames[i] + "</td>\n" +
                      "    <td>" + newImages[i] + "</td>\n" +
                      "    <td>" + newImages[i] + "</td>\n" +
                      "    <td>" + productNames[i] + "</td>\n" +
                      "  </tr>\n";
        }
        s += "</table>";

        //System.out.println(s);
        Logger.getLogger(NiceBoxTest1.class).info("\n" + s);

    }


}
















