package thread;

/**
 * 死锁现象
 * 当多个线程持有自己的锁，但是都等对方先释放锁时就会出现"僵持"的情况，使得所有线程都进入阻塞状态。
 * 这个现象就被称为死锁现象。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 17:28
 */
public class SyncDemo05 {
    public static void main(String[] args) {
        Coo coo = new Coo();
        new Thread(()->coo.methodA()).start();
        new Thread(()->coo.methodB()).start();
    }
}

class Coo {
    private Object lockA = new Object();
    private Object lockB = new Object();

    public void methodA() {
        Thread thread = Thread.currentThread();
        synchronized (lockA) {
            System.out.println(thread.getName() + "持有lockA锁，开始运行A方法");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + "开始运行B方法");
            methodB();
        }
        System.out.println(thread.getName() + "释放lockA锁");
    }
    public void methodB() {
        Thread thread = Thread.currentThread();
        synchronized (lockB) {
            System.out.println(thread.getName() + "持有lockB锁，开始运行B方法");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + "开始运行A方法");
            methodA();
        }
        System.out.println(thread.getName() + "释放lockB锁");
    }
}
