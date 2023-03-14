package ch13.sec05;

public class Course {
	//모든 사람이면 등록 가능
	
	public static void registerCourse1(Applicant<?> applicant) {
		Object o = applicant.kind;
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}
	
	//학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		//in
		Student a = applicant.kind;//안전하게 사용 가능
		Person p = applicant.kind;// 안전
		Object o = applicant.kind;//안전
		
//		MiddleStudent m = applicant.kind; //안전하지 않다 하위클래스잖아
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
	}
	
	//직장인 및 일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		//out
		applicant.kind = new Worker(); //가능
		applicant.kind = new SubWorker();//하위 타입이 안전하게 들어갈 수 있다
		applicant.kind = new SubWorker2();//안전
		
//		applicant.kind = new Person();//불안전 - 상위타입은 안전하지 않다!
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
	class SubWorker extends Worker{}
	class SubWorker2 extends Worker{}
}
