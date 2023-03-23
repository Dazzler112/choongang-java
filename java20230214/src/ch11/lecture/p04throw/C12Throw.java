package ch11.lecture.p04throw;

import java.io.*;

public class C12Throw {
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) { //FileNotFoundryEception 이 안나오고 Exception이 나온이유?
			//Exception으로 던졌으니까 원래 exception발생 인 그하위로 다시 받을수 없음
			e.printStackTrace();
		}
	}
	public static void method1() throws Exception {
		new FileInputStream("");
	}
}
