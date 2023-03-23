package ch18.lecture.p02outputstream;

import java.io.*;

public class C05Close {
	public static void main(String[] args) {
		//var
		String s = "java";
		var s2 = "java";
		
		//try - with -resource 에 var 사용 가
		try(var os = new FileOutputStream("")){
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
