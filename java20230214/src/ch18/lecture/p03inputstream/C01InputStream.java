package ch18.lecture.p03inputstream;

import java.io.*;

public class C01InputStream {
	public static void main(String[] args) {
		//InputStream
		//byte 단위 입력 스트림
		//주요 메소드 : read
		
		String name = "output/sec02exam03.db"; //3byte크기 파일
		try(InputStream is = new FileInputStream(name)){
			//read : 한바이트 읽기
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());//3바이트인대 ? 1번더읽으면 어떻게됨?
			
			//끝에 도달하고 다시 읽으면 -1이 출력된다!(API에 다 나와있다!)
			System.out.println(is.read());
			System.out.println(is.read());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
