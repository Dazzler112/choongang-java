package ch05.exercise.ex7;

public class Example7UsingMathmax {
	public static void main(String[] args) {
		int[] array = {1, 5, 3 ,8, 2};
		int len;
		int max;
		for(int i = 0; i <= array.length; i++) {
			len = array[i];
			max = Math.max(array[i], i);
			int a1 = array[(Math.max(max, i))];
			System.out.println(max);
		}
	}
}
