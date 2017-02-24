package qin.thinkingjava4.concurrency;

import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.exceptions.LogClassException;
import qin.javaee8.exceptions.LogException;

public class ThreadTest implements JavaEE8BaseSupport
{
    @Override
    public Class getLogClass()
    {
        return ThreadTest.class;
    }

    @Override
    public void run()
    {
        for (int i = 0; ; i++)
        {
            try
            {
                Thread.currentThread().setName("thread" + i);
                superInfo_logger_normal("线程运行中......" + Thread.currentThread().getName());
            }
            catch (LogException e)
            {
                e.printStackTrace();
            }
            catch (LogClassException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
    }
}