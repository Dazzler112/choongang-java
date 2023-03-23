package ch18.lecture.p03inputstream;

import java.io.*;

public class C07InputStream {
	public static void main(String[] args) {
		String src = "ouput/origin1.jpg";
		String des = "output/copy2.jpeg";
		
		try(var is =new FileInputStream(src);
				var os = new FileOutputStream(des);){
			
			is.transferTo(os); //복사쉽게 transfeTo
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사 완료!");
	}
}
