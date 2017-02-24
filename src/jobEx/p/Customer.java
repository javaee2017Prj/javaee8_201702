package p;

import qin.javaee8.core.JavaEE8BaseSupport;

public class Customer implements JavaEE8BaseSupport
{
    @Override
    public Class getLogClass()
    {
        return Customer.class;
    }

    private Resource resource;

    public Customer(Resource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        try
        {
            for (; ; )
                resource.out();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}