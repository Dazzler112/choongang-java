package ch04.exercise;

public class Example02 {
	public static void main(String[] args) {
		String grade = "B";
		int score1 = 0;
		
		switch (grade) {
		case "A","a"-> score1 = 100;
		case "B","b" ->{
			int result = 100-20;
			score1 = result;
		}
		default ->{
			score1 = 60;
		}
		};
		System.out.println(score1);
	}
}
