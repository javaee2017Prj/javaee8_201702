package qin.thinkingjava4.generic;

import qin.thinkingjava4.generic.stack.LinkedStack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GenericTest
{
    //region Holder2Test
    //@org.junit.Test
    public void Holder2Test()
    {
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile automobile = (Automobile) holder2.getObject();
        holder2.setObject("object1");
        System.out.println(holder2);
        String s = (String) holder2.getObject();
        holder2.setObject("object2");
        System.out.println(holder2);

        /*
            由于Object是所有类的父类, 所以这里可以指定自己想要的类型
            但是我们更喜欢暂时指定类型, 所以就用到了泛型, 稍后再指定什么类型
            --Holder3.java
         */
    }
    //endregion

    //region Holder3Test
    //@org.junit.Test
    public void holder3Test()
    {
        Holder3<String, Integer> holder3 = new Holder3<>();
        holder3.setKey("key");
        holder3.setValue(1);

        System.out.println(holder3);

        //现在就能使用自定义类型了

        /*

        接下来会用泛型一个连接数据库的类

         */
    }
    //endregion

    //region connetMySQL
    //@org.junit.Test
    public void connectMySQL() throws Exception
    {
        //调用Class.forName()方法加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("成功加载MySQL驱动！");
        String url = "jdbc:mysql://localhost:3306/javaee8_201702";    //JDBC的URL
        //调用DriverManager对象的getConnection()方法，获得一个Connection对象
        Connection conn;
        conn = DriverManager.getConnection(url, "tongange", "tongange");
        //创建一个Statement对象
        Statement stmt = conn.createStatement(); //创建Statement对象
        System.out.print("成功连接到数据库！");
        stmt.close();
        conn.close();
    }
    //endregion

    //region LinkedStack
    //@org.junit.Test
    public void LinkedStackTest()
    {
        LinkedStack<String> ls = new LinkedStack<>();
        for (String s : "Pharse or stun!".split(" "))
        {
            ls.push(s);
        }
        String s;
        while ((s = ls.pop()) != null)
        {
            System.out.println(s);
        }
    }
    //endregion
}



















