package ch18.lecture.p09filter;

import java.io.*;

public class C01Filter {
	public static void main(String[] args) {
		//Stream 연결 가능 (인풋 이나 아웃풀들 끼리 연결가능)
		String fileName = "output/byte1.txt";
		try(
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis);//스트링으로 읽고 싶다
		BufferedReader br = new BufferedReader(isr);){
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
