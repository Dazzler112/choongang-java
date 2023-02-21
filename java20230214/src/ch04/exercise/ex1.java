package ch04.exercise;

import java.util.Scanner;
/*문1)다음을 출력
 *0 
 *01
 *012 
 *0123 
 *01234 
 * 
 *문2)
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * 문3)
 * 0
 * 10
 * 210
 * 3210
 * 43210
 */

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >");
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {//i<5로 해도 됨
			for(int j = 0; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
