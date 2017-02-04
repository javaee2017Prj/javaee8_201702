package qin.javaee8.hibernate.testing;

import static java.lang.System.getProperty;
import static java.lang.System.out;

public class SystemTest
{
    public static void main(String[] args)
    {
        out.println(getProperty("java_home"));
    }
}