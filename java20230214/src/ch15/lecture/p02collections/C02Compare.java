package ch15.lecture.p02collections;

import java.util.*;
//문자의 크기 비교
public class C02Compare {
	public static void main(String[] args) {
		List<Person02> list1 = List.of
				(new Person02("son",30),
						new Person02("cha", 50),
						new Person02("park", 40)); //컴퓨터는 어느 문자가 큰지 작은지 모른다
		List<Person02> list2 = new ArrayList<>(list1);
		// Comparator.compare 메소드는
		//다음 세개중 하나의 값을 리턴하도록 만들어야함
		//음수 : 첫번째 매개값이 작으면
		//0 : 두값이 같으면
		//양수 : 첫번째 매개값이 크면
		Person02 maxAge = Collections.max(list2,(a,b) -> a.getAge() - b.getAge());//Person02에 comparelable을 상속하지 않아서 max를 사용 못한다? ㄴㄴ
		System.out.println(maxAge.getName() + "," +maxAge.getAge());//cha 가 나오면 잘나온거다
		
		Person02 minAge = Collections.min(list2,(a,b)->a.getAge() - b.getAge());
		System.out.println(minAge.getName() + "," +minAge.getAge());
		System.out.println(list2);
		
		//나이순 정렬
		Collections.sort(list2, (x,y)-> x.getAge() - y.getAge());
		System.out.println(list2);
		
		//이름순 정렬 
		//compareTo 유니코드 순으로 받아옴
		Collections.sort(list2, (x, y) ->x.getName().compareTo(y.getName()));
		System.out.println(list2);
	}
	
}

class Person02{//다음파일은 클래스가 네츄럴 오더링 하게 바꾸면 어떻겠느냐
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person02 [name=" + name + ", age=" + age + "]";
	}
	
}