package ch02.lecture.p02type;

public class C10String {
	public static void main(String[] args) {
		//String (참조타입)
		//문자열 저장
		
		String s1;
		s1 = "hello world!";
		s1 = "h";
		s1 = "";
		
		char c1 = '가';
		
//		s1 = c1; //x  string = char 는 성립안됨
				//c1 = s1 도 안됨
		
		String s2 = "i am \"ironman\""; //큰따옴표는 역슬래시(\)사용
		System.out.println(s2);
		
		String s3 = "i \\"; //역슬래쉬 쓰고싶을때는 (\\)사용
		System.out.println(s3);
		
		String s4 = "I am \n ironman."; //\n 한줄 띄어쓰기
		System.out.println(s4);
		
		//대부분 c언어를 가져와서 js에도 같은부분이 있다 
		
		String s5 = "<h1>\n\thello \n\t<span>world</span>\n</h1>";
		System.out.println(s5);
		
		//text block 3개 큰따옴표로 시작해서 3개의 큰따옴표로 끝남
		//첫번째 엔터 무시
		//가장 작은 들여쓴 줄이 들여쓰기 기준
		String s6 = """
				<h1>
					'hello'
					<span>"world"</span>
					</h1>
				""";// 가장 작은 들여쓴 줄이 들여쓰기 기준 
					//=>해결법 마지막 """에 조절해주면 쉽게 할수있다
					//큰따옴표 작은따옴표 escape leteral 상관없이 사용가능하다 
					//버전이 낮으면 안될수도 있음
		System.out.println(s6);
		
	}
}
