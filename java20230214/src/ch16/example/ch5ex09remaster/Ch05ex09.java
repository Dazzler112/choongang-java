package ch16.example.ch5ex09remaster;

import java.util.*;

public class Ch05ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		List<Integer> scores = new ArrayList<>();
		int numOfStudent = 0;
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");
			
			int menu = sc.nextInt();
			
			switch (menu) {
				case 1:{
					System.out.print("학생수>");
					numOfStudent = sc.nextInt();
					
					}
				case 2:{
					for (int i = 0; i < numOfStudent; i++) {
						System.out.print("scores["+i+"]>");
						int score = sc.nextInt();
						scores.add(score);
					}
				}
				case 3:{
					for(int i = 0; i < numOfStudent; i++) {
						System.out.print("scores["+i+"]:" + scores.get(i));
					}
				}
				case 4: {
					int max = 0;
					double avg = 0;
					for(int e : scores) {
						max = Math.max(max, e);
						avg += e;
					}
					avg /= scores.size();
					System.out.print("최고 점수: " + max);
					System.out.print("평균 점수: "+ avg);
				}
				case 5:{
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
	}

}
