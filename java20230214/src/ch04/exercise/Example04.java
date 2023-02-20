package ch04.exercise;

public class Example04 {
	public static void main(String[] args) {
		int dice1;
		int dice2;
		do {
			dice1 = ((int)(Math.random() *6)) +1;
			dice2 = ((int)(Math.random() *6)) +1;
			System.out.printf("(%d, %d,)%n",dice1,dice2);
		}while((dice1 + dice2) != 5);
	}
}


/* 내가 작성한 코드
 * int dice1 = ((int)(Math.random() *6)) +1;
int dice2 = ((int)(Math.random() *6)) +1;
int sumDice = dice1+dice2;
System.out.println(sumDice);

do {
	System.out.println("합이 5이상이 아닙니다!");
}while(sumDice < 5);
	System.out.println("합이 5이상입니다!");
	*/