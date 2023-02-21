package ch04.exercise;

public class Example04 {
	public static void main(String[] args) {
//while문과 Math.random()메소드를 이용해 두개의 주사위를
//던졌을때 나오는눈을 출력하고 눈의 합이 5가 아니면 계속
//주사위를 던지고 눈의합이 5이면 실행을 멈추는 코드를 작성
//하시오 눈의합이 5인경우 (1,4)(4,1)(2,3)(3,2)이다.

/* do while로 작성한 문법
		int dice1;
		int dice2;
		do {
			dice1 = ((int)(Math.random() *6)) +1;
			dice2 = ((int)(Math.random() *6)) +1;
			System.out.printf("(%d, %d,)%n",dice1,dice2);
		}while((dice1 + dice2) != 5);
*/	


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


//while break로 작성해라
		int num1;
		int num2;
		while(true) {
			num1 = (int)(Math.random() * 6)+1;
			num2 = (int)(Math.random() * 6)+1;
			System.out.printf("(%d, %d) %n", num1, num2);
			
			if ((num1 + num2) == 5) {
				break;
			}
	}

	
		
		
		
/*내가 작성한것
 int dice3 = (int)(Math.random() * 6) +1;
 int dice4 = (int)(Math.random() * 6) +1;
 while((dice3+dice4) == 5) {
	 System.out.printf("%d,%d",dice3,dice4).println();
	 break;
 		}
 		System.out.println("프로그램 종료"); */
	}
}