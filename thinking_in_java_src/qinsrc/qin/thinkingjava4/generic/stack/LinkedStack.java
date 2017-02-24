package qin.thinkingjava4.generic.stack;

public class LinkedStack<T>
{
    private Node<T> top = new Node<T>();

    public void push(T item)
    {
        top = new Node<T>(item, top);
    }

    public T pop()
    {
        T result = top.getItem();
        if (!top.end())
        {
            top = top.getNext();
        }

        return result;
    }
}