package socket;

import java.io.IOException;
import java.net.Socket;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/14 10:44
 */
public class Client888 {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            count++;
            try {
                Socket socket = new Socket("176.201.113.27", 8088);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                System.out.println("OJBK");
                System.out.println(count);
                break;
            }
        }
    }
}
