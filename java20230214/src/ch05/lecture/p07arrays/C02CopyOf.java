package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C02CopyOf {
	public static void main(String[] args) {
		
		//copyof 이전의 고전적인방법
		int[] arr1 = {9,8,1,2,3};
		//arr2 에 인스턴스 자체를 복사하고 싶다
		int[] arr2 = new int[arr1.length];
		
		for(int i =0; i < arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		
		arr1[0] = 22;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));//이렇게 바뀌지않는다
	}
}
