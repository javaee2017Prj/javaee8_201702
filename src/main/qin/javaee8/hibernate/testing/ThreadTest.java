package qin.javaee8.hibernate.testing;

public class ThreadTest implements Runnable
{
    int number = 0;

    @Override
    public void run()
    {
        while (true)
        {
            if (number > 0)
            {
                try
                {
                    Thread.sleep(1000l);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println(number--);
            }
        }
    }

    public static void main(String[] args)
    {
        Thread t1 = new Thread(new ThreadTest());
        t1.setName("thread1");
        Thread t2 = new Thread(new ThreadTest());
        t2.setName("thread2");
        Thread t3 = new Thread(new ThreadTest());
        Thread t4 = new Thread(new ThreadTest());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}