package s;

import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.exceptions.JavaEE8Exception;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("all")
public class MyList implements JavaEE8BaseSupport, MyListI
{
    private static final long serialVersionUID = 1839399356317508334L;

    //region 获取日志类
    @Override
    public Class getLogClass()
    {
        return MyList.class;
    }
    //endregion

    //region 构造函数
    public MyList() throws JavaEE8Exception
    {
        this.elementData = EMPTY_ELEMENTDATA;
        superInfo_logger_normal("正在初始化java.util.List集合类");
    }
    //endregion

    //region toString()
    @Override
    public String toString()
    {
        Iterator<Object> it = iterator();
        if (!it.hasNext())
        {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (; ; )
        {
            Object e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
            {
                return sb.append(']').toString();
            }
            sb.append(',').append(' ');
        }
    }
    //endregion

    //region ini
    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * The array buffer into which the elements of the ArrayList are stored.
     * The capacity of the ArrayList is the length of this array buffer. Any
     * empty ArrayList with elementData == EMPTY_ELEMENTDATA will be expanded to
     * DEFAULT_CAPACITY when the first element is added.
     */
    transient Object[] elementData; // non-private to simplify nested class access

    /**
     * The size of the ArrayList (the number of elements it contains).
     *
     * @serial
     */
    private int size;

    protected transient int modCount = 0;

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    //endregion

    //region 新增

    @Override
    public boolean add(Object o)
    {
        ensureCapacityInternal(size + 1);
        elementData[size++] = o;
        return true;
    }

    void ensureCapacityInternal(int minCapacity)
    {
        if (elementData == EMPTY_ELEMENTDATA)
        {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        ensureExplicitCapacity(minCapacity);
    }

    void ensureExplicitCapacity(int minCapacity)
    {
        modCount++;

        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
        {
            grow(minCapacity);
        }
    }

    void grow(int minCapacity)
    {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
        {
            newCapacity = minCapacity;
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0)
        {
            newCapacity = hugeCapacity(minCapacity);
        }
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    int hugeCapacity(int minCapacity)
    {
        if (minCapacity < 0) // overflow
        {
            throw new OutOfMemoryError();
        }
        //        return (minCapacity > MAX_ARRAY_SIZE) ?
        //                  Integer.MAX_VALUE :
        //                  MAX_ARRAY_SIZE;
        if (minCapacity > MAX_ARRAY_SIZE)
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return MAX_ARRAY_SIZE;
        }
    }

    //endregion
}

















