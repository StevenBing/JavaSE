package thread;

/**
 * 打断睡眠阻塞
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 9:57
 */
public class SleepDemo02 {

	public static void main(String[] args) {
		Thread lin = new Thread(() -> {
			System.out.println("林：立刻就发上来肯德基");
			try {
				Thread.sleep(1000000000);
			} catch (InterruptedException e) {
				System.out.println("干嘛呢干嘛呢");
			}
			System.out.println("醒了");
		});
		lin.start();
		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("黄:80");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("哐当~");
			System.out.println("搞定！");
			lin.interrupt();
		}).start();
	}
}
