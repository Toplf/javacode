package stu26.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;
public class NetTest {

	//从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
	@Test
	public void server2() {
		ServerSocket server = null;
		Socket socket1 = null;

		InputStream nis = null;
		FileOutputStream fos = null;
		BufferedWriter netWriter = null;

		try {
			server = new ServerSocket(7777);
			socket1 = server.accept();
			nis = socket1.getInputStream();
			fos = new FileOutputStream("girl2.jpg");
			netWriter = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));

			byte[] buf = new byte[8192];
			int realCount = nis.read(buf);
			while (realCount != -1) {
				fos.write(buf, 0, realCount);
				realCount = nis.read(buf);
			}
			netWriter.write("发送成功");
			netWriter.newLine();
			netWriter.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (netWriter != null) {
				try {
					netWriter.close();
				} catch (Exception e2) {
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
				}
			}
			if (nis != null) {
				try {
					nis.close();
				} catch (Exception e2) {
				}
			}
			if (socket1 != null) {
				try {
					socket1.close();
				} catch (Exception e2) {
				}
			}
			if (server != null) {
				try {
					server.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void client2() {
		Socket socket2 = null;

		FileInputStream fis = null;
		OutputStream nos = null;
		BufferedReader netReader = null;
		try {
			socket2 = new Socket("127.0.0.1", 7777);
			fis = new FileInputStream("girl.jpg");
			nos = socket2.getOutputStream();
			netReader = new BufferedReader(new InputStreamReader(socket2.getInputStream()));

			byte[] buf = new byte[8192];
			int realCount = fis.read(buf);
			while (realCount != -1) {
				// 1) 处理已经读的数据
				nos.write(buf, 0, realCount);
				// 2) 继续读
				realCount = fis.read(buf);
			}
			nos.flush();
			socket2.shutdownOutput();

			String readLine = netReader.readLine();
			System.out.println(readLine);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (netReader != null) {
				try {
					netReader.close();
				} catch (Exception e2) {
				}
			}
			if (nos != null) {
				try {
					nos.close();
				} catch (Exception e2) {
				}
			}
			if (fis != null) {
				try {
					fis.close();
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

	@Test
	public void server() {
		ServerSocket server = null;
		Socket socket1 = null;
		BufferedReader bufferedReader = null;
		try {
			server = new ServerSocket(9999); // 绑定9999端口.
			socket1 = server.accept(); // 接受客户端的连接请求, 此方法会引起阻塞.
			System.out.println(socket1);
			// 服务器端的socket1和客户端的socket2就建立了双向的网络通道
			InputStream inputStream = socket1.getInputStream();
			InputStreamReader isr = new InputStreamReader(inputStream);

			bufferedReader = new BufferedReader(isr);
			String readLine = bufferedReader.readLine();
			System.out.println(readLine);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (Exception e2) {
				}
			}

			if (socket1 != null) {
				try {
					socket1.close();
				} catch (Exception e2) {
				}
			}

			if (server != null) {
				try {
					server.close();
				} catch (Exception e2) {
				}

			}
		}
	}

	@Test
	public void client() {
		// 连接服务器, 必须知道ip和端口.
		Socket socket2 = null;
		BufferedWriter bufferedWriter = null;
		try {
			socket2 = new Socket("127.0.0.1", 9999);
			System.out.println(socket2);
			// 客户端的socket2和服务器端的socket1就建立了双向的网络通道
			OutputStream outputStream = socket2.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(outputStream);
			bufferedWriter = new BufferedWriter(osw);
			bufferedWriter.write("你好, 服务器, 俺是客户端.....");
			bufferedWriter.newLine();// 必须要有换行
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
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
