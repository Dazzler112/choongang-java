package ch15.lecture.p07treeset;

import java.util.*;

public class C03Comparator {
	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<>((b1,b2) -> b1.getTitle().compareTo(b2.getTitle()));//Book 클래스는 네츄럴 오더링이 안되기 때문에 compareTo 해줘야함 왜 안되는지 API 참조
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("glory"));
		
		System.out.println(set);
	}
}

//get/setters , constructor, toString, hashcode/equals(중복저장 안되게 해야하기 떄문)
class Book{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
	
}
