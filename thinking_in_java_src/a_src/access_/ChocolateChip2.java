package access_;//: access/access_.ChocolateChip2.java

import access.cookie2.Cookie;

public class ChocolateChip2 extends Cookie
{
    public ChocolateChip2()
    {
        System.out.println("access_.ChocolateChip2 constructor");
    }

    public void chomp()
    {
        bite();
    } // Protected method

    public static void main(String[] args)
    {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
} /* Output:
Cookie constructor
access_.ChocolateChip2 constructor
bite
*///:~
