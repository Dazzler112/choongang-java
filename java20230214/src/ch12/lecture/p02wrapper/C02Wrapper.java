package ch12.lecture.p02wrapper;

public class C02Wrapper {
	public static void main(String[] args) {
		int i1 = 3;
		
		Integer o1 = i1;//현재버전(auto Boxing) //결론 이렇게 쓰면 된다
		Integer o2 = new Integer(i1);//옛날버전(포장,Boxing 했다)
		Integer o3 = Integer.valueOf(i1);//지금버전(권장)(포장,Boxing)//이것도 너무 길다
		
		Number o4 = i1;//auto boxing 과 자동형변환이 한번에 됐다
		Object o5 = i1;//이것도 auto boxing 과 자동형변환이 한번에 됐다
		
		//그다음파일 나머지 파일도 된다는걸 보여주겠다
	}
}
