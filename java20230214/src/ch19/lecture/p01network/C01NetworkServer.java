package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C01NetworkServer {
	public static void main(String[] args) {
		//ip주소
		//port 번호 필요(49152~65535)
		int port = 50500;
		
		//서버를 사용하겠다고 명시하는거
		try(ServerSocket serverSocket = new ServerSocket(port);) {
			System.out.println("연결 기다리는 중....");
		try(
				//주고 받기 위해 먼저 소켓을 만들어야 한다accept 해야 만들어진다
				Socket socket = serverSocket.accept();
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(osw)){
			
			bw.write("hello client");
			
			bw.flush();
		}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
