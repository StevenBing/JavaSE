package thread;

/**
 * 线程优先级
 * 线程之所以能得以并发运行，是靠线程调度的工作，线程调度会分配CPU时间片给线程，使其可以运行。
 * 线程不能主动获取CPU时间。调整线程的优先级可以最大程度改善某个线程获取CPU时间片的次数，理论上
 * 是优先级越高的获得CPU时间片的次数越多。
 * 优先级分1-10级，1最低，10最高，默认值为5。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 9:15
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread());
                }
            }
        };
        t1.setName("MAX");
        t1.setPriority(10);
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++){
                    System.out.println(Thread.currentThread());
                }
            }
        };
        t2.setName("norm");
        t2.start();

        Thread t3 = new Thread(new MyRunnable());
        t3.setName("Min");
        t3.setPriority(1);
        t3.start();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}
