package ch02.lecture.p02type;

public class C06Overflow {
	public static void main(String[] args) {
		int i1 = 2147483647;
		int i2 = i1 + 1;
		
		System.out.println(i1);
		System.out.println(i2); //2147483647 최대 값인대 +1해주면 오버 되서 음수로 바뀜
		//0111 1111 1111 1111 1111 1111 1111 1111 에서 +1 더해져서 1000 0000 0000 0000 0000 0000 0000 0000 된거
		//(양에서 음수됨)
	}
}
