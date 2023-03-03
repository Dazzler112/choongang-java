package ch05.lecture.p03matrix;

public class C03Matrix {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2,3,4,5};
		
		int[][] mat1 = new int[][] {
			new int[] {3,4,5,7},
			new int[] {10,11,12,13},
			new int[] {9, 8, 7, 6}
		};
		int[] arr2 = {2,3,4,5};
		int[][] mat2 = {
					{3,4,5,7},
					{10,11,12,13},
					{9,8,7,6}  //item의 길이가 꼭 같아야하는가? no
		};
		int[][] mat3 = { //길이가 꼭 같을 필요는 없다
				{1,2,3,4},
				{10,20},
				{99,100,101}
		};
	}
}
