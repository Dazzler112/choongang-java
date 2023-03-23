package ch18.lecture.p02outputstream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		//fianlly 블럭 안에서도 사용할 수 있게 try 블럭 밖에서 선언
		OutputStream os = null;
		try {
		//스트림 열고
		os = new FileOutputStream("output/output.txt");
		
		//어떤 작업
		os.write(1);//1byte사용 했다
		os.flush();
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//꼭 해야함
			if(os != null) { //<---NullPointException 체크를 해줘야함!
				try {
			os.close(); //어떤 일이 끝나면 항상 닫아 줘야함
			//close는 fianlly 블록안으로 들어가야함!
				}catch(IOException e) {
					e.printStackTrace();
				} //옛날방식
			}
		}
	}
}
