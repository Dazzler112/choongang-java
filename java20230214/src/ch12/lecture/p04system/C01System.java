package ch12.lecture.p04system;

public class C01System {
	public static void main(String[] args) {
		//System
		//currentTimeMillis
		//현재시간 (1970년 1월 1일 0시부터 현재까지의 milli second 경과)
		//현재 시간 얻어오기
		
		long current = System.currentTimeMillis();//long타입 리턴
		System.out.println(current); //현재시간 - 1970년블라블라 
	}
}
