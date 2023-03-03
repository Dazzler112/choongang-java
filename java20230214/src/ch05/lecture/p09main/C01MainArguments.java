package ch05.lecture.p09main;

public class C01MainArguments {
	public static void main(String[] args) {
		
		//아규먼트 없이 실행
		//java C01MainArguments <-eclips없었으면 이런식으로 쳤을것
		
		//아규먼트 전달 실행
		//java C01MainArguments Hello Java
		
		System.out.println(args.length);//아무것도 넣지않아서 길이가 0
		System.out.println(args[0]);
		System.out.println(args[1]);
//		System.out.println(args[2]);
		System.out.println("명령문들...");
	}
}
