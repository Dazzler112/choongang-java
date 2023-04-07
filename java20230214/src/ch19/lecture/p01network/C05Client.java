package ch19.lecture.p01network;

import java.io.*;
import java.net.*;
import java.util.*;

public class C05Client {
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
		String input ="";
			
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("서버에게 보낼 데이터 작성>");
			input = sc.nextLine();
		}
		ps.println(input);
		
		ps.flush();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("클라이언트 종료");
	}
}