package ch13.Example.ex3;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<>();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job = container1.getvalue();
		
		Container<String, Integer> container2 = new Container<>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getvalue();
		
		System.out.println("이름은 " + name1+" 직업은 " + job);
		System.out.println("이름은 " + name2 + " 나이는 " + age);
	}
}

class Container<T, U> {
	public T item1;
	public U item2;
	
	public T getKey() {
		return item1;
	}
	public void set(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	public U getvalue() {
		return item2;
	}
	
}