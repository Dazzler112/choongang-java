package ch06.lecture.p07constructor;

public class C08OverLoading {
	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("son", 33, "01-02", false);
		MyClass08 o2 = new MyClass08("park", 55, null, false);//생일을 모르겠다
		o2.birthDate = "02-03";//이렇게 해도 되지만 생성자 1개더 만들고 아래처럼
		MyClass08 o3 = new MyClass08("cha", 77, false);
		o3.birthDate = "03-04"; //이렇게 하는게 더 깔끔하다
	}
}
