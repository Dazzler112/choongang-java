package ch06.codingbat;

public class CodingBatArray2FizzArray3 {
	public int[] fizzArray3(int start, int end) {
		int[] res = new int[end = start];
		for(int i = 0; i < res.length; i++) {
			res[i] = start+i;
		}
		  return res;
		}
}
