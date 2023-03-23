package ch18.lecture.p05reader;

import java.io.*;
import java.util.*;

public class C02Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		
		try(var rd = new FileReader(name)) {
			System.err.println((char)rd.read());//가
			System.err.println((char)rd.read());//나
			System.err.println((char)rd.read());//다
			
			char[] data = new char[5];
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));//다읽었으면 직전에 읽었던 슬래쉬가 나온다
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
