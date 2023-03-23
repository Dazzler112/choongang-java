package ch18.lecture.p04writer;

import java.io.*;

public class C01Writer {
	//Writer : 문자단위 출력 스트림
	//주요 메소드 : writer
	
//	Writer wr = new Writer()//xx 추상클래스여서 직접 인스턴스 불가!!
	
	public static void main(String[] args) {
		String fileName = "output/wrTest01.text";
		try(Writer wr = new FileWriter(fileName);) {
			
			//write
			wr.write('a');
			wr.write('b');
			wr.write('가');
			wr.write('나');//한글은 1byte가 아닐수도 있다
			wr.write(9850);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
