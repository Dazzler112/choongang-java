package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C10ToCharArray {
	public static void main(String[] args) {
		//String의 toCharArray
		String str1 = "hello world";//쪼개주자
		String[] arr1 = str1.split("");
		
		System.out.println(Arrays.toString(arr1));
		
		char[] arr2 = str1.toCharArray(); //변수타입이 char
		//arr1는 string arr2는 각원소의 타입이 캐릭터
		System.out.println(Arrays.toString(arr2));
	}
}
