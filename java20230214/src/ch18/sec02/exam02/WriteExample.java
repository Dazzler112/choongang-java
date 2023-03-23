package ch18.sec02.exam02;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output/sec02exam02.db");
			
			byte[] array = {10,20,30,40,50};
			
			os.write(array, 0, 3);
			os.flush();
			os.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
