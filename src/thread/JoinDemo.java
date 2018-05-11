package thread;

/**
 * join方法可以协调线程之间的同步进行。
 * join方法会让运行该方法的线程处于阻塞状态，直到该方法所属线程执行完毕才会解除阻塞。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 11:32
 */
public class JoinDemo {
    private static boolean isFinish = false;
    public static void main(String[] args) {
        Thread download = new Thread(()->{
            System.out.println("down: 开始下载图片");
            for (int i = 1; i <= 100; i++) {
                System.out.println("down: " + i + "%");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("down: 下载完毕！");
            isFinish = true;
        });
        download.start();
        Thread show = new Thread(()->{
            System.out.println("show:开始显示图片");
            try {
                download.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!isFinish) {
                System.out.println("show:图片显示失败！");
            }
            System.out.println("show:图片显示成功！");
        });
        show.start();
    }
}
