package ch12.lecture.p05reflection;

import java.lang.reflect.*;

public class C02Reflection {
	public static void main(String[] args) {
		Class class1 = String.class;
		
		//이름(Full name)
		System.out.println(class1.getName()); //이름만 좀 알고싶다
		
		//이름 (simple)
		System.out.println(class1.getSimpleName());
		
		//패키지
		System.out.println(class1.getPackageName());
		
		//생성자
		Constructor[] constructor =  class1.getConstructors()
		
		//필드
		Field[] fields = class1.getFields();
		
		//메소드
		Method[] method = class1.getMethods();
	}
}
