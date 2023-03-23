package ch17.lecture.p01Stream;

import java.util.*;
import java.util.stream.*;

public class C03Stream {
	public static void main(String[] args) {
		
	
	//collection -> stream으로 바꿔주는 메소드가 있다
	List<Integer> list = List.of(9,8,7,1,2,3,0);
	
	//list.stream();// 이러면 스트림 만들어진거임
	Stream<Integer>stream1 =  list.stream();
	long count = stream1.count();
	System.out.println(count);
	
	Stream<Integer>stream2 =  list.stream();
	Optional<Integer> max = stream2.max(Integer::compareTo);
	System.out.println(max.get());
	}
}
