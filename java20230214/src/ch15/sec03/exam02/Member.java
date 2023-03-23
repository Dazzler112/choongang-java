package ch15.sec03.exam02;

import java.util.*;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//hashcode 재정의
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
}
