package ch16.example.ex08;

public class Student {
	private String name;
	private int englishScore;
	private int mathScores;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScores = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScores() {
		return mathScores;
	}
	
}
