package ch17.lecture.p01Stream;

import java.util.*;
import java.util.stream.*;

public class C05Stream {
	//array -> stream 변환
	public static void main(String[] args) {
		String[] arr = {"java","spring", "jsp","html"};
		Stream<String> stream1 =  Arrays.stream(arr);
		
		System.out.println(stream1.count());//몇갠지 알고싶다
		
		Stream<String> stream2 =  Arrays.stream(arr);//나중에 오는 스트림을 알고싶다
		System.out.println(stream2.max(String::compareTo).get());
	}
}
