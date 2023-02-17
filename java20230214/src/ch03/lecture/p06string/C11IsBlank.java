package ch03.lecture.p06string;

public class C11IsBlank {
	public static void main(String[] args) {
		//isBlank
		//공백문자만 있는지 확인?
		//return type : boolean
		
		String str1 = "   java  "; //문자가 있어서 false
		String str2 = "      "; //나머진 다 true 빈문자니까
		String str3 = """
				
				
				""";
		String str4 = "";
		
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		System.out.println(str4.isBlank());
		
		//trim 하고 isEmpty 섞어서 쓰면 비슷하다
		System.out.println(str1.trim().isEmpty());
		System.out.println(str2.trim().isEmpty());
		System.out.println(str3.trim().isEmpty());
		System.out.println(str4.trim().isEmpty());
	}
}
