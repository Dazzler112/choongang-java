package ch06.lecture.p03method;

public class MyClass12 {
	int method1() {
		
		return 3; //1.메소드 종료 
				  //2.오른쪽값 호출한 곳으로 return(반환)
				//오른쪽 값은 메소드 리턴타입과 일치해야함
		//ex void return 3; 은 반환 안됨 void를 int로 바꿔야함
	}
	int method2() {
		//메소드에 리턴타입을 명시하면
		//해당 타입의 값을 꼭 리턴해야 함
		if (true) {
			return 3;//method2 컴파일러 에러 뜬이유? if문 떄문에
		}
		return 5; //그래서 밖으로 빼줘야 에러 안나옴
	}
	//자동 형 변환
		int method3 () {
			int a= 3;
			
			return a;
		}
		
		int method4() {
			long a = 3l; //int로 명시했으니 안됨
			return a; //안됨
		}
		
		int method5() {
			short a= 6000; //이건 됨
			return a; //자동 형변환
		}
		double method6() {
			double d= 3.14;
					
			return d;
		}
		double method7() {
			long l =33;
			return l; //자동 형변환
		}
		//리턴이 없으면 void로 리턴타입 명시
		void method8() {
			return; //만약 쓴다면 메소드 종료 역할로만 사용 가능
		}
}
