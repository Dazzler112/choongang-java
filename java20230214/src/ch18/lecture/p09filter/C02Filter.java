package ch18.lecture.p09filter;

import java.io.*;

public class C02Filter {
	public static void main(String[] args) {
		String fileName = "output/byte1.txt";
		try(
		FileOutputStream fs = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fs);
		OutputStreamWriter osw = new OutputStreamWriter(bos);)
			//이런식으로 감쌀수 있고 다른순서로도 감쌀수 있다
		{
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
