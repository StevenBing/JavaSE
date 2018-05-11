package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/9 14:20
 */
public class Server {
    /*
	* 服务端的java.net.ServerSocket主要有两个作用
	* 1:向系统系统申请服务端端口号
	* 2:监听服务端口，一旦一个客户端通过服务端口与服务端建立连接，那么ServerSocket会主动创建一个Socket与客户端进行通讯
	* */
	private ServerSocket serverSocket;

	/*
	* 构造方法用于初始化服务端
	* */
	public Server() {
		try {
			System.out.println("正在启动服务器...");
			serverSocket = new ServerSocket(8088);
			System.out.println("服务器启动完毕");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	* 服务端开始工作的方法
	* */
	public void start() {
		try {
			/*
			 * 阻塞程序，直到一个客户端连接为止。返回一个Socket，通过这个Socket可以与刚建立连接的客户端进行通讯。
			 * */
            while (true) {
                Socket accept = serverSocket.accept();
                ChatSocket socket = new ChatSocket(accept);
                ClientMannager.clients.add(socket);
                System.out.println(accept.getInetAddress().toString().substring(1) + "连接到了服务器!");
                new Thread(socket).start();
            }
		} catch (Exception e) {
			e.printStackTrace();
            System.out.println("服务器已关闭");
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

}
