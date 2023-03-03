package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int a = 3;
		int b = a; 
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		System.out.println(a);
		System.out.println(b);
		
		int[] arr1 = {5,6,7};
		int[] arr2 = arr1;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1[0] = 99;
		System.out.println(arr1[0]);//arr1을 바꿨는대 arr2까지 바뀐 이유?
		System.out.println(arr2[0]);//예를들어 arr1 주소가 2481이면 
		//int[] arr2 = arr1; 선언시 주소 2481를 복사한거지
		//값을 저장한게 아니여서 그래서 2481 0번을 90으로 바꿨으니 
		//그대로 2481주소안에 있는 0번(90)값을 가져옴
	}
}
