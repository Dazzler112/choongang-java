package ch11.lecture.p04throw;

import java.io.*;

public class C08Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//---------이런식으로 선택권이 많다-------------------------
		try {
			method1();
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//------------------------이런식도 있다 (상위로 받기)-------------		
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void method1() throws FileNotFoundException, ClassNotFoundException{
		
	}
}
