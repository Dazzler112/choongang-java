package ch18.sec02.exam03;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output/sec02exam03.db");
			
			byte[] array = {10,20,30,40,50};
			
			os.write(array,1 ,3);
			
			os.flush();
			os.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
