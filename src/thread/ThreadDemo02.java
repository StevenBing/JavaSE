package thread;

/**
 * 第二种创建线程方式：单独定义线程任务 实现Runnable接口并重写run方法。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/10 14:04
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable01();
        Runnable r2 = new Runnable02();

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
    }
}

class Runnable01 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("who are you ?");
		}
	}
}

class Runnable02 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("说人话");
		}
	}
}