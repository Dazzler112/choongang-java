package ch16.example.ex08;

public class Example {
	private static Student[] student = {
			new Student("홍길동" , 90, 96),
			new Student("신용권" , 95, 93)
	};

	//avg() 메소드 작성 문제
	private static double avg(Function <? super Student> function) {
		double sum = 0;
		for(Student s : student) {
			double score = function.apply(s);
			sum += score;
		}
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		// double englishAvg = avg(Student::getEnglishScore); 메소드 참조
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScores() );
		//double mathAvg = avg(Student :: getMathScores); //메소드 참조
		System.out.println("수학 평균 점수: + mathAvg");
	}
}
