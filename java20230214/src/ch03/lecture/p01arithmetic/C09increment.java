package ch03.lecture.p01arithmetic;

public class C09increment {
	public static void main(String[] args) {
		//증가 연산자 (++)
		//감소 연산자(--)
		
		int x = 1;
		int y =1 ;

		x++; //x는 2가 됨
		++x; //x는 3이됨
		
		y--; // y는 0이됨
		--y; //y가 -1이됨
		
		System.out.printf("%d, %d%n",x,y);
		
		int z = x++ + 10; //13
		int w = ++y + 10;// 10
		System.out.printf("%d, %d%n",z ,w);
	}
}
