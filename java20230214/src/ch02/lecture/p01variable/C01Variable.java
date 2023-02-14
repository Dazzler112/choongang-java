package ch02.lecture.p01variable;

public class C01Variable {
		//변수
		//값을 담을 수 있는 이름있는 공간
		
		//변수 선언 시
		//타입 변수명; 필요
		int age;
		double average;
		
		//변수명
		//영문 대소문자, _ , $ 숫자 조합으로 작성 가능, 숫자로 시작하면 안됨
		//변수명 작성 관습 : lowerCamelCase
		int $; //O
		// int _; //_ 만 변수명 불가
		int hello; //O
		int your_age;
		int h3;//o
		//int 3h// XX숫자로 시작 불가
		int yourAge; //ok
		int 나이; //사용하지 말것
		
		//변수 여러개 선언 가능
		int myAge , hisAge, herAge;
		
		//같은 이름의 변수 선언 불가
			int hi;
		// int hi;// 똑같이 이름 선언 불가 (되는경우도 있지만 나중에 알려줌)
		
		//변수에 값 대입 할당 : =
			hi = 3;
			int var1;
			va1r = 99;
		
		//변수 선업,값대입
			int var2 = 100;
		
		//여러개 가능
			int var3 = 20,var4=30;
		
		//값을 할당 하지 않은 변수 사용 불가
		//다시말해 = 초기화 하지 않은 변수 사용 불가
			int var5;
		// System.out.println(var5); //x
		
		//변수명 작성시 어떤값을 갖는지 알아볼수 있게
			int koreanScore;
			int ks;//x
			int englishScore;
}
