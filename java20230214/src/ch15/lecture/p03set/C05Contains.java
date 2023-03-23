package ch15.lecture.p03set;

import java.util.*;

public class C05Contains {
	public static void main(String[] args) {
		var set = new HashSet<Book>();
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("topgun"));
		set.add(new Book("slamdunk"));//안들어감
		
		System.out.println(set.size());
		//어떤 객체가 있는지 확인해 보고 싶었음
		System.out.println(set.contains(new Book("avatar")));//false //hashcode,equals 생성시 true
		
		//title이 같으면 같다고 하고싶다 hashcode equals 사용해라
	}
}

class Book{
	private String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
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
