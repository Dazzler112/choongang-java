package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C09Srot {
	public static void main(String[] args) {
		//sort : 정렬
		int[] arr1 = {9,0,2,3,8,-1};
		//정렬하고 싶다
		
		System.out.println(Arrays.toString(arr1));//정렬전
		
		//정렬 (오름차순)
		Arrays.sort(arr1);//정렬후
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"java","hello","html","css"};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3 = {"java","hello","html","css","Java","Css"};
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		//유니코드에 따라 대문자가 앞으로(값이 더 작다)
	}
}//이것도 example sort 예제 가능example7번
