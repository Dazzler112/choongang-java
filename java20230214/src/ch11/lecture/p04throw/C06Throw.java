package ch11.lecture.p04throw;

import java.io.*;

public class C06Throw {
	public static void main(String[] args) {
		
	}
	
	public static void mothod2() throws Exception {//Throwable //이렇게 상위 하나만 써줘도 가능 
		int a = 1;
		if(a ==1) {
			throw new ClassNotFoundException();
		}else {
			throw new FileNotFoundException();
		}
	}
	
	public static void method1() throws ClassNotFoundException , FileNotFoundException{// 2개일 경우 2개 다 명시 해줘야함  (물론 unchecked exception 경우 안써줘도 됨)
		int a =1;
		if(a==1) {
			throw new ClassNotFoundException();
		}else {
			throw new FileNotFoundException();
		}
	}
}
