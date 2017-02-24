package qin.javaee8.hibernate.jd.test;

public class JavaTest
{
    @org.junit.Test
    public void trim()
    {
        String s = "apple\n" +
                  "dami\n" +
                  "google\n" +
                  "haushuo\n" +
                  "huawei\n" +
                  "lenovo\n" +
                  "letv\n" +
                  "meizu\n" +
                  "oppo";

        String[] ss = s.split("\n");
        for (int i = 0; i < ss.length; i++)
        {
            System.out.println(ss[i] + " = \"" + ss[i] + "\";");
        }
    }
}