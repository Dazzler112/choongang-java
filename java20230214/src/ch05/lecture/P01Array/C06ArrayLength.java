package ch05.lecture.P01Array;

public class C06ArrayLength {
	public static void main(String[] args) {
		//배열의 길이
		int[] arr1 = {3, 4, 5 ,9}; //시간지나 길이 변경됨 9추가
		
		int len = arr1.length;//length : 배열의 길이 를 가지고있는 property
		
		for(int i = 0; i<len; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		for(int i = 0; i < arr1.length; i++) {//혹은 변수 사용 안하고 바로 length 사용
			System.out.println(arr1[i]);
		}
	}
}
