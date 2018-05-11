package thread;

/**
 * 静态方法若使用synchronized修饰后，那么该方法一定具有同步效果。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 16:41
 */
public class SyncDemo03 {
	public static void main(String[] args) {
		Foo foo1 = new Foo();
		Foo foo2 = new Foo();
		new Thread(() -> foo1.doSome()).start();
		new Thread(() -> foo2.doSome()).start();
	}
}

class Foo {
	public synchronized static void doSome() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "正在执行");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread.getName() + "doSome运行结束");
	}
}
