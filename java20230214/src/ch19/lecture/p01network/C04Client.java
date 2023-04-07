package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {
		//ip주소
		String ip = "172.30.1.20";
		//port번호
		int port = 50500;
		
		try(
				Socket socket = new Socket(ip,port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos); //아무거나 골라서 써라 정해진건 아니니까
				){
		
		ps.println("hello sever, I am client");
		
		ps.flush();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("클라이언트 종료");
	}
}
