package ch05.lecture.P01Array;

public class C03Array {
	public static void main(String[] args) {
		//배열 만들고 값 할당
		int[] arr1 = new int[3];
		arr1[0] = 9;
		arr1[1] = 7;
		arr1[2] = 5;
		//선언이 너무 길다 그럼 아래처럼 짧게 가능
		
		//배열 만들 때 초기값 생성
		int[] arr2 = new int[] {99, 77, 55};//중괄호로 값 넣을수 있음
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		
		int[] arr3;
		arr3 = new int[] {10, 20, 30, 40};//이렇게 선언하고 나중에 넣어도 되겠다
		
		for(int i = 0; i < 4; i++) {
			System.out.println(arr3[i]);
		}
	}
}
