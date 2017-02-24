package qin.thinkingjava4.generic.qin;

public class DataBaseTest
{
    @org.junit.Test
    public void dbTest() throws Exception
    {
        DataBase<MySQL> mySQLDataBase = new MySQLImpl("root", "root");
        System.out.println(mySQLDataBase.getDriverManager());
    }
}