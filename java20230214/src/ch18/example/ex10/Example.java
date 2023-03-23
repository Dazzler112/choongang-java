package ch18.example.ex10;

import java.io.*;

public class Example {
	public static void main(String[] args) {
		File origin = new File("output/origin1.jpg");
		File copy	= new File("output/copy2.jpeg");
		
		if(origin.exists() == false) {origin.mkdirs();
									System.out.println("원본파일이 존재하지 않습니다.");}
		try(OutputStream os = new FileOutputStream(copy);
				InputStream is = new FileInputStream(origin);
				BufferedOutputStream bos = new BufferedOutputStream(os);
				BufferedInputStream ios = new BufferedInputStream(is);){
			byte[] data = new byte[1024];
			int len = 0;
			
			while((len = ios.read(data)) != -1) {
				bos.write(data,0,len);
			}
//			int len = ios.read(data);
//			for(int i = 0; i<= len;i++) {
//				if(len != -1) {
//					bos.write(data,0,len);
//				}
//			}
			bos.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("복사에 성공되었습니다.");
	}
}
