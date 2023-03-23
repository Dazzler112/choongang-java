package ch17.lecture.p01Stream;

import java.util.*;
import java.util.stream.*;

public class C02Stream {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(9,8,7,1,2,3);
		long count = stream1.count();
		
		System.out.println(count);
		
		//또 다른일 하고싶다... 그럼 또만들어야 한다..
		Stream<Integer> stream2 = Stream.of(9,8,7,1,2,3);
		//최대값 알고싶다
		Optional<Integer> max = stream2.max(Integer::compare);
		
		System.out.println(max.get());
	}
}
