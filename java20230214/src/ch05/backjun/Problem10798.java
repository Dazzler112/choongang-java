package ch05.backjun;

import java.util.Scanner;

public class Problem10798 {
	public static void main(String[] args) {
		String input ="""
				ABCDE
				abcde
				01234
				FGHIJ
				fghij
				""";
		Scanner sc = new Scanner(input);
		String[][] whole = new String[5][];
		for(int i = 0; i<5;i++) {
			whole[i] = sc.nextLine().split("");
		}
		//큰 길이 구하기
		int max = 0;
		for(int i =0; i <5;i++) {
			if(max < whole[i].length) {
				max = whole[i].length;
			}
		}
		int numberOfCharacter = max;
		for(int i = 0; i <numberOfCharacter; i++) {
		for(int j = 0; j < 5;j++) {
			if(i < whole[j].length) {
				System.out.print(whole[j][i]);
			}
		}
		}
	}
}
