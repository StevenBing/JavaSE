package thread;

/**
 * 互斥锁
 * 当使用synchronized锁住多段不同的代码片段，但是这些同步块使用的同步监视对象时同一个时，那么这些代码片段
 * 之间就是互斥的。多个线程不能同时执行他们。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 17:00
 */
public class SyncDemo04 {
    public static void main(String[] args) {
        Boo boo = new Boo();
        new Thread(()->boo.methodA()).start();
        new Thread(()->boo.methodB()).start();
    }
}

class Boo {
    public synchronized void methodA() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ":正在执行A！");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName() + ":执行方法A结束");

    }
    public synchronized void methodB() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ":正在执行B！");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName() + ":执行方法B结束");
    }
}
