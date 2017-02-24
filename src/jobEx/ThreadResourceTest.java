/*
线程间通信


 */

import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.exceptions.JavaEE8Exception;

public class ThreadResourceTest
{
    public static void main(String[] args)
    {
        //资源
        Resource resource = new Resource();
        Input input = new Input(resource);
        Output output = new Output(resource);

        Thread t1 = new Thread(input);
        Thread t2 = new Thread(output);

        t1.start();
        t2.start();
    }
}

class Resource
{
    private String name;

    private String sex;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }
}

//输入
class Input implements JavaEE8BaseSupport
{
    @Override
    public Class getLogClass()
    {
        return Input.class;
    }

    private Resource resource;

    public Input(Resource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        int x = 0;

        for (; ; )
        {
            synchronized (Resource.class)
            {
                if (x == 0)
                {
                    resource.setName("idea");
                    resource.setSex("男男男男男男男男男男男男男男男");
                }
                else
                {
                    resource.setName("eclipse");
                    resource.setSex("女女女女女女女女女女女女女女女");
                }
            }
            x = (++x) % 2;
        }
    }
}

//输出
class Output implements JavaEE8BaseSupport
{
    @Override
    public Class getLogClass()
    {
        return Output.class;
    }

    private Resource resource;

    public Output(Resource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        for (; ; )
        {
            synchronized (resource)
            {
                try
                {
                    superInfo_logger_normal(resource.getName() + "......" + resource.getSex());
                }
                catch (JavaEE8Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
















