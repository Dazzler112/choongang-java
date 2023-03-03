package ch05.lecture.P01Array;

public class C07Array {
	public static void main(String[] args) {
		int a = 3;
		int b;
		
		b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		
		System.out.println(a);
		System.out.println(b);//a가 6이 됐지 b가 6이 된게 아니자너?
		
		
		int[] arr1 = {5,6,7};
		int[] arr2;
		arr2 = arr1;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1[0] = 50;
		
		System.out.println(arr1[0]);//이거 50이 확실한대.. arr2도 50일까?
		System.out.println(arr2[0]);//50이다 //복사한 새 배열을 갖고싶었으면 arr2 = arr1 이런식으로 하면 안됨
		//8번파일에 계속
 	}
}
