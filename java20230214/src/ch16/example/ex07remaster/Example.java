package ch16.example.ex07remaster;

public class Example {
	private static int[] scores = {10, 50, 3};

	public static int maxOrMin(Operator operator) {
	int result = scores[0];
	for(int score : scores) {
		result = operator.apply(result, score);
	}
	return result;
}
	public static void main(String[] args) {
		//최대값 얻기
//		int max1 = maxOrMin((x, y) -> Math.max(x, y));
//		System.out.println("최대값: " + max1);
//		int max2 = maxOrMin((x ,y) -> ((x > y)? x : y)); //삼항연산자
//		System.out.println("최대값: " + max2);
		int max3 = maxOrMin((x ,y) -> {
			if (x > y) {
				return x;
			}else {
				return y;
			}
		});
		System.out.println("최대값: " + max3);
		int max4 = maxOrMin(Math::max);//참조메소드
		System.out.println("최대값: " + max4);
		
		
		//최소값 얻기
//		int min1 = maxOrMin((x, y) -> Math.min(x, y));
//		int min2 = maxOrMin((x, y) -> (x > y) ? y : x); 삼항
		int min3 = maxOrMin((x, y) -> {
			if(x > y) {
				return y;
			}else {
				return x;
			}
		});
		System.out.println("최소값: " + min3);
		int min4 = maxOrMin(Math::min); //참조메소드
		System.out.println("최소값: " + min4);
	}
}
