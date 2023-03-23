package ch18.lecture.p02outputstream;

import java.io.*;

public class C07OuptStream {
	public static void main(String[] args) {
		try(var os = new FileOutputStream("output/output7.txt")) {
			//한바이트 쓰기
			os.write(30);
			os.write(192734);
			
			//여러바이트 쓰기
			byte[] data = {3,3,3,3,3,3,3,3,3};
			os.write(data);
			
			//여러바이트 쓰기 (배열의 일부분)
			os.write(data, 0, 3); //0번부터 3개까지 3byte
			os.write(data,4,5); // 5byte
			os.write(data, 0,data.length); //9byte
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
