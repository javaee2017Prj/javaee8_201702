/*

笔记:
http://www.cnblogs.com/bobodeboke/p/3901295.html
并发的多面性:
    |--更快的执行:
        当程序中发生了阻塞(程序中出现了一个原因导致这个程序无法运行下去)使用并发可以继续运行此程序
    |--改进代码设计
        协作多线程:在多线程中程序是随时运行的, 谁先抢到执行权谁先运行, 如果想要按顺序依次执行可以使用协作多线程来实现
    |--基本的线程机制



 */

package qin.thinkingjava4.concurrency;

public final class ThreadNote
{
    private ThreadNote()
    {
    }
}