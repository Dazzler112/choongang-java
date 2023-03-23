package ch18.lecture.p02outputstream;

import java.io.*;

public class C01OutputStream {
	public static void main(String[] args) {
		//OutputStream
		//바이트 단위 출력 스트림
		
		//OutputStream os = new OutputStreaem(); //이렇게 생성 불가
		try {
		String des = "output/output1.txt";
		OutputStream os = new FileOutputStream(des);
		
		os.write(250);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
