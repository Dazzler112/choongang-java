package ch04.lecture.p05break;

public class C03Continue {
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("실행문1");
			
			if(true) {//continue는 보통 if같은 조건이 맞아야 실행되는 이런곳에 많이 쓰임
			continue; //false면 continue안만나니까 실행1,2 반복
			}
			System.out.println("실행문2");
		}
	}
}
