package socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 聊天室客户端
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/9 14:18
 */
public class Client {
	/*
	* java.net.Socket 套接字
	* 封装了TCP协议通讯。使它能很方便的以TCP协议为通讯方式传输数据。
	* */
	private Socket socket;
	public static PrintWriter writer;
	public static BufferedReader reader;
	public static Scanner scanner;

	/*
	* 构造方法，用来初始化客户端
	* */
	public Client() {
		try {
			/*
			* 实例化客户端需要传入服务端IP，端口号
			* 实例化过程就是连接过程，若连接失败会抛出异常
			* */
			System.out.println("正在连接服务器...");
			socket = new Socket("localhost", 8088);
			System.out.println("服务器连接成功");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	* 客户端开始工作
	* */
	public void start() {
		scanner = new Scanner(System.in);

		try {
			OutputStream os = socket.getOutputStream();
			writer = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(os, "utf-8")),
					true);
			// BufferedReader reader = new BufferedReader(
			// new InputStreamReader(new
			// ServerSocket(8001).accept().getInputStream(), "utf-8"));
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream(), "utf-8"));
			System.out.println("所有通讯已建成");
			//读取从服务器发来的信息
			new Thread() {
				@Override
				public void run() {
					try {
						while (true) {
							System.out.println(Client.reader.readLine());
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
			//发送信息到服务器并通过服务器进行广播
			new Thread() {
				@Override
				public void run() {
					while (true) {
						Client.writer.println(Client.scanner.nextLine());
					}
				}
			}.start();
		} catch (Exception e) {
            System.out.println("聊天结束");
		}

	}

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
