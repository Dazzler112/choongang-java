package ch12.lecture.p01object;

public class C13Enum {
	public static void main(String[] args) {
		
		Season season = Season.FALL;
	
		String a = switch (season) {
		case SPRING, FALL ->
		"좋은 계절이다.";
	
		case SUMMER ->
		"덥다";
		case WINTER -> "춥다.";
	
	//	default ->"잘못입력"; 여기선 생략 가능
		};
		System.err.println(a);
	}
	//record enum은 복습 안해도 된다 나중에 필요하면 다시 공부 그냥 이런게 있구나 정도
}
