package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {
	public static void main(String[] args) {
		int[] arr1 = {5,2,1,0};
		
		System.out.println(Arrays.toString(arr1));//배열의 배열이면?
		
		int[][] arr2 = {
				{7,8},
				{2,3}
		};//2차배열에 Arrays.toString 사용시 낮게보여줌
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("for loop로 toString");
		for(int[] arr : arr2) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("deeptoSting메소드 사용");
		System.err.println(Arrays.deepToString(arr2));//이걸 사용하면 위의 for문까지 할 필요 없음
											//외우지 말고 그냥 이런게 있다 정도만 알기
	}
}
