package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C06Copy {
	public static void main(String[] args) {
		//얕은 복사 (shallow copy)
		int[][] arr1 = {
				{3,4},
				{9,8}
		};
		int[][] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		arr1[0][0] = 30;
		System.out.println(arr1.length);//30
		System.out.println(arr2.length);//30 ->30나온 이유 객체의 객체 까지의 주소는 다르지만
									//[0][0] 이차배열이 들어있는 주소값 까지 다른건 아니여서 둘은 서로 일치해서
									//30으로 바뀌었다
	}
}
