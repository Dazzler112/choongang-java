package ch04.exercise;

public class Example03 {
	public static void main(String[] args) {
	//for문을 이용해서 1~100까지 정수중 3의배수의 총합을
	//출력하는 코드를 작성하시오
		// while문
		int i = 0;
		int sum = 0;
		while (i <=100) {
			sum += i;
			i +=3;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int j = 0; j <=100; j+=3) {
			sum2 += j;
			System.out.println(sum2);
		}
	}
}
