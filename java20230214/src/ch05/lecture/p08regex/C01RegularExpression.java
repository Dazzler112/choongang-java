package ch05.lecture.p08regex;

import java.util.Arrays;

public class C01RegularExpression {
	public static void main(String[] args) {
		//regular expression
		//정규식,정규표현식,정규식표현 등등등...
		//패턴을 표현하는 문자열
		
		String str = "java,   css,     html,    spring";
		//띄어쓰기 패턴이 일정하지 않다...
		String[] arr1 = str.split(",");
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = str.split("\\s*,\\s*"); //공백문자
		System.out.println(Arrays.toString(arr2));
		//id 패스워드 검사일때 유용할수 있겠다...
		
		String[] arr3 = str.split("\s*,\s*");
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("a\sb");
		System.out.println("a b");
		System.out.println("a\\sb");
	}
}
