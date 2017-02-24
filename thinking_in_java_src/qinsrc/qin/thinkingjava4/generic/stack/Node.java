package qin.thinkingjava4.generic.stack;

public class Node<U>
{
    private U item;

    private Node<U> next;

    public U getItem()
    {
        return item;
    }

    public Node<U> getNext()
    {
        return next;
    }

    //region 构造函数
    public Node()
    {
    }

    public Node(U item, Node<U> next)
    {
        this.item = item;
        this.next = next;
    }
    //endregion

    public boolean end()
    {
        return item == null && next == null;
    }
}