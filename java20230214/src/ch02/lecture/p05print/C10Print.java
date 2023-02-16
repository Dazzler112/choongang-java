package ch02.lecture.p05print;

public class C10Print {
	public static void main(String[] args) {
		//flag 
		// -:왼쪽 정렬
		System.out.printf("%d%n",33);
		System.out.printf("%5d%n", 33);
		System.out.printf("%-5d%n",33);
		
		System.out.printf("%-10s입니다.%n","son");
		
		//0 : 0으로 채움(수 형식과 쓸수있다 (integer,double 등등))
		System.out.printf("%d%n",99);
		System.out.printf("%5d%n",99);
		System.out.printf("%05dn%n",99);
		System.out.printf("%1$05d%n",99);
		
		System.out.printf("%010f%n",3.14);
		
		//precision : 소수점 이하 자릿수
		System.out.printf("%10.3f%n",3.14);//.6이 소숫점 기본자리인듯
		System.out.printf("%10.3f%n",3.5555);
		System.out.printf("%010.3f%n",3.5555);
		System.out.printf("%1$010.3f%n",3.5555);
	}
}
