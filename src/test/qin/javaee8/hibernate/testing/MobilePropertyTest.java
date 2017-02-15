package qin.javaee8.hibernate.testing;

import static qin.javaee8.hibernate.domain.MobileProperty.*;

/**
 * Created by Administrator on 2017/2/9 2-009-09.<br/>
 *
 * @author qinzhengying
 */
public class MobilePropertyTest
{
    //@org.junit.Test
    public void printColor()
    {
        System.out.println(MOBILE_BACK_CAMERA_HIGHER_200);
        System.out.println(MOBILE_BACK_CAMERA_BETWEEN_1200_1999);
        System.out.println(MOBILE_BACK_CAMERA_BETWEEN_500_1199);
        System.out.println(MOBILE_BATTERY_HIGHER_OTHERS);
    }

    @org.junit.Test
    public void print前置摄像头()
    {
        System.out.println(MOBILE_FRONT_CAMERA_HIGHER1600);
        System.out.println(MOBILE_FRONT_CAMERA_BETWEEN_800_1599);
        System.out.println(MOBILE_FRONT_CAMERA_BETWEEN_500_799);
        System.out.println(MOBILE_FRONT_CAMERA_BETWEEN_200_499);
        System.out.println(MOBILE_FRONT_CAMERA_BETWEEN_120_199);
        System.out.println(MOBILE_FRONT_CAMERA_BELOW_120);
    }

}