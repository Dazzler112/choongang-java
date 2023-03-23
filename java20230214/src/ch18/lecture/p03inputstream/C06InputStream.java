package ch18.lecture.p03inputstream;

import java.io.*;

public class C06InputStream {
	public static void main(String[] args) {
		String src = "output/origin1.jpg";
		String des = "output/copy1.jpeg";
		
		try(var is = new FileInputStream(src);
				var os = new FileOutputStream(des);){
			byte[] data = new byte[1024];
			
			int len = 0; //원본 파일만큼 바이트수 복사하고 싶을때(포문 돌릴때 .length 비슷한 원리 생각하면 됨)
			if()
			while((len = is.read(data)) != -1 ) {
				os.write(data,0 , len);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("복사 완료!");
	}
}
