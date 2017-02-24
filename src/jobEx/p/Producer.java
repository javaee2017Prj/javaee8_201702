package p;

import qin.javaee8.core.JavaEE8BaseSupport;

public class Producer implements JavaEE8BaseSupport
{
    @Override
    public Class getLogClass()
    {
        return Producer.class;
    }

    private Resource resource;

    public Producer(Resource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        try
        {
            for (; ; )
                resource.setName("周星驰");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}