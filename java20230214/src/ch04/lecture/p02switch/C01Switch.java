package ch04.lecture.p02switch;

public class C01Switch {
	public static void main(String[] args) {
		//switch
		//값에 따라 실행 흐름을 변경할 때 사용
		
		int val = 5;
		System.out.println("이전 실행문...");
		switch (val) {// 스위치 value를 확인해서
		case 1:    //같은게 있으면 실행 이경우는 case1 실행
			System.out.println("code 1");
			break;
		case 2:
			System.out.println("code 2");
			break;
		case 3:
			System.out.println("code 3");
			break;
		default:  //값이 없으면 이게 실행
			System.out.println("code 4");
			break;//마지막 브레이크는 생략 가능
			//default문은 꼭 아래에만갈 필요는 없다
			//대신 위로 올라올 경우 break를 써줘야하니까
			//그냥 아래로 고정 시키자
		}
		
		if(val == 1) {
			System.out.println("code 1");
		}else if(val ==2) {
			System.out.println("code 2");
		}else if(val ==3) {
			System.out.println("code 3");
		}else {
			System.out.println("code 4");
		}
		System.out.println("다음 흐름..");
	}
}
