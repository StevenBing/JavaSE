package thread;

/**
 * 当多个线程并发操作同一资源时就形成了"抢"的局面，由于线程切换不确定，可能会导致线程操作该资源时未
 * 按照程序预定的执行顺序执行代码，导致逻辑出现混乱。严重时可能导致系统瘫痪。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 14:21
 */
public class SyncDemo01 {
    static Table table = new Table();
	public static void main(String[] args) {
        Runnable getBeans01 = new GetBeans(table);
        Runnable getBeans02 = new GetBeans(table);
        new Thread(getBeans01).start();
        new Thread(getBeans02).start();
    }

}

class GetBeans implements Runnable {

    Table table;
    public GetBeans(Table table){
        this.table = table;
    }
	@Override
	public void run() {
        while (true) {
            int beans = table.getBeans();
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + "\t" + beans);
        }
	}
}

class Table {
	private int beans = 20;
	/*
	* 当一个方法被synchronized修饰后，那么该方法称为同步方法，即：多个线程不能同时在这个方法内部执行，从而解决了
	* 并发安全问题。
	*
	* 在方法上使用synchronized，那么同步监视器对象就是当前方法所属的对象，即：方法内部看到的this。
	* */
	public synchronized int getBeans() {
		if (beans == 0) {
			throw new RuntimeException("莫得豆子了");
		}
		Thread.yield();
		return beans--;
	}
}
