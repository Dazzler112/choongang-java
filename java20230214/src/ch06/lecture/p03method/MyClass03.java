package ch06.lecture.p03method;

public class MyClass03 {
	//(instance) field
	String name;
	
	//(instance) method //인스턴스 아닌것도 있는가? 예
	void greeting() {
		String to = "여러분";
		System.out.println(to+ " 안녕하세요.");
		
		System.out.println("저는"+name+"입니다.");
	}
}