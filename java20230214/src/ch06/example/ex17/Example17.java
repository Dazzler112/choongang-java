package ch06.example.ex17;
//static 사용
public class Example17 {
public static void main(String[] args) {
	//인스턴스와 다른점 Printer printer = new Printer 메소드 생성 할 필요가 없음
	Printer.println(10);
	Printer.println(true);
	Printer.println(5.7);
	Printer.println("홍길동");
	}
}
