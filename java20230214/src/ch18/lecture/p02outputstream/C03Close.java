package ch18.lecture.p02outputstream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		//try -with-resources
		
		try (OutputStream os = new FileOutputStream("");){//<--자동닫기(close)
			
			os.wait();
			os.flush();
			//os.close(); 불편하다! 그래서 이렇게 안써주고 try()안에다가 os생성을 써주면 자동으로 닫아준다
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
