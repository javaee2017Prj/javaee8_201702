package qin.thinkingjava4.concurrency;

import qin.javaee8.core.JavaEE8BaseSupport;

/**
 * 定义任务
 */
public class LiftOff implements JavaEE8BaseSupport
{
    @Override
    public Class getLogClass()
    {
        return LiftOff.class;
    }

    protected int countDown = 10;

    private static int taskCount = 0;

    /**
     * 用来区分任务的多个实例, 是final的, 一旦初始化就不希望被修改
     */
    private final int id = taskCount++;

    public LiftOff()
    {
    }

    public LiftOff(int countDown)
    {
        this.countDown = countDown;
    }

    public String status()
    {
        return new StringBuilder()
                  .append("#")
                  .append(id)
                  .append("(")
                  .append(countDown > 0 ? countDown : "LiftOff!")
                  .append("). ").toString();
    }

    @Override
    public void run()
    {
        try
        {
            while (countDown-- > 0)
            {
                superInfo_logger_normal(status());
                //任务调度器, 可以将一个线程转移给另一个线程
                Thread.yield();
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception
    {
        //LiftOff lanuch = new LiftOff();
        //lanuch.run();
        /*
        new Thread(new LiftOff()).start();
        new Thread(new LiftOff(1)).start();
        new Thread(new LiftOff(2)).start();
        new Thread(new LiftOff(3)).start();
        new Thread(new LiftOff(4)).start();
        new Thread(new LiftOff(5)).start();
		*/
        //你可以开启多个任务线程
        for (; ; )
        {
            new Thread(new LiftOff()).start();
        }
    }
}