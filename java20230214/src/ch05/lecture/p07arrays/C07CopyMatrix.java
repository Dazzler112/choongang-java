package ch05.lecture.p07arrays;

import java.util.Arrays;

//심화학습
public class C07CopyMatrix {
	public static void main(String[] args) {
		int[][] arr1 = {
				{5,7,9,10},
				{3,2,1,0}
		};
		//깊은 복사 (deep copy)
		int[][] arr2 = new int[arr1.length][];
		
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length);
		}
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		
		System.out.println(Arrays.toString(arr2[0]));
		System.out.println(Arrays.toString(arr2[1]));
		
		arr1[0][0] = 50;
		System.out.println(arr1[0][0]);//50
		System.out.println(arr2[0][0]); //5 2방형이면 복사의 복사를 해야 값을 다르게 할수 있다 
										//3차원이면 복사의복사의복사....이런식으로 1개씩 늘어난다
	}
}
