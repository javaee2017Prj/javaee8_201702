//: enumerated/menu/TypeOfFood.java
package enumerated.menu;

import static enumerated.menu.Food.Appetizer;
import static enumerated.menu.Food.Coffee;
import static enumerated.menu.Food.Dessert;
import static enumerated.menu.Food.MainCourse;

public class TypeOfFood
{
    public static void main(String[] args)
    {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
} ///:~
