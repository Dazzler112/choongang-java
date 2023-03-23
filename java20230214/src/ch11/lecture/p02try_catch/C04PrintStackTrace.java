package ch11.lecture.p02try_catch;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		//unchecked exception
		try {
		String a = "java";
		System.out.println(a.charAt(4)); //unchecked exception
		}catch (StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		try {
			Class.forName("java.lang.String"); //이것도 힌트 기능있음 ctrl +1 이나 ctrl + spacebar 사용 하면 힌트 사용 가능
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
