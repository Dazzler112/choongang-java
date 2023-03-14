package ch16.sec05.exam3;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		Member m1 = person.getMember1(Member :: new);
		Member m3 = person.getMember1(s -> new Member(s));//람다식
		System.out.println(m1);
		System.out.println();
		
		Member m4 = person.getMember2((s,t) -> new Member(s,t));//람다식
		Member m2 = person.getMember2(Member:: new);
		System.out.println(m2);
	}
}
