package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池的主要两个作用:
 * 1.控制线程数量，每个线程都会占用进程的一部分内存，线程数量过多会导致资源消耗大，由于所有线程都是并发运行，那么过多的
 * 线程会导致CPU过度切换，导致并发效率变差。
 * 2.重用线程，频繁地创建销毁线程会给线程调度带来负担，所以应当重用线程。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/24 0024 14:40
 */
public class ThreadpoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();
                    System.out.println(thread.getName() + "开始执行任务");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(thread.getName() + "任务执行完毕");
                }
            };
            threadPool.execute(r);
        }
        threadPool.shutdown();
    }
}
