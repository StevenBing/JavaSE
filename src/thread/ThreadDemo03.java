package thread;

import sun.awt.windows.ThemeReader;

/**
 * 使用匿名内部类完成两种线程创建方式。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/10 14:27
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("who are you ?");
				}
			}
		}.start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("傻逼，说人话！！！");
				}
			}
		}).start();

	}
}
