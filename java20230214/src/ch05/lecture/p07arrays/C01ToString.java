package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {
	public static void main(String[] args) {
		int[] arr1 = {9,8,7,1,2};
		
		for(int n : arr1) {
			System.out.println(n);
		}
		//위에 import안뜨면 ctrl+shift+o
		System.out.println(Arrays.toString(arr1)); //for문 안쓰고 안에있는 배열들 보는 방법
		
		//string도 보고싶다
		String[] arr2 = {"java", "hello","friday", "sunday"};
		System.out.println(Arrays.toString(arr2)); 
	}
}
