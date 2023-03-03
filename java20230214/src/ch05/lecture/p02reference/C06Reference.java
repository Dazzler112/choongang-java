package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] arr = new int[] {2,4,6};
		
		method1(arr);
		
		System.out.println(arr[0]); //2?, 3?
		//2가 출력된 이유 main메소드에서 이미 새로운 변수를
		//선언했고 method1이 main안에 있고 method1매소드에 새로운 변수 선언을
		//했어도 arr로 이름만 같은 서로 다른 변수이기 때문에
	}
	public static void method1(int[] arr) {
		arr = new int[] {3, 5, 7};
	}
}
