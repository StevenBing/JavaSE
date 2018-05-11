package thread;

/**
 * 守护线程
 * 守护线程又称为后台线程，一个线程被创建出来默认都是普通的(前台线程)，守护线程需要在线程启动前单独进行设置。
 * 使用上守护线程和普通线程无差别，但是在结束时机上有一点不同，即:当进程结束时，所有正在运行的守护线程都会被
 * 强制中断。
 * 进程结束：当一个进程中的所有前台线程都结束时，进程即结束。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/11 10:31
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("rose:let me go!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            System.out.println("啊啊啊");
            System.out.println("噗通");
        }).start();
        Thread jack = new Thread(()->{
            while (true) {
                System.out.println("jack:you jump! i jump!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        jack.setDaemon(true);
        jack.start();
    }
}
