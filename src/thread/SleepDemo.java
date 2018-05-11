package thread;

/**
 * sleep阻塞
 * 线程提供方法:
 * static void sleep(long ms)
 * 线程阻塞一段时间，超时后线程重新回到RUNNABLE状态，等待分配CPU时间片再次运行。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 9:39
 */
public class SleepDemo {
    public static void main(String[] args) {

        System.out.println("程序开始了");
        try {
            /*
            * 通常会引起线程阻塞的现象的方法都要求处理中断异常。
            * 线程有一个方法:interrupt()
            * 该方法可以中断一个正在运行的线程。但是当这个线程正在处于某种阻塞是被调用中断方法中断，那么并不是把
            * 该线程直接中断，而是中断其阻塞状态。这是通常抛出中断异常，通知程序该线程的阻塞状态被打断。
            * */
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束了");
    }
}
