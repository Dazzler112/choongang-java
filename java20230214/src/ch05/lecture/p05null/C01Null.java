package ch05.lecture.p05null;

public class C01Null {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2}; //<-데이터값을 가르키지 않도록 할수도 있음
		//arr1 = null;// 참조하는 객체 없음
		//null 로 선언하는 순간 new int[] {1,2} 따로 다른 변수에 저장된 애가 있지 않은이상<-이건 garbage 취급
		
		int len = arr1.length; //참조하는 객체 없음 예외 발생(NullPointerException)
		int val = arr1[0];   //길이나 해당 값을 알아낼수 있지는 않음
		
		System.out.println("실행 흐름..."); //null 오류가 발생 
		//주의해서 작성할 것 null값 
	}
}
