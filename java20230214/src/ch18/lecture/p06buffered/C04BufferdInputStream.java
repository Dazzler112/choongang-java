package ch18.lecture.p06buffered;

import java.io.*;

//notbuffered
public class C04BufferdInputStream {
	public static void main(String[] args) {
		String name = "output/buffered1.txt";
		
		
		try(InputStream fis = new FileInputStream(name);) {
			long start = System.nanoTime();
			while(fis.read() != -1) {
				
			}
			
			long end = System.nanoTime();
			System.out.println((end-start) + "ns");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//결론 buffered를 안쓰면 처리가 더 오래걸리는구나?