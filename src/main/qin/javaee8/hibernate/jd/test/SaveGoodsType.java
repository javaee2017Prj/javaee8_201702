package qin.javaee8.hibernate.jd.test;

import org.junit.Test;
import qin.javaee8.hibernate.jd.domain.JDGoodsType;
import qin.javaee8.hibernate.testing.MyTest;

@SuppressWarnings("all")
public class SaveGoodsType extends MyTest
{
    //region makeJDGoodsType_allParent
    @Test
    public void makeJDGoodsType_allParent() throws Exception
    {
        JDGoodsType JDGoodsType0 = new JDGoodsType("家用电器");
        session.save(JDGoodsType0);
        JDGoodsType JDGoodsType1 = new JDGoodsType("手机/运营商/数码");
        session.save(JDGoodsType1);
        JDGoodsType JDGoodsType2 = new JDGoodsType("电脑办公");
        session.save(JDGoodsType2);
        JDGoodsType JDGoodsType3 = new JDGoodsType("家居/家具/家装/厨具");
        session.save(JDGoodsType3);
        JDGoodsType JDGoodsType4 = new JDGoodsType("男装/ 女装/ 童装/ 内衣");
        session.save(JDGoodsType4);
        JDGoodsType JDGoodsType5 = new JDGoodsType("个护化妆/ 清洁用品/ 宠物");
        session.save(JDGoodsType5);
        JDGoodsType JDGoodsType6 = new JDGoodsType("鞋靴/ 箱包/ 珠宝/ 奢侈品");
        session.save(JDGoodsType6);
        JDGoodsType JDGoodsType7 = new JDGoodsType("运动/ 户外/ 钟表");
        session.save(JDGoodsType7);
        JDGoodsType JDGoodsType8 = new JDGoodsType("汽车/ 汽车用品");
        session.save(JDGoodsType8);
        JDGoodsType JDGoodsType9 = new JDGoodsType("母婴/ 玩具乐器");
        session.save(JDGoodsType9);
        JDGoodsType JDGoodsType10 = new JDGoodsType("食品/ 酒类/ 生鲜/ 特产");
        session.save(JDGoodsType10);
        JDGoodsType JDGoodsType11 = new JDGoodsType("医药保健");
        session.save(JDGoodsType11);
        JDGoodsType JDGoodsType12 = new JDGoodsType("图书/ 音像/ 电子书");
        session.save(JDGoodsType12);
        JDGoodsType JDGoodsType13 = new JDGoodsType("机票/ 酒店/ 旅游/ 生活");
        session.save(JDGoodsType13);
        JDGoodsType JDGoodsType14 = new JDGoodsType("理财/ 众筹/ 白条/ 保险");
        session.save(JDGoodsType14);

        transaction.commit();
    }
    //endregion

    @Test
    public void batch()
    {
        saveChildren0();
        saveChildren1();
        saveChildren2();
        saveChildren3();
        saveChildren4();
        saveChildren5();
        saveChildren6();
        saveChildren7();
        saveChildren8();
        saveChildren9();
        saveChildren10();
        saveChildren11();
        saveChildren12();
        saveChildren13();
        saveChildren14();
        saveChildren_化妆0();
        saveChildren_化妆1();
        saveChildren_化妆2();
        saveChildren_化妆3();
        saveChildren_化妆4();
        saveChildren_化妆5();
        saveChildren_化妆6();
        saveChildren_化妆7();
        saveChildren_家居0();
        saveChildren_家居1();
        saveChildren_家居2();
        saveChildren_家居3();
        saveChildren_家居4();
        saveChildren_家居5();
        saveChildren_家居6();
        saveChildren_手机0();
        saveChildren_手机1();
        saveChildren_手机2();
        saveChildren_手机3();
        saveChildren_手机4();
        saveChildren_手机5();
        saveChildren_手机6();
        saveChildren_手机7();
        saveChildren_电脑0();
        saveChildren_电脑1();
        saveChildren_电脑2();
        saveChildren_电脑3();
        saveChildren_电脑4();
        saveChildren_电脑5();
        saveChildren_电脑6();
        saveChildren_电脑7();
        saveChildren_男装女装0();
        saveChildren_男装女装1();
        saveChildren_男装女装2();
        saveChildren_男装女装3();
        saveChildren_男装女装4();

        transaction.commit();
    }

    //region 保存 理财/ 众筹/ 白条/ 保险

    //-------------------------------------------------------------------------------------------------------


    //region 保存
    @Test
    public void saveChildren_理财金融0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '理财'").list().get(0);
        String[] children =
                  {
                            "京东小金库",
                            "票据理财",
                            "基金理财",
                            "定期理财",
                            "固收理财",
                            "妈妈理财"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_理财金融1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '众筹'").list().get(0);
        String[] children =
                  {
                            "智能硬件",
                            "流行文化",
                            "生活美学",
                            "公益",
                            "其他权益众筹"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_理财金融2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '东家'").list().get(0);
        String[] children =
                  {
                            "私募股权"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_理财金融3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '白条'").list().get(0);
        String[] children =
                  {
                            "京东白条",
                            "白条联名卡",
                            "京东钢镚",
                            "旅游白条",
                            "安居白条",
                            "校园白条",
                            "京东金采"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_理财金融4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '钱包'").list().get(0);
        String[] children =
                  {
                            "京东钱包"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_理财金融5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '保险'").list().get(0);
        String[] children =
                  {
                            "车险",
                            "健康险",
                            "意外险",
                            "旅行险"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion


    //-------------------------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren14()
    {
        saveChildren_理财金融0();
        saveChildren_理财金融1();
        saveChildren_理财金融2();
        saveChildren_理财金融3();
        saveChildren_理财金融4();
        saveChildren_理财金融5();

        transaction.commit();
    }

    //endregion

    //region 图书/ 音像/ 电子书

    //-------------------------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_图书0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '音像'").list().get(0);
        String[] children =
                  {
                            "音像>>音乐",
                            "影视",
                            "教育音像",
                            "音像>>游戏",
                            "影视/动漫周边"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '少儿'").list().get(0);
        String[] children =
                  {
                            "0-2岁",
                            "3-6岁",
                            "7-10岁",
                            "11-14岁",
                            "儿童文学",
                            "绘本",
                            "科普",
                            "幼儿启蒙",
                            "手工游戏",
                            "智力开发"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '教育'").list().get(0);
        String[] children =
                  {
                            "教材",
                            "中小学教辅",
                            "考试",
                            "外语学习",
                            "字典词典"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '文艺'").list().get(0);
        String[] children =
                  {
                            "小说",
                            "文学",
                            "青春文学",
                            "传记",
                            "动漫",
                            "艺术",
                            "摄影",
                            "书法",
                            "文艺>>音乐",
                            "绘画"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '经管励志'").list().get(0);
        String[] children =
                  {
                            "管理",
                            "金融与投资",
                            "经济",
                            "经管励志>>励志与成功"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '人文社科'").list().get(0);
        String[] children =
                  {
                            "历史",
                            "心理学",
                            "政治/军事",
                            "国学/古籍",
                            "哲学/宗教",
                            "社会科学",
                            "法律",
                            "文化"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '生活'").list().get(0);
        String[] children =
                  {
                            "育儿/家教",
                            "孕产/胎教",
                            "健身保健",
                            "旅游/地图",
                            "美食",
                            "时尚美妆",
                            "家居",
                            "手工DIY",
                            "两性",
                            "体育"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '科技'").list().get(0);
        String[] children =
                  {
                            "计算机与互联网",
                            "科技>>科普",
                            "建筑",
                            "工业技术",
                            "电子/通信",
                            "医学",
                            "科学与自然",
                            "农林"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书8()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '刊/原版'").list().get(0);
        String[] children =
                  {
                            "杂志/期刊",
                            "英文原版书",
                            "港台图书"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书9()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '电子书'").list().get(0);
        String[] children =
                  {
                            "畅读VIP",
                            "电子书>>小说",
                            "电子书>>励志与成功",
                            "经济金融",
                            "电子书>>文学",
                            "社科",
                            "婚恋两性",
                            "外文原版",
                            "免费"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_图书10()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '数字音乐'").list().get(0);
        String[] children =
                  {
                            "通俗流行",
                            "古典音乐",
                            "摇滚说唱",
                            "爵士蓝调",
                            "乡村民谣",
                            "有声读物"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //-------------------------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren13()
    {
        saveChildren_图书0();
        saveChildren_图书1();
        saveChildren_图书2();
        saveChildren_图书3();
        saveChildren_图书4();
        saveChildren_图书5();
        saveChildren_图书6();
        saveChildren_图书7();
        saveChildren_图书8();
        saveChildren_图书9();
        saveChildren_图书10();

        transaction.commit();
    }

    //endregion

    //region 保存 医药保健

    //-------------------------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_医药保健0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '中西药品'").list().get(0);
        String[] children =
                  {
                            "感冒咳嗽",
                            "补肾壮阳",
                            "补气养血",
                            "止痛镇痛",
                            "耳鼻喉用药",
                            "眼科用药",
                            "口腔用药",
                            "皮肤用药",
                            "肠胃消化",
                            "风湿骨外伤",
                            "男科/泌尿",
                            "妇科用药",
                            "儿科用药",
                            "心脑血管",
                            "肝胆用药"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_医药保健1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '营养健康'").list().get(0);
        String[] children =
                  {
                            "保健3免1",
                            "调节免疫",
                            "调节三高",
                            "缓解疲劳",
                            "美体塑身",
                            "美容养颜",
                            "肝肾养护",
                            "肠胃养护",
                            "明目益智",
                            "骨骼健康",
                            "改善睡眠",
                            "抗氧化",
                            "耐缺氧"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_医药保健2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '营养成分'").list().get(0);
        String[] children =
                  {
                            "维生素/矿物质",
                            "蛋白质",
                            "鱼油/磷脂",
                            "螺旋藻",
                            "番茄红素",
                            "叶酸",
                            "葡萄籽",
                            "左旋肉碱",
                            "辅酶Q10",
                            "益生菌",
                            "玛咖",
                            "膳食纤维",
                            "牛初乳",
                            "胶原蛋白",
                            "大豆异黄酮",
                            "芦荟提取",
                            "酵素"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_医药保健3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '滋补养生'").list().get(0);
        String[] children =
                  {
                            "阿胶",
                            "蜂蜜/蜂产品",
                            "枸杞",
                            "燕窝",
                            "海参_",
                            "冬虫夏草",
                            "人参/西洋参",
                            "三七",
                            "鹿茸",
                            "雪蛤",
                            "青钱柳",
                            "石斛/枫斗",
                            "灵芝/孢子粉",
                            "当归",
                            "养生茶饮",
                            "药食同源"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_医药保健4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '成人用品'").list().get(0);
        String[] children =
                  {
                            "安全避孕",
                            "验孕测孕",
                            "人体润滑",
                            "男用延时",
                            "男用器具",
                            "女用器具",
                            "成人用品>>情趣内衣"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_医药保健5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '保健器械'").list().get(0);
        String[] children =
                  {
                            "器械3免1",
                            "血压计",
                            "血糖仪",
                            "血氧仪",
                            "体温计",
                            "体重秤",
                            "胎心仪",
                            "呼吸制氧",
                            "雾化器",
                            "助听器",
                            "轮椅",
                            "拐杖",
                            "中医保健",
                            "养生器械",
                            "理疗仪",
                            "家庭护理",
                            "智能健康"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_医药保健6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '护理护具'").list().get(0);
        String[] children =
                  {
                            "隐形眼镜",
                            "护理液",
                            "护理护具>>口罩",
                            "眼罩/耳塞",
                            "跌打损伤",
                            "暖贴",
                            "鼻喉护理",
                            "眼部保健",
                            "美体护理"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion


    //-------------------------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren12()
    {
        saveChildren_医药保健0();
        saveChildren_医药保健1();
        saveChildren_医药保健2();
        saveChildren_医药保健3();
        saveChildren_医药保健4();
        saveChildren_医药保健5();
        saveChildren_医药保健6();

        transaction.commit();
    }

    //endregion

    //region 保存 食品/ 酒类/ 生鲜/ 特产

    //-------------------------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_所有食品0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '新鲜水果'").list().get(0);
        String[] children =
                  {
                            "进口水果",
                            "国产水果",
                            "苹果",
                            "奇异果",
                            "车厘子",
                            "橙子",
                            "牛油果",
                            "火龙果",
                            "榴莲",
                            "柠檬",
                            "芒果",
                            "时令水果"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '海鲜水产'").list().get(0);
        String[] children =
                  {
                            "虾类",
                            "鱼类",
                            "蟹类",
                            "贝类",
                            "海参",
                            "海产干货",
                            "三文鱼",
                            "北极甜虾",
                            "扇贝",
                            "黄花鱼",
                            "大闸蟹",
                            "鲜活水产"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '肉禽蛋品'").list().get(0);
        String[] children =
                  {
                            "牛肉",
                            "猪肉",
                            "羊肉",
                            "鸡肉",
                            "特色禽类",
                            "牛排",
                            "牛腩",
                            "牛腱",
                            "肋排",
                            "鸡翅",
                            "冷鲜肉",
                            "咸鸭蛋",
                            "鸡蛋"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '新鲜蔬菜'").list().get(0);
        String[] children =
                  {
                            "根茎类",
                            "茄瓜果类",
                            "叶菜类",
                            "葱姜蒜椒",
                            "鲜菌菇",
                            "半加工蔬菜",
                            "西红柿",
                            "玉米",
                            "山药"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '冷饮冻食'").list().get(0);
        String[] children =
                  {
                            "水饺",
                            "面点",
                            "速冻半成品",
                            "火锅丸串",
                            "奶酪/黄油",
                            "汤圆",
                            "冰激凌",
                            "低温奶"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '中外名酒'").list().get(0);
        String[] children =
                  {
                            "白酒",
                            "葡萄酒",
                            "洋酒",
                            "啤酒",
                            "黄酒/养生酒",
                            "收藏酒/陈年老酒"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '进口食品'").list().get(0);
        String[] children =
                  {
                            "牛奶",
                            "饼干蛋糕",
                            "糖果/巧克力",
                            "休闲零食",
                            "冲调饮品",
                            "进口食品>>粮油调味"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '休闲食品'").list().get(0);
        String[] children =
                  {
                            "休闲食品>>休闲零食",
                            "坚果炒货",
                            "肉干肉脯",
                            "熟食腊味",
                            "蜜饯果干",
                            "休闲食品>>糖果/巧克力",
                            "休闲食品>>饼干蛋糕",
                            "无糖食品",
                            "月饼"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品8()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '地方特产'").list().get(0);
        String[] children =
                  {
                            "新疆",
                            "四川",
                            "云南",
                            "湖南",
                            "内蒙",
                            "北京",
                            "山西",
                            "福建",
                            "东北",
                            "其他"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品9()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '茗茶'").list().get(0);
        String[] children =
                  {
                            "铁观音",
                            "普洱",
                            "龙井",
                            "绿茶",
                            "红茶",
                            "乌龙茶",
                            "花草茶",
                            "花果茶",
                            "黑茶",
                            "白茶",
                            "养生茶",
                            "其他茶"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品10()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '饮料冲调'").list().get(0);
        String[] children =
                  {
                            "饮料",
                            "饮用水",
                            "咖啡/奶茶",
                            "蜂蜜/柚子茶",
                            "冲饮谷物",
                            "成人奶粉"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_所有食品11()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '粮油调味'").list().get(0);
        String[] children =
                  {
                            "米面杂粮",
                            "食用油",
                            "调味品",
                            "南北干货",
                            "方便食品",
                            "烘焙原料",
                            "有机食品"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //-------------------------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren11()
    {
        saveChildren_所有食品0();
        saveChildren_所有食品1();
        saveChildren_所有食品2();
        saveChildren_所有食品3();
        saveChildren_所有食品4();
        saveChildren_所有食品5();
        saveChildren_所有食品6();
        saveChildren_所有食品7();
        saveChildren_所有食品8();
        saveChildren_所有食品9();
        saveChildren_所有食品10();
        saveChildren_所有食品11();

        transaction.commit();
    }

    //endregion

    //region 保存 母婴/ 玩具乐器

    //-------------------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_母婴0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '奶粉'").list().get(0);
        String[] children =
                  {
                            "1段",
                            "2段",
                            "3段",
                            "4段",
                            "孕妈奶粉",
                            "特殊配方奶粉",
                            "有机奶粉"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '营养辅食'").list().get(0);
        String[] children =
                  {
                            "米粉/菜粉",
                            "面条/粥",
                            "果泥/果汁",
                            "益生菌/初乳",
                            "DHA",
                            "钙铁锌/维生素",
                            "清火/开胃",
                            "宝宝零食"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '尿裤湿巾'").list().get(0);
        String[] children =
                  {
                            "NB",
                            "S",
                            "M",
                            "L",
                            "XL",
                            "XXL",
                            "拉拉裤",
                            "成人尿裤",
                            "婴儿湿巾"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '喂养用品'").list().get(0);
        String[] children =
                  {
                            "奶瓶奶嘴",
                            "吸奶器",
                            "暖奶消毒",
                            "辅食料理机",
                            "牙胶安抚",
                            "食物存储",
                            "儿童餐具",
                            "水壶/水杯",
                            "围兜/防溅衣"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '洗护用品'").list().get(0);
        String[] children =
                  {
                            "宝宝护肤",
                            "日常护理",
                            "洗发沐浴",
                            "洗澡用具",
                            "洗衣液/皂",
                            "理发器_",
                            "婴儿口腔清洁",
                            "坐便器",
                            "驱蚊防晒"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '寝居服饰'").list().get(0);
        String[] children =
                  {
                            "睡袋/抱被",
                            "家居床品",
                            "安全防护",
                            "爬行垫",
                            "婴儿内衣",
                            "婴儿礼盒",
                            "婴儿鞋帽袜",
                            "婴儿外出服"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '妈妈专区'").list().get(0);
        String[] children =
                  {
                            "防辐射服",
                            "孕妈装",
                            "孕妇护肤",
                            "妈咪包/背婴带",
                            "待产护理",
                            "产后塑身",
                            "文胸/内裤",
                            "防溢乳垫",
                            "孕期一样"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '童车童床'").list().get(0);
        String[] children =
                  {
                            "童车童床>>安全座椅",
                            "婴儿推车",
                            "婴儿床",
                            "婴儿床垫",
                            "餐椅",
                            "学步车",
                            "三轮车",
                            "自行车",
                            "扭扭车",
                            "滑板车",
                            "童车童床>>电动车"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴8()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '玩具'").list().get(0);
        String[] children =
                  {
                            "适用年龄",
                            "遥控/电动",
                            "益智玩具",
                            "积木拼插",
                            "动漫玩具",
                            "毛绒布艺",
                            "模型玩具",
                            "健身玩具",
                            "娃娃玩具",
                            "DIY玩具",
                            "创意减压"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_母婴9()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '乐器'").list().get(0);
        String[] children =
                  {
                            "钢琴",
                            "电子琴/电钢琴",
                            "吉他/尤克里里",
                            "打击乐器",
                            "西洋管弦",
                            "民族乐器",
                            "乐器配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //-------------------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren10()
    {
        saveChildren_母婴0();
        saveChildren_母婴1();
        saveChildren_母婴2();
        saveChildren_母婴3();
        saveChildren_母婴4();
        saveChildren_母婴5();
        saveChildren_母婴6();
        saveChildren_母婴7();
        saveChildren_母婴8();
        saveChildren_母婴9();

        transaction.commit();
    }

    //endregion

    //region 保存 汽车/ 汽车用品

    //------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_汽车用品0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '汽车车型'").list().get(0);
        String[] children =
                  {
                            "微型车",
                            "小型车",
                            "紧凑型车",
                            "中型车",
                            "中大型车",
                            "豪华车",
                            "MPV",
                            "SUV",
                            "跑车"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '汽车价格'").list().get(0);
        String[] children =
                  {
                            "5万以下",
                            "5-8万",
                            "8-10万",
                            "10-15万",
                            "15-25万",
                            "25-40万",
                            "40万以上"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '汽车品牌'").list().get(0);
        String[] children =
                  {
                            "宝马",
                            "上汽大众",
                            "陆风",
                            "一汽奔腾",
                            "东风标致",
                            "比亚迪",
                            "华晨汽车"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '维修保养'").list().get(0);
        String[] children =
                  {
                            "养护3免1",
                            "机油",
                            "添加剂",
                            "防冻液",
                            "滤清器",
                            "火花塞",
                            "雨刷",
                            "车灯",
                            "减震器",
                            "轮胎",
                            "轮毂",
                            "刹车片/盘",
                            "维修配件",
                            "蓄电池",
                            "底盘装甲/护板",
                            "车载电器>>贴膜",
                            "汽修工具",
                            "改装配件",
                            "正时皮带",
                            "汽车喇叭",
                            "汽车玻璃"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '车载电器'").list().get(0);
        String[] children =
                  {
                            "车品3免1",
                            "行车记录仪",
                            "导航仪",
                            "车载电器>>电源",
                            "电器配件",
                            "车载电器>>净化器",
                            "车载影音",
                            "车载电器>>冰箱",
                            "安全预警仪",
                            "倒车雷达",
                            "蓝牙设备",
                            "智能驾驶",
                            "车载电台",
                            "吸尘器_",
                            "智能车机",
                            "汽车音响",
                            "车载生活电器"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '美容清洗'").list().get(0);
        String[] children =
                  {
                            "车蜡",
                            "镀晶镀膜",
                            "补漆笔",
                            "玻璃水",
                            "清洁剂",
                            "洗车机",
                            "洗车水枪",
                            "洗车配件",
                            "毛巾掸子"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '汽车装饰'").list().get(0);
        String[] children =
                  {
                            "装饰3免1",
                            "脚垫",
                            "座垫",
                            "座套",
                            "后备箱垫",
                            "方向盘套",
                            "头枕腰靠",
                            "香水",
                            "空气净化",
                            "功能小件",
                            "车衣",
                            "挂件摆件",
                            "车身装饰件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '安全自驾'").list().get(0);
        String[] children =
                  {
                            "安全座椅",
                            "胎压监测",
                            "充气泵",
                            "防盗设备",
                            "应急救援",
                            "保温箱",
                            "储物箱",
                            "自驾野营",
                            "摩托车装备",
                            "摩托车"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品8()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '赛事改装'").list().get(0);
        String[] children =
                  {
                            "赛事服装",
                            "赛事用品",
                            "制动系统",
                            "悬挂系统",
                            "进气系统",
                            "排气系统",
                            "电子管理",
                            "车身强化"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_汽车用品9()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '汽车服务'").list().get(0);
        String[] children =
                  {
                            "清洗美容",
                            "功能升级",
                            "保养维修",
                            "驾驶培训",
                            "ETC",
                            "加油卡",
                            "油卡充值"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //------------------------------------------------------------------------------

    @Test
    public void saveALLChildren9()
    {
        saveChildren_汽车用品0();
        saveChildren_汽车用品1();
        saveChildren_汽车用品2();
        saveChildren_汽车用品3();
        saveChildren_汽车用品4();
        saveChildren_汽车用品5();
        saveChildren_汽车用品6();
        saveChildren_汽车用品7();
        saveChildren_汽车用品8();
        saveChildren_汽车用品9();

        transaction.commit();
    }

    //endregion

    //region 保存 运动/ 户外/ 钟表

    //------------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_户外0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '运动鞋包'").list().get(0);
        String[] children =
                  {
                            "运动鞋包>>跑步鞋",
                            "运动鞋包>>休闲鞋",
                            "运动鞋包>>篮球鞋",
                            "运动鞋包>>帆布鞋",
                            "运动鞋包>>板鞋",
                            "运动鞋包>>拖鞋",
                            "运动鞋包>>运动包",
                            "运动鞋包>>足球鞋",
                            "运动鞋包>>乒羽网鞋",
                            "运动鞋包>>训练鞋",
                            "运动鞋包>>专项运动鞋"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '运动服饰'").list().get(0);
        String[] children =
                  {
                            "运动服饰>>运动3免1",
                            "运动服饰>>T恤",
                            "运动服饰>>运动裤",
                            "运动服饰>>健身服",
                            "运动服饰>>运动套装",
                            "运动服饰>>运动背心",
                            "运动服饰>>羽绒服",
                            "运动服饰>>卫衣/套头衫",
                            "运动服饰>>棉服",
                            "运动服饰>>夹克/风衣",
                            "运动服饰>>运动配饰",
                            "运动服饰>>乒羽网服",
                            "运动服饰>>毛衫/线衫"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '健身训练'").list().get(0);
        String[] children =
                  {
                            "健身3免1",
                            "跑步机",
                            "健身车/动感单车",
                            "哑铃",
                            "仰卧板/收腹机",
                            "甩脂机",
                            "踏步机",
                            "运动护具",
                            "瑜伽舞蹈",
                            "武术搏击",
                            "综合训练器",
                            "其他大型器械",
                            "其他中小型器材"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '骑行运动'").list().get(0);
        String[] children =
                  {
                            "山地车/公路车",
                            "折叠车",
                            "电动车",
                            "平衡车",
                            "其他整车",
                            "骑行装备",
                            "骑行服"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '体育用品'").list().get(0);
        String[] children =
                  {
                            "乒乓球",
                            "羽毛球",
                            "篮球",
                            "足球",
                            "轮滑滑板",
                            "网球",
                            "高尔夫",
                            "台球",
                            "排球",
                            "棋牌麻将",
                            "体育用品>>其它"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '户外鞋服'").list().get(0);
        String[] children =
                  {
                            "户外鞋服>>户外风衣",
                            "户外鞋服>>徒步鞋",
                            "户外鞋服>>T恤",
                            "户外鞋服>>冲锋衣裤",
                            "户外鞋服>>速干衣裤",
                            "户外鞋服>>越野跑鞋",
                            "户外鞋服>>滑雪服",
                            "户外鞋服>>羽绒服/棉服",
                            "户外鞋服>>休闲衣裤",
                            "户外鞋服>>抓绒衣裤",
                            "户外鞋服>>溯溪鞋",
                            "户外鞋服>>沙滩/凉拖",
                            "户外鞋服>>休闲鞋",
                            "户外鞋服>>软壳衣裤",
                            "户外鞋服>>功能内衣",
                            "户外鞋服>>军迷服饰",
                            "户外鞋服>>登山鞋",
                            "户外鞋服>>工装鞋",
                            "户外鞋服>>户外袜"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '户外装备'").list().get(0);
        String[] children =
                  {
                            "户外3免1",
                            "帐篷/垫子",
                            "望远镜",
                            "野餐烧烤",
                            "便携桌椅床",
                            "背包",
                            "户外配饰",
                            "军迷用品",
                            "睡袋/吊床",
                            "救援装备",
                            "户外照明",
                            "旅游用品",
                            "户外工具",
                            "户外仪表",
                            "登山攀岩",
                            "极限户外",
                            "冲浪潜水",
                            "滑雪装备"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '垂钓用品'").list().get(0);
        String[] children =
                  {
                            "鱼竿鱼线",
                            "浮漂鱼饵",
                            "钓鱼桌椅",
                            "钓鱼配件",
                            "钓箱鱼包"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外8()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '游泳用品'").list().get(0);
        String[] children =
                  {
                            "泳镜",
                            "男士泳衣",
                            "女士泳衣",
                            "比基尼",
                            "泳帽",
                            "游泳包防水包",
                            "其它类型"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_户外9()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '钟表'").list().get(0);
        String[] children =
                  {
                            "钟表3免1",
                            "瑞表",
                            "国表",
                            "日韩表",
                            "欧美表",
                            "德表",
                            "儿童手表",
                            "钟表>>智能手表",
                            "闹钟",
                            "座钟挂钟",
                            "钟表配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }

        //
    }
    //endregion


    //------------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren8()
    {
        saveChildren_户外0();
        saveChildren_户外1();
        saveChildren_户外2();
        saveChildren_户外3();
        saveChildren_户外4();
        saveChildren_户外5();
        saveChildren_户外6();
        saveChildren_户外7();
        saveChildren_户外8();
        saveChildren_户外9();

        transaction.commit();
    }

    //endregion

    //region 保存 鞋靴/ 箱包/ 珠宝/ 奢侈品

    //-----------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_xx0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '时尚女鞋'").list().get(0);
        String[] children =
                  {
                            "时尚女鞋>>鞋包3免1",
                            "时尚女鞋>>女靴",
                            "时尚女鞋>>单鞋",
                            "时尚女鞋>>休闲鞋",
                            "时尚女鞋>>高跟鞋",
                            "时尚女鞋>>内增高",
                            "时尚女鞋>>坡跟鞋",
                            "时尚女鞋>>松糕鞋",
                            "时尚女鞋>>防水台",
                            "时尚女鞋>>鱼嘴鞋",
                            "时尚女鞋>>布鞋/绣花鞋",
                            "时尚女鞋>>拖鞋/人字拖",
                            "时尚女鞋>>马丁靴",
                            "时尚女鞋>>踝靴",
                            "时尚女鞋>>雪地靴",
                            "时尚女鞋>>妈妈鞋",
                            "时尚女鞋>>帆布鞋",
                            "时尚女鞋>>雨鞋/雨靴",
                            "时尚女鞋>>凉鞋",
                            "时尚女鞋>>鞋配件"

                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '流行男鞋'").list().get(0);
        String[] children =
                  {
                            "流行男鞋>>休闲鞋",
                            "流行男鞋>>商务休闲鞋",
                            "流行男鞋>>正装鞋",
                            "流行男鞋>>工装鞋",
                            "流行男鞋>>男靴",
                            "流行男鞋>>帆布鞋",
                            "流行男鞋>>功能鞋",
                            "流行男鞋>>增高鞋",
                            "流行男鞋>>定制鞋",
                            "流行男鞋>>拖鞋/人字拖",
                            "流行男鞋>>凉鞋/沙滩鞋",
                            "流行男鞋>>雨鞋/雨靴",
                            "流行男鞋>>传统布鞋",
                            "流行男鞋>>鞋配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '潮流女包'").list().get(0);
        String[] children =
                  {
                            "单肩包",
                            "手提包",
                            "斜挎包",
                            "潮流女包>>双肩包",
                            "潮流女包>>钱包",
                            "手拿包",
                            "卡包/零钱包",
                            "潮流女包>>钥匙包",
                            "真皮包",
                            "帆布包",
                            "小方包",
                            "水桶包",
                            "链条包",
                            "贝壳包"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '精品男包'").list().get(0);
        String[] children =
                  {
                            "男士钱包",
                            "单肩/斜挎包",
                            "商务公文包",
                            "双肩包",
                            "男士手包",
                            "卡包名片夹",
                            "钥匙包"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '功能箱包'").list().get(0);
        String[] children =
                  {
                            "拉杆箱",
                            "拉杆包",
                            "旅行包",
                            "电脑包",
                            "休闲运动包",
                            "书包",
                            "登山包",
                            "腰包/胸包",
                            "旅行配件",
                            "功能箱包>>相机包",
                            "妈咪包"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '奢侈品'").list().get(0);
        String[] children =
                  {
                            "奢品3免1",
                            "箱包",
                            "奢侈品>>钱包",
                            "服饰",
                            "腰带",
                            "鞋靴",
                            "太阳镜/眼镜框",
                            "饰品",
                            "配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '精选大牌'").list().get(0);
        String[] children =
                  {
                            "GUCCI",
                            "COACH",
                            "雷朋",
                            "施华洛世奇",
                            "MK",
                            "阿玛尼",
                            "菲拉格慕",
                            "VERSACE",
                            "普拉达",
                            "巴宝莉",
                            "万宝龙"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '礼品'").list().get(0);
        String[] children =
                  {
                            "电子烟",
                            "火机烟具",
                            "军刀军具",
                            "美妆礼品",
                            "工艺礼品",
                            "礼盒礼券",
                            "礼品文具",
                            "收藏品",
                            "古董文玩",
                            "礼品定制",
                            "创意礼品",
                            "电子礼品",
                            "婚庆节庆",
                            "鲜花",
                            "绿植",
                            "熏香",
                            "京东卡"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx8()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '珠宝首饰'").list().get(0);
        String[] children =
                  {
                            "珠宝3免1",
                            "黄金",
                            "K金",
                            "时尚饰品",
                            "钻石",
                            "翡翠玉石",
                            "银饰",
                            "水晶玛瑙",
                            "彩宝",
                            "铂金",
                            "木手串/把件",
                            "珍珠"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_xx9()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '金银投资'").list().get(0);
        String[] children =
                  {
                            "投资金",
                            "投资银",
                            "投资收藏",
                            "黄金托管"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //-----------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren7()
    {
        saveChildren_xx0();
        saveChildren_xx1();
        saveChildren_xx2();
        saveChildren_xx3();
        saveChildren_xx4();
        saveChildren_xx5();
        saveChildren_xx6();
        saveChildren_xx7();
        saveChildren_xx8();
        saveChildren_xx9();

        transaction.commit();
    }

    //endregion

    //region 保存 个护化妆/ 清洁用品/ 宠物

    //-------------------------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_化妆0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '面部护肤'").list().get(0);
        String[] children =
                  {
                            "卸妆",
                            "洁面",
                            "爽肤水",
                            "乳液面霜",
                            "精华",
                            "眼霜",
                            "防晒",
                            "面膜",
                            "剃须",
                            "面部护肤>>套装"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_化妆1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '洗发护发'").list().get(0);
        String[] children =
                  {
                            "洗发",
                            "护发",
                            "染发",
                            "造型",
                            "假发",
                            "美发工具",
                            "洗发护发>>套装"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }


    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_化妆2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '身体护理'").list().get(0);
        String[] children =
                  {
                            "沐浴",
                            "润肤",
                            "精油",
                            "颈部",
                            "手足",
                            "纤体塑形",
                            "美胸",
                            "身体护理>>套装"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }


    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_化妆3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '口腔护理'").list().get(0);
        String[] children =
                  {
                            "牙膏/牙粉",
                            "牙刷/牙线",
                            "漱口水",
                            "口腔护理>>套装"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }


    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_化妆4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '女性护理'").list().get(0);
        String[] children =
                  {
                            "卫生巾",
                            "卫生护垫",
                            "私密护理",
                            "脱毛膏"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }


    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_化妆5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '香水彩妆'").list().get(0);
        String[] children =
                  {
                            "女士香水",
                            "男士香水",
                            "底妆",
                            "眉笔",
                            "睫毛膏",
                            "眼线",
                            "眼影",
                            "唇膏/彩",
                            "腮红",
                            "美甲",
                            "美妆工具",
                            "香水彩妆>>套装"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }


    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_化妆6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '清洁用品'").list().get(0);
        String[] children =
                  {
                            "纸品湿巾",
                            "衣物清洁",
                            "清洁用品>>清洁工具",
                            "家庭清洁",
                            "一次性用品",
                            "驱虫用品",
                            "皮具护理"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }


    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_化妆7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '宠物生活'").list().get(0);
        String[] children =
                  {
                            "水族用品",
                            "宠物主粮",
                            "宠物零食",
                            "猫砂/尿布",
                            "洗护美容",
                            "家居日用",
                            "医疗保健",
                            "出行装备",
                            "宠物玩具",
                            "宠物牵引",
                            "宠物驱虫"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }


    }

    @Test
    public void saveALLChildren6()
    {
        saveChildren_化妆0();
        saveChildren_化妆1();
        saveChildren_化妆2();
        saveChildren_化妆3();
        saveChildren_化妆4();
        saveChildren_化妆5();
        saveChildren_化妆6();
        saveChildren_化妆7();


    }
    //endregion

    //-------------------------------------------------------------------------------------------------------

    //endregion

    //region 保存男装/女装

    //----------------------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_男装女装0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '女装'").list().get(0);
        String[] children =
                  {
                            "女装>>女装3免1", "女装>>毛呢大衣", "女装>>羽绒服", "女装>>连衣裙", "女装>>针织衫", "女装>>卫衣", "女装>>牛仔裤", "女装>>风衣", "女装>>T恤", "女装>>衬衫", "女装>>短外套", "女装>>打底衫", "女装>>打底裤", "女装>>棉服", "女装>>皮草", "女装>>羊毛衫", "羊绒衫", "女装>>真皮皮衣", "女装>>小西装", "女装>>休闲裤", "女装>>大码女装", "女装>>中老年女装", "女装>>设计师/潮牌", "女装>>半身裙", "女装>>仿皮皮衣", "女装>>马甲", "女装>>正装裤", "女装>>加绒裤", "女装>>婚纱", "女装>>礼服", "女装>>旗袍/唐装", "女装>>雪纺衫", "女装>>吊带/背心", "女装>>短裤"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_男装女装1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '男装'").list().get(0);
        String[] children =
                  {
                            "男装3免1", "男装>>羽绒服", "男装>>棉服", "男装>>针织衫", "男装>>夹克", "男装>>羊毛衫", "男装>>加绒裤", "男装>>真皮皮衣", "卫衣", "男装>>T恤", "男装>>马甲/背心", "男装>>西服套装", "男装>>牛仔裤", "男装>>休闲裤", "男装>>衬衫", "男装>>毛呢大衣", "男装>>风衣", "男装>>仿皮皮衣", "男装>>西服", "男装>>西裤", "男装>>卫裤/运动裤", "男装>>POLO衫", "男装>>短裤", "男装>>中老年男装", "男装>>大码男装", "男装>>羊绒衫", "男装>>设计师/潮牌", "男装>>工装", "男装>>唐装/中山装"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_男装女装2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '内衣'").list().get(0);
        String[] children =
                  {
                            "保暖内衣", "秋衣秋裤", "男式内裤", "女式内裤", "休闲棉袜", "商务男袜", "吊带/背心", "大码内衣", "打底衫", "睡衣/家居服", "文胸", "打底裤袜", "连裤袜/丝袜", "文胸套装", "情侣睡衣", "少女文胸", "抹胸", "内衣配件", "塑身美体", "美腿袜", "泳衣", "情趣内衣"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_男装女装3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '配饰'").list().get(0);
        String[] children =
                  {
                            "女士丝巾/围巾/披肩", "男士腰带/礼盒", "太阳镜", "光学镜架/镜片", "防辐射眼镜", "棒球帽", "贝雷帽", "鸭舌帽", "男士丝巾/围巾", "真皮手套", "毛线手套", "围巾/手套/帽子套装", "老花镜", "礼帽", "遮阳帽", "口罩", "游泳镜", "毛线帽", "女士腰带/礼盒", "遮阳伞/雨伞", "毛线/布面料", "领带/领结/领带夹", "耳罩/耳包", "袖扣", "钥匙扣"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_男装女装4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '童装童鞋'").list().get(0);
        String[] children =
                  {
                            "羽绒服/棉服", "套装", "上衣", "裤子", "童装童鞋>>内衣", "童装童鞋>>配饰", "运动鞋", "靴子", "皮鞋/帆布鞋", "功能鞋", "亲子装", "运动服", "演出服", "裙子", "凉鞋"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //----------------------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren5()
    {
        saveChildren_男装女装0();
        saveChildren_男装女装1();
        saveChildren_男装女装2();
        saveChildren_男装女装3();
        saveChildren_男装女装4();

        transaction.commit();
    }

    //endregion

    //region 保存家居

    //------------------------------------------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_家居0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '厨具'").list().get(0);
        String[] children =
                  {
                            "烹饪锅具", "刀剪菜板", "厨房配件", "水具酒具", "餐具", "茶具/咖啡具"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_家居1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '家纺'").list().get(0);
        String[] children =
                  {
                            "床品套件", "被子", "枕芯", "蚊帐", "凉席", "毛巾浴巾", "床单被罩", "床垫/床褥", "毯子", "抱枕靠垫", "窗帘/窗纱", "电热毯", "布艺软饰"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_家居2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '生活日用'").list().get(0);
        String[] children =
                  {
                            "收纳用品", "雨伞雨具", "净化除味", "浴室用品", "洗晒/熨烫", "缝纫/针织用品", "清洁工具"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_家居3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '家装软饰'").list().get(0);
        String[] children =
                  {
                            "家居3免1", "桌布/罩件", "地毯地垫", "沙发垫套/椅垫", "装饰字画", "装饰摆件", "手工/十字绣", "相框/照片墙", "墙贴/装饰贴", "花瓶花艺", "香薰蜡烛", "节庆饰品", "钟饰", "帘艺隔断", "创意家居", "保暖防护"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_家居4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '灯具'").list().get(0);
        String[] children =
                  {
                            "台灯", "灯具>>吸顶灯", "筒灯射灯", "LED灯", "节能灯", "落地灯", "五金电器", "应急灯/手电", "装饰灯", "吊灯", "氛围照明"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_家居5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '家具'").list().get(0);
        String[] children =
                  {
                            "卧室家具", "客厅家具", "餐厅家具", "书房家具", "儿童家具", "储物家具", "阳台/户外", "商业办公", "床", "床垫", "沙发", "电脑椅", "衣柜", "茶几", "电视柜", "餐桌", "电脑桌", "鞋架/衣帽架"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_家居6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '家装建材'").list().get(0);
        String[] children =
                  {
                            "家装3免1", "灯饰照明", "厨房卫浴", "五金工具", "电工电料", "墙地面材料", "装饰材料", "装修服务", "家装建材>>吸顶灯", "淋浴花洒", "开关插座", "油漆涂料", "龙头", "智能马桶盖", "监控安防", "门铃"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //------------------------------------------------------------------------------------------------

    @Test
    public void saveALLChildren4()
    {
        saveChildren_家居0();
        saveChildren_家居1();
        saveChildren_家居2();
        saveChildren_家居3();
        saveChildren_家居4();
        saveChildren_家居5();
        saveChildren_家居6();

        transaction.commit();
    }

    //endregion

    //region 保存子类
    @Test
    public void saveALLChildren1()
    {
        saveChildren0();
        saveChildren1();
        saveChildren2();
        saveChildren3();
        saveChildren4();
        saveChildren5();
        saveChildren6();
        saveChildren7();
        saveChildren8();
        saveChildren9();
        saveChildren10();
        saveChildren11();
        saveChildren12();
        saveChildren13();
        saveChildren14();

        transaction.commit();
    }

    @Test
    public void saveChildren0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '家用电器'").list().get(0);

        String[] children =
                  {
                            "电视", "空调", "洗衣机", "冰箱", "厨卫大电", "厨房小电", "生活电器", "个护健康", "家庭影音", "进口电器"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存手机

    @Test
    public void saveChildren_手机0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '手机通讯'").list().get(0);

        String[] children =
                  {
                            "手机",
                            "对讲机",
                            "以旧换新",
                            "手机维修"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }

    //region 保存
    @Test
    public void saveChildren_手机1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '运营商'").list().get(0);
        String[] children =
                  {
                            "充话费/流量", "170选号", "合约机", "办套餐", "选号码", "固话宽带", "京东通信", "中国移动", "中国联通", "中国电信"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_手机2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '手机配件'").list().get(0);
        String[] children =
                  {
                            "手机壳", "贴膜", "手机存储卡", "数据线", "充电器", "手机耳机", "创意配件", "手机饰品", "手机电池", "苹果周边", "移动电源", "蓝牙耳机", "手机支架", "车载配件", "拍照配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_手机3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '摄影摄像'").list().get(0);
        String[] children =
                  {
                            "数码相机", "单电/微单相机", "单反相机", "拍立得", "运动相机", "摄像机", "镜头", "户外器材", "影棚器材", "冲印服务", "数码相框"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_手机4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '数码配件'").list().get(0);
        String[] children =
                  {
                            "存储卡", "三脚架/云台", "相机包", "滤镜", "闪光灯/手柄", "相机清洁/贴膜", "机身附件", "镜头附件", "读卡器", "支架", "电池/充电器"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_手机5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '影音娱乐'").list().get(0);
        String[] children =
                  {
                            "耳机/耳麦", "音箱/音响", "便携/无线音箱", "收音机", "麦克风", "MP3/MP4", "专业音频"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_手机6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '智能设备'").list().get(0);
        String[] children =
                  {
                            "智能手环", "智能手表", "智能眼镜", "智能机器人", "运动跟踪器", "健康监测", "智能配饰", "智能家居", "体感车", "无人机", "其他配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_手机7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '电子教育'").list().get(0);
        String[] children =
                  {
                            "学生平板", "点读机/笔", "早教益智", "录音笔", "电纸书", "电子词典", "复读机 "
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    @Test
    public void saveALLChildren2()
    {
        saveChildren_手机0();
        saveChildren_手机1();
        saveChildren_手机2();
        saveChildren_手机3();
        saveChildren_手机4();
        saveChildren_手机5();
        saveChildren_手机6();
        saveChildren_手机7();

        transaction.commit();
    }

    //endregion

    //region 保存电脑

    //-------------------------------------------------------------

    //region 保存
    @Test
    public void saveChildren_电脑0()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '电脑整机'").list().get(0);
        String[] children =
                  {
                            "笔记本", "游戏本", "平板电脑", "平板电脑配件", "台式机", "一体机", "服务器/工作站", "笔记本配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_电脑1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '电脑配件'").list().get(0);
        String[] children =
                  {
                            "显示器", "CPU", "主板", "硬盘", "内存", "机箱", "电源", "散热器", "刻录机/光驱", "声卡/扩展卡", "装机配件", "显卡", "SSD固态硬盘", "组装电脑"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_电脑2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '外设产品'").list().get(0);
        String[] children =
                  {
                            "鼠标", "键盘", "键鼠套装", "网络仪表仪器", "U盘", "移动硬盘", "鼠标垫", "摄像头", "线缆", "手写板", "硬盘盒", "电脑工具", "电脑清洁", "UPS电源", "插座"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_电脑3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '游戏设备'").list().get(0);
        String[] children =
                  {
                            "游戏机", "游戏耳机", "手柄/方向盘", "游戏软件", "游戏周边"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_电脑4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '网络产品'").list().get(0);
        String[] children =
                  {
                            "路由器", "网络机顶盒", "交换机", "网络存储", "网卡", "4G/3G上网", "网络配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_电脑5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '办公设备'").list().get(0);
        String[] children =
                  {
                            "投影机", "投影配件", "多功能一体机", "打印机", "传真设备", "验钞/点钞机", "扫描设备", "复合机", "碎纸机", "考勤机", "收银机", "会议音频视频", "保险柜", "装订/封装机", "安防监控", "办公家具", "白板"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_电脑6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '文具耗材'").list().get(0);
        String[] children =
                  {
                            "硒鼓/墨粉", "墨盒", "色带", "纸类", "办公文具", "学生文具", "文件管理", "本册/便签", "计算器", "笔类", "画具画材", "财会用品", "刻录碟片/附件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren_电脑7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '服务产品'").list().get(0);
        String[] children =
                  {
                            "延保服务", "上门安装", "电脑>>维修保养", "电脑软件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //-------------------------------------------------------------

    @Test
    public void saveALLChildren3()
    {
        saveChildren_电脑0();
        saveChildren_电脑1();
        saveChildren_电脑2();
        saveChildren_电脑3();
        saveChildren_电脑4();
        saveChildren_电脑5();
        saveChildren_电脑6();
        saveChildren_电脑7();

        transaction.commit();
    }

    //endregion

    //region 家用电器

    //region 保存
    @Test
    public void saveChildren1()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '手机/运营商/数码'").list().get(0);

        String[] children =
                  {
                            "手机通讯", "运营商", "手机配件", "摄影摄像", "数码配件", "影音娱乐", "智能设备", "电子教育"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren2()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '电脑办公'").list().get(0);

        String[] children =
                  {
                            "电脑整机", "电脑配件", "外设产品", "游戏设备", "网络产品", "办公设备", "文具耗材", "服务产品"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren3()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '家居/家具/家装/厨具'").list().get(0);

        String[] children =
                  {
                            "厨具", "家纺", "生活日用", "家装软饰", "灯具", "家具", "家装建材"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren4()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '男装/ 女装/ 童装/ 内衣'").list().get(0);

        String[] children =
                  {
                            "女装", "男装", "内衣", "配饰", "童装童鞋"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren5()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '个护化妆/ 清洁用品/ 宠物'").list().get(0);

        String[] children =
                  {
                            "面部护肤", "洗发护发", "身体护理", "口腔护理", "女性护理", "香水彩妆", "清洁用品", "宠物生活"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren6()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '鞋靴/ 箱包/ 珠宝/ 奢侈品'").list().get(0);

        String[] children =
                  {
                            "时尚女鞋", "流行男鞋", "潮流女包", "精品男包", "功能箱包", "奢侈品", "精选大牌", "礼品", "珠宝首饰", "金银投资"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren7()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '运动/ 户外/ 钟表'").list().get(0);

        String[] children =
                  {
                            "运动鞋包", "运动服饰", "健身训练", "骑行运动", "体育用品", "户外鞋服", "户外装备", "垂钓用品", "游泳用品", "钟表"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren8()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '汽车/ 汽车用品'").list().get(0);

        String[] children =
                  {
                            "汽车车型", "汽车价格", "汽车品牌", "维修保养", "车载电器", "美容清洗", "汽车装饰", "安全自驾", "赛事改装", "汽车服务"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren9()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '母婴/ 玩具乐器'").list().get(0);

        String[] children =
                  {
                            "奶粉", "营养辅食", "尿裤湿巾", "喂养用品", "洗护用品", "寝居服饰", "妈妈专区", "童车童床", "玩具", "乐器"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren10()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '食品/ 酒类/ 生鲜/ 特产'").list().get(0);

        String[] children =
                  {
                            "新鲜水果", "海鲜水产", "肉禽蛋品", "新鲜蔬菜", "冷饮冻食", "中外名酒", "进口食品", "休闲食品", "地方特产", "茗茶", "饮料冲调", "粮油调味"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren11()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '医药保健'").list().get(0);

        String[] children =
                  {
                            "中西药品",
                            "营养健康",
                            "营养成分",
                            "滋补养生",
                            "成人用品",
                            "保健器械",
                            "护理护具"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren12()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '图书/ 音像/ 电子书'").list().get(0);

        String[] children =
                  {
                            "音像", "少儿", "教育", "文艺", "经管励志", "人文社科", "生活", "科技", "刊/原版", "电子书", "数字音乐"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren13()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '机票/ 酒店/ 旅游/ 生活'").list().get(0);

        String[] children =
                  {
                            "交通出行", "酒店预订", "旅游度假", "商旅服务", "演出票务", "生活缴费", "生活服务", "教育培训", "彩票", "游戏", "海外生活"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren14()
    {
        JDGoodsType parent = (JDGoodsType) session.createQuery("from JDGoodsType where goods_typeName = '理财/ 众筹/ 白条/ 保险'").list().get(0);

        String[] children =
                  {
                            "理财", "众筹", "东家", "白条", "钱包", "保险"
                  };

        for (int i = 0; i < children.length; i++)
        {
            JDGoodsType JDGoodsType = new JDGoodsType(children[i]);
            JDGoodsType.setParentJDGoodsType(parent);
            parent.getChildrenSet().add(JDGoodsType);
            session.save(JDGoodsType);
            session.update(parent);
        }
    }
    //endregion

    //endregion

}