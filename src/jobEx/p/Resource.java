package p;

import qin.javaee8.core.JavaEE8BaseSupport;

import static java.lang.Thread.currentThread;

public class Resource implements JavaEE8BaseSupport
{
    @Override
    public Class getLogClass()
    {
        return Resource.class;
    }

    private String name;

    private int count = 1;

    private boolean flag = false;

    public String getName()
    {
        return name;
    }

    public synchronized void setName(String name) throws Exception
    {
        if (flag)
        {
            this.wait();
        }

        this.name = name + count;
        count++;
        superInfo_logger_normal(currentThread().getName() + "生产者" + this.name);
        flag = true;
        notify();
    }

    public synchronized void out() throws Exception
    {
        if (!flag)
        {
            this.wait();
        }

        superInfo_logger_normal(currentThread().getName() + "消费者" + this.name);
        flag = false;
        notify();
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }
}