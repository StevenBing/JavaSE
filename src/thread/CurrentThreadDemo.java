package thread;

/**
 * 线程提供了一个静态方法： static Thread currentThread() 该方法可以获取运行该方法的线程。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/10 16:06
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程" + main);
		Thread thread = new Thread() {
			@Override
			public void run() {
				doSome();
			}
		};
		thread.setPriority(10);
		thread.start();
	}

	public static void doSome() {
		Thread t = Thread.currentThread();
		System.out.println("当前调用doSome的线程" + t);
	}
}
