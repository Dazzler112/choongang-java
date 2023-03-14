package ch12.lecture.p02wrapper;

public class C04Boxing {
	public static void main(String[] args) {
		int i1 = 30000;
		int i2 = 30000;
		
		System.out.println(i1 == i2);
		
		Integer o1 = i1;
		Integer o2 = i2;
		
		System.out.println(o1 == o2);//같다고 할수있는가? 같을수도 있고 아닐수도 있다
		//결론은 *이렇게 하지 말아라!!!*
		//false인 이유는 참조값이 달라서
		System.out.println(o1.equals(o2));//참조값 비교(필드비교)는 equals 메소드 사용!
		
		//다음 파일은 Boxing 했으니깨 unboxing도 해야제?
	}
}
