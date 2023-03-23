package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();//변기 물 내리듯이 다 흩뿌려줌 간혹 일하는 flush가 있을수 있다
			os.close();//사용이 끝나면 꼭 닫아줘야한다
			//결론은 습관적으로 flush,close를 써라
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
