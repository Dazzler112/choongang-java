package ch17.lecture.p03intermidiate;

import java.util.*;
import java.util.stream.*;

public class C19Sorted {
	public static void main(String[] args) {
		IntStream.range(1, 6)
		/*중 간 연 산 들 작 성*///역순으로 출력되게 만드시오
		.boxed()
		.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}
}
