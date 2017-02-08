package qin.hibernate.daotest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.dao.impl.MobileBSDAOImpl;
import qin.javaee8.hibernate.domain.MobileGoods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import static qin.javaee8.hibernate.testing.GoodsImages.images;

@SuppressWarnings("all")
public class MobileBSDAOImplTest
{
    public ApplicationContext applicationContext = new
              ClassPathXmlApplicationContext("applicationContext.xml");

    private MobileBSDAOImpl mobileDAO = (MobileBSDAOImpl) applicationContext
              .getBean("JQuery_mobileDAOImpl8");
    //region 批量新增商品测试

    /**
     * 批量新增商品测试
     */
    @org.junit.Test
    public void batchAddMobileGoodsTest() throws JavaEE8Exception
    {
        String[] goodsName = new String[]{
                  "	苗丽珠宝 金丝楠手串 楠木佛珠念珠手链 男女款手珠 ML1122 18mm	",
                  "	苹果 Apple iPhone 6s 4.7英寸4G手机 玫瑰金 公开版(16GROM)标配	",
                  "	苹果Apple iPhone SE (A1723) 玫瑰金 全网通64G ROM 标配	",
                  "	苹果Apple iPhone 6 Plus 4G手机 深空灰 公开版(16GROM)标配	",
                  "	苹果(Apple) iPhone SE 4G手机 深空灰 公开版(64G ROM)标配	"
        };
        //endregion

        List<MobileGoods> mobileGoodsList = new ArrayList<>();

        for (int i = 0; i < goodsName.length; i++)
        {
            MobileGoods m = new MobileGoods();
            m.setGoods_name(goodsName[i].trim());
            m.setGoods_number(i);
            m.setGoods_price(getMobilePrice());
            m.setMobile_os("ios");
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
            for (int j = 0; j < 2; j++)
            {
                imagesMap.put(j, images[j]);
            }

            m.setImagesMap(imagesMap);
            //endregion

            mobileGoodsList.add(m);
        }

        //session.close();

        for (Iterator<MobileGoods> it = mobileGoodsList.iterator(); it.hasNext(); )
        {
            System.out.println(mobileDAO.batchAddMobileGoods("手机\\\\苹果", it.next()));
        }

    }
    //endregion
}























