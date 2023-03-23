package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExmaple2 {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("output/sec02exam02.db")){
			
			byte[] data = new byte[5];
			Arrays.fill(data,(byte) 1);//1로 채우는 코드
			System.out.println(Arrays.toString(data));//읽기전 데이터하고
			is.read(data);
			System.out.println(Arrays.toString(data));//읽은후 데이터 봐바라
			while(true) {
				int num = is.read(data);
				if(num == -1) break;
				
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
