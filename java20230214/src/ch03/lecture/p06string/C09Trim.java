package ch03.lecture.p06string;

public class C09Trim {
	public static void main(String[] args) {
		//Trim
		//문자의 앞,뒤 공백 제거
		//return type: String
		String str1 = "      my   spring";
		System.out.println(str1);//공간이 많은대 없에고 싶다
		String str2 = str1.trim();
		
		System.out.println(str1);//str1이 바뀌는게아니라
		System.out.println(str2);//str2에 리턴된게 바뀜
	}
}
