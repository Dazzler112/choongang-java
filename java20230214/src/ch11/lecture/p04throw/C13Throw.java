package ch11.lecture.p04throw;

import java.io.*;

public class C13Throw {
	public static void main(String[] args) throws Exception { //현실은 이런식으로 너무 많이 던진다.... 좋지 않다....
		method2();
	}
	public static void method2() throws Exception {
		method1();
	}
	
	public static void method1() throws Exception {
		new FileInputStream("");
		
	}
}
