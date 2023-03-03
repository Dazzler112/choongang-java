package ch05.lecture.p04string;

public class C02String {
	public static void main(String[] args) {
		String str1 = new String("java");//new 연산자 생략 가능
		String str2 = "java";
		String str3 = "java"; //생략했을때 벌어지는 일은 무엇일까?
		
		System.out.println(str2 == str3); //true
		//new 생략시 이미 있는 리터럴 값을 재사용 해서 true가 나옴
		//string의 특별한 경우임 리터럴값 이런거 외우지 말기
		System.out.println(str1 == str2);//false
		System.out.println(str2.equals(str3));
		//그래서 문자열(데이터값) 비교는 equals를 사용해라! 꼭!
	}
}
