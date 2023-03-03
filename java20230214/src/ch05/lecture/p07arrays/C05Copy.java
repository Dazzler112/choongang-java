package ch05.lecture.p07arrays;

import java.util.Arrays;
//심화 과정 어려우니 이해 못해도 당연
public class C05Copy {
	public static void main(String[] args) {
		int[] arr1 = {3,4,5};
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 30;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));//arr1[0] = 30; 바꾼값 영향 못미침
		
		int[][] arr3 = {
				{3,4,5},
				{9,8,7}
		};
		int[][] arr4 = Arrays.copyOf(arr3, arr3.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		
		arr3[0][0] = 30; //arr3 0 0을 30으로 바꿨을때 arr4는?
		
		System.out.println(arr3[0][0]); //30
		System.out.println(arr4[0][0]); //30
		//모르겠으면 책 181pg참조
	}
}
