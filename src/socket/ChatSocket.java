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
	public void run() {
		String say = null;
		while (true) {
			try {
				say = reader.readLine();
                System.out.println("run");
                String address = socket.getInetAddress().toString().substring(1) + "  say:";
                System.out.println(address);
                ClientMannager.sendAll(this, say, address);

			} catch (IOException e) {
				ClientMannager.clients.remove(this);
			}
		}

	}
}
