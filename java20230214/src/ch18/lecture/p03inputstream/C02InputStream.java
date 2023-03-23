package ch18.lecture.p03inputstream;

import java.io.*;

public class C02InputStream {
	public static void main(String[] args) {
		try(var is =  new FileInputStream("output/sec02exam03.db")){
			int data = 0;
			
			while((data = is.read()) != -1) {}
			System.out.println(data); //3번출력된다 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
