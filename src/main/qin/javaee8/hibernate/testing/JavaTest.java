package qin.javaee8.hibernate.testing;

import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JavaTest
{
    /*
     //region 苹果
        $('#type_apple').click(function() {
                htmlMobileType = "apple";
        }
        );
        //endregion
     */
    private void type(String[] id, String[] _region)
    {
        for (int i = 0; i < id.length; i++)
        {
            System.out.println
                      (
                                "//region " + _region[i] + "\n" +
                                          "        $('#" + id[i] + "').click(function() {\n" +
                                          "                htmlMobileType = \"" + _region[i] + "\";\n" +
                                          "        }\n" +
                                          "        );\n" +
                                          "        //endregion\n"
                      );
        }
    }

    @org.junit.Test
    public void pp()
    {
        type
                  (
                            new String[]{
                                      "type_huawei",
                                      "type_leshi",
                                      "type_meizu",
                                      "type_oppo",
                                      "type_sanxing",
                                      "type_vivo",
                                      "type_xiaomi"
                            }, new String[]{
                                      "huawei", "leshi", "meizu", "oppo", "sanxing", "vivo", "xiaomi"
                            }
                  );
    }

    //@org.junit.Test
    public void javaTEst1()
    {
        String s = "asfsda,adsfsdaf,asdfsadf,asdfsadf,asdfdsa,";
        String[] ss = s.split(",");
        Object o = 0;
    }

    //@org.junit.Test
    public void batchUpdateGoodsTest()
    {
        //从后台接收的商品名称一定是这样的
        String goodsName = "商品名称：丹麦蓝罐曲奇商品编号：                      319873商品毛重：1.4kg商品产地：丹麦加工工艺：烘烤类包装单位：" +
                  "罐装口味： 什锦味，其它产品产地：                丹麦蛋糕糕点分类：                      西式糕点饼干分类：曲奇饼干包装：礼盒装分类：饼干适用场景：" +
                  "节日，送礼，聚会：   ";
        //模拟:商品名称根据:分割
        String newStr = goodsName.replace("：", "\n");
        //System.out.println(newStr);
        List<String> strList = new ArrayList<>();
        String[] arrays = newStr.split("\n");
        for (int i = 0; i < arrays.length; i++)
        {
            //System.out.println(arrays[i]);
            strList.add(arrays[i].trim());
        }

        Object _debug = 0;
    }

    //@org.junit.Test
    public void listFiles() throws Exception
    {
        StringBuilder sb = new StringBuilder();
        String target = "E:\\xampps\\htdocs\\javaee8_2017\\xiaomi";
        File file = new File(target);
        File[] list = file.listFiles();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < list.length; i++)
        {
            //sb.append(list[i]).append("\n");
            stringList.add(list[i].toString());
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < stringList.size(); i++)
        {
            String sList = stringList.get(i);
            res.append("\"");
            res.append(sList.replace(target + "\\", "http://localhost/javaee8_2017/xiaomi/"));
            res.append("\",");
            res.append("\n");
        }

        Logger.getLogger(JavaTest.class).info("\n" + res.toString());
        System.out.println(res.toString());

        Object _debug = 0;
    }


    //@org.junit.Test
    public void testPath()
    {
        System.out.println(System.getProperty("java_home"));
    }
    //http://localhost:8080/javaee8_201702/mobileGoods8/doMainView.com

}













