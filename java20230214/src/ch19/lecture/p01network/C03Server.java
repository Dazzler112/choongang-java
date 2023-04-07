package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C03Server {
	public static void main(String[] args) {
		int port = 50500;
		
		System.out.println("연결을 기다리는 중...");
		try(ServerSocket serverSocket = new ServerSocket(port);
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		InputStreamReader isr = new InputStreamReader(bis);){
		
		char[] buf = new char[1024];
		int len = 0;
		
		while((len = isr.read(buf)) != -1) {
			String data = new String(buf,0,len);
			System.out.print(data);
		}
		System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("프로그램 종료");
	}
}
