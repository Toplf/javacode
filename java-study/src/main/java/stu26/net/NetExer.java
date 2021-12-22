package stu26.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Provider.Service;
import java.time.LocalDateTime;

import org.junit.Test;

public class NetExer {

	@Test
	public void server() {
		ServerSocket server = null;
		try {
			server = new ServerSocket(8888); // 绑定端口
			while (true) {
				System.out.println("服务器在8888端口监听中.....");
				final Socket socket1 = server.accept();;
				Runnable runner = new Runnable() {
					@Override
					public void run() {
						BufferedWriter bufferedWriter = null;
						try {
							bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
							bufferedWriter.write("我是服务器, 现在时间 : " + LocalDateTime.now());
							bufferedWriter.newLine();
							bufferedWriter.flush(); // 把数据真的刷入网线中
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							if (bufferedWriter != null) {
								try {
									bufferedWriter.close();
								} catch (Exception e2) {
								}
							}
							if (socket1 != null) {
								try {
									socket1.close();
								} catch (Exception e2) {
								}
							}
						}
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				new Thread(runner).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (server != null) {
				try {
					System.out.println("服务器关闭....");
					server.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void client() {
		Socket socket2 = null;
		BufferedReader bufferedReader = null;
		try {
			socket2 = new Socket("localhost", 8888);
			bufferedReader = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
			String readLine = bufferedReader.readLine();
			System.out.println(readLine);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (Exception e2) {
				}
			}
			if (socket2 != null) {
				try {
					socket2.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}
