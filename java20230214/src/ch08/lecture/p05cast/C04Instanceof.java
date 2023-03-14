package ch08.lecture.p05cast;

import java.io.*;
import java.lang.constant.*;

public class C04Instanceof {
	public static void main(String[] args) {
		String s1 = "java";
		
		System.out.println(s1 instanceof String);//true 당연
		System.out.println(s1 instanceof Object);
		System.out.println(s1 instanceof CharSequence);
		System.out.println(s1 instanceof Comparable);
		System.out.println(s1 instanceof Serializable);
		System.out.println(s1 instanceof Constable);
		System.out.println(s1 instanceof ConstantDesc);//여기까지 모두 true implements항목에 들어있는 것 들
	}
}
