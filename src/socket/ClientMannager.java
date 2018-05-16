package socket;

import java.util.Vector;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/9 20:04
 */
public class ClientMannager {
    public static Vector<ChatSocket> clients = new Vector<>();
    public static void sendAll(ChatSocket chatSocket, String send,String address){
        for (ChatSocket client : clients){
            if (!client.equals(chatSocket)) {
                client.send(address);
                client.send(send);
                client.send("#----------------*----------------#");
            }
        }
    }
}
