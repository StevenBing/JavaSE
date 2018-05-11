package thread;

/**
 * 获取线程相关信息的一组方法
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/10 16:34
 */
public class ThreadDemo04 {
    public static void main(String[] args) {
        System.out.println("name" + Thread.currentThread().getName());
        System.out.println("id" + Thread.currentThread().getId());
        Thread main = Thread.currentThread();
        System.out.println("优先级" + main.getPriority());
        System.out.println("isAlive" + main.isAlive());
        System.out.println("是否为守护线程" + main.isDaemon());
        System.out.println("是否被中断" + main.isInterrupted());

    }
}


