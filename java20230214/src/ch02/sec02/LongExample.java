package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
	long var1 = 10;
	long var2 = 20L;
	//long var3 = 1000000000000; //int의 범위가 넘었기 때문에 뒤에 L이나 l을 붙혀줌 하지만L을 권장 1고 햇깔릴수 있기 때문
	long var4 = 1000000000000L;
	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var4);
}
}
