package ch06.codingbat;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CodingBatArray2FizzArray3Test {

	@Test
	void fizzArray3test() {
		CodingBatArray2FizzArray3 o1 = new CodingBatArray2FizzArray3();
		
		int[] res1 = o1.fizzArray3(5,10);
		assertArrayEquals(new int[] {5, 6, 7, 8, 9}, res1);
		
		int[] res2 = o1.fizzArray3(11,18);
		assertArrayEquals(new int[] {11,12,13,14,15,16,17}, res2);
		
		int[] res3 = o1.fizzArray3(1, 3);
		assertArrayEquals(new int[] {1, 2}, res3);
	}

}
