package ch13.lecture.p01generic;

import java.util.*;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02();//이렇게 쓰면 아래의 <T> 가 String으로 바꼈다 생각하면 편함
		o1.setItem("java");
		String s1 = o1.getItem(); //형변환 없이 안전하게 사용 가능하다
		System.out.println(s1.length());
		
		MyClass02<Scanner> o2 = new MyClass02();//우리 눈에는 T지만 저기선 Scanner로 바꼈다
		o2.setItem(new Scanner(""));
		Scanner sc = o2.getItem();//형변환 없이 안전히 사용 가능
		sc.hasNext();
		
		//기본타입은 타입아큐먼트로 사용 불가
//		MyClass02<int>//기본타입으로 하고 싶다 xx 기본타입은 안된다
		//이때는 이렇게 사용
		//wrapper 사용
		MyClass02<Integer> o3 = new MyClass02<Integer>();
		o3.setItem(3); //autoBoxing
		int i = o3.getItem(); //참조타입이지만 우리는 언박싱해서 사용 가눙하다
		System.out.println(i);
	}
}

//generic type: 
//T : Type parameter
//Type parameter 작성 관습 : 대문자 한글자
class MyClass02<T>{ //타입 아직 결정이 안됐음
	private T item;//<> : 타입을 나중에 받겠다

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
