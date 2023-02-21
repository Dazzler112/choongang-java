package ch04.exercise;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
/*문2)
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("입력>");
		int a = sc.nextInt();
		for(int i = 0; i < a; i++){
			for(int j = 1; j <=(i+1);j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
