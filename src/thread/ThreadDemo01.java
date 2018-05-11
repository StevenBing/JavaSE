package thread;

/**
 * 线程允许我们"同时执行"多段代码。
 * 线程有两种创建方式
 * 1:继承Thread并重写run()方法，在run方法中定义要执行的代码。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/10 10:42
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThrea_1 t1 = new MyThrea_1();
        MyThread_2 t2 = new MyThread_2();
        /*
        * 线程启动需要调用start()方法，而不是直接调用run方法
        * start方法的作用是将线程纳入线程调度中，线程调度会统一管理需要并发运行的多个线程，
        * 调度CPU，分配时间片段给线程，得到时间片段的线程会被CPU运行这段时间，运行完毕后，线程调度会再分配时间片段
        * 给一个线程使cpu运行该线程。
        * 线程调度分配时间片段给每一个线程并非有序的"一人一次"但是在整体过程中，每个线程获取的CPU时间片段的次数是基本一致的。
        * */
        t1.start();
        t2.start();
    }
}
 /**
  * 第一种创建方式存在两个不足：
  * 1:由于java是单继承
  * 2:定义线程的同时重写run方法定义义务，这就导致了线程和任务有一个必然的耦合关系，不利于线程的重用。
  *
  *
  *  @author StevenBing
  * Date 2018/5/10 11:51
  * @param null
  * @return
  */

class MyThrea_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Who are you ?");
        }
    }
}

class MyThread_2 extends Thread {
    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++){
            System.out.println("说人话！！");
        }
    }
}

