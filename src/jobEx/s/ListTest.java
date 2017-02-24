package s;

public class ListTest
{
    @org.junit.Test
    public void list() throws Exception
    {
        //ArrayList list = new ArrayList();
        //list.add(1);
        //System.out.println(list.size());

        MyList myList = new MyList();
        myList.add(1);
        System.out.println(myList);
    }
}