package access_;//: access/access_.ChocolateChip.java
// Can't use package-access member from another package.

import access.dessert.Cookie;

public class ChocolateChip extends Cookie
{
    public ChocolateChip()
    {
        System.out.println("access_.ChocolateChip constructor");
    }

    public void chomp()
    {
        //! bite(); // Can't access bite
    }

    public static void main(String[] args)
    {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
} /* Output:
Cookie constructor
access_.ChocolateChip constructor
*///:~
