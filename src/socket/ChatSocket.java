package socket;

import java.io.*;
import java.net.Socket;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/9 20:09
 */
public class ChatSocket implements Runnable {
	private Socket socket;
	private BufferedReader reader;
	private PrintWriter writer;

	public BufferedReader getReader() {
		return reader;
	}

	public PrintWriter getWriter() {
		return writer;
	}

	public ChatSocket(Socket socket) {
		this.socket = socket;
		try {
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream(), "utf-8"));
			writer = new PrintWriter(new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream(), "utf-8")),
					true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void send(String send) {
		writer.println(send);
	}
	@Override
	/*
	* 当客户端与服务器断开连接时，不同系统的客户端在服务端这边体现的不一样
	* windows的客户端断开时，服务端这里reader.readLine方法通常直接抛出异常。
	* Linux的客户端断开时，reader.readLine方法返回值为null。
	*
	* 只要进入了try,必定会执行finally!!!!!!
	* */
	public void run() {
		boolean flag = true;
		String say = null;
		while (true) {
			try {
				say = reader.readLine();
				if (say == null) {
					flag = false;
					continue;
				}
				String address = socket.getInetAddress().toString().substring(1)
						+ "  say:";
				System.out.println(address);
				System.out.println(say);
				ClientMannager.sendAll(this, say, address);

			} catch (IOException e) {
				flag =false;
			} finally{
				if (!flag){
					ClientMannager.clients.remove(this);
					System.out.println("服务器删除了一个客户端");
					flag = true;
					if (socket != null) {
						try {
							socket.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					break;
				}
			}
		}

	}
}
