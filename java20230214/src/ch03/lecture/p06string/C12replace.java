package ch03.lecture.p06string;

public class C12replace {
	public static void main(String[] args) {
		//replace
		//특정문자열을 바꿀때 사용
		//원본을 바꾸는게 아니라 바꾼걸 리턴함
		//return type : String
		
		String str1 = "설악산, 백두산, 한라산";
		String str2 = str1.replace("산", "mountain");
		System.out.println(str1);
		System.out.println(str2);
		
		//한글자만 바꿀수 있느냐? ㄴㄴ 여러글자 가능
		
		String str3 = str1.replace("설악","지리");
		System.out.println(str3);
	}
}
