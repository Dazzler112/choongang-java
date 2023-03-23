package ch17.lecture.p03intermidiate;

import java.util.*;

public class C18Sorted {
	public static void main(String[] args) {
		List<Car> list = List.of(
				new Car("genesis",7000),
				new Car("avante",2500),
				new car("tesla",))
				
				list.stream()
				.sorted()
				.forEach(System.out::println);
		
		//이름순으로 확인해서 최종연산을 하고싶다...
		System.out.println();
		list.stream()
			.sorted((a,b) -> a.getName().compareTo(b.getName()))
			.forEach(System.out::println);
		
		//가격 역순으로 하고 싶다..
		list.stream()
			.sorted((a,b) -> b.getPrice() - a.getPrice())
			.forEach(System.out::println);
	}
}
class Car implements Comparable<Car>{
	private String name;
	private int price;
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Car o) {
		return this.price - o.price;
	}
}
