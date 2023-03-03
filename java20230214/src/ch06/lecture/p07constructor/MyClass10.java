                                                                                                                             package ch06.lecture.p07constructor;

public class MyClass10 {
	String name;
	int age ;
	String birth;
	
	MyClass10(String name){
		this.name = name;
	}
	MyClass10 (String name , int age){
		this(name);//다른 생성자 호출
//		this.name =name;
		this.age = age;
	}
	MyClass10 (String name , int age, String birth){
		this(name,age);//다른 생성자 호출
//		this.name =name;  위에서 호출 했으니
//		this.age = age;	  이것들은 필요 없음
		this.birth = birth;
	}
	void printField () {
		System.out.println("name: " + name + ", age: " + age + ", birth: " +birth);
	}
}
