package ch11.lecture.p03finally;

public class C02Finally {
	public static void main(String[] args) {
		 try {
			 boolean a = true;
			 if(a) {
				 return;
			 }else {
				 System.out.println("try block...");
			 }
		 }catch (NullPointerException e) {
			 System.out.println("exception block...");
		 }finally { //try던 catch던 무슨일이 발생 하더라도 계속 진행됨
			
			 //심지어 return 되어도 실행되는 블럭
			 System.out.println("finally block@@@");
		}
	}
}
