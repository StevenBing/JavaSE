package thread;

/**
 * 有效的缩小同步范围可以保证并发安全的同时尽可能的提高效率。 同步块可以更准确的控制需要同步运行的代码片段。 synchronized(同步监视器){
 * 需要同步运行的代码块 } 同步监视器是java中任意的一个对象，只要保证多个线程可以看到的该对象是"同一个"，即可保证同步块中的代码是并发安全的。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 15:42
 */
public class SyncDemo02 {
	public static void main(String[] args) {
		Shop shop = new Shop();
		Thread thread1 = new Thread(() -> shop.buy());
		Thread thread2 = new Thread(() -> shop.buy());
        Thread thread3 = new Thread(() -> shop.buy());
        thread1.start();
        thread2.start();
        thread3.start();
	}
}

class Shop {
	public void buy() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName() + ":正在挑衣服");
            Thread.sleep(5000);
            synchronized (this){
                System.out.println(t.getName() + ":正在试衣服" + System.currentTimeMillis()%10000);
                Thread.sleep(5000);
            }
			System.out.println(t.getName() + ":结账离开");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
