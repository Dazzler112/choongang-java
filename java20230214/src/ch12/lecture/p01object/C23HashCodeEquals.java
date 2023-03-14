package ch12.lecture.p01object;

import java.util.*;

//이번꺼는 수학에 배우는 집합 생각하고 봐보자
//set 중복 없는 원소들의 모임
public class C23HashCodeEquals {
	public static void main(String[] args) {
		//set : 중복 없는 원소의 모임(collection)
		Set set = new HashSet();//Set은 자체로는 인스턴스 생성 불가
		
		System.out.println(set.size());//원소가 없으니 사이즈0
		
		set.add(100);//원소를 넣어보자
		
		System.out.println(set.size()); //원소 하나 넣었으니 1
		
		set.add(200);
		System.out.println(set.size());//2
		
		set.add(100); //중복 없는 원소들의 모임인대...?
		//set은 존재하지 않으면 추가인대
		//이미 있으니 원소에 추가 안됨
		System.out.println(set.size()); //당연히 원소 추가x
	}
}
