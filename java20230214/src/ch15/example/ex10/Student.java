package ch15.example.ex10;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
		
		/* if(score < o.score) {
			return -1;
		}else if(score == o.score) {
			return 0;
		}else {
			return 1;
		} */
	}
	
}
