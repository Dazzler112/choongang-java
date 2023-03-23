package ch17.sec04.exam03;

public class StringBuilderExample {
	public static void main(String[] args) {
		//StringBuilder vs String
		
		//StringBuilder 는 문자열 수정 가능
		//String 문자열 수정 불가
		String a = "java"; //hello
		String b = "html";
		
		String c = a + "hello";
		String d = b + "hello"; //여기까지가 String에서 일어나는 일
		
		//StringBuilder는?
		StringBuilder e = new StringBuilder("java");
		StringBuilder f = new StringBuilder("html");
		e.append("hello"); //e라는 객체 안에 필드값이 바뀐다
		f.append("hello");
		
		System.out.println(e);
		System.out.println(f);
	}
}
