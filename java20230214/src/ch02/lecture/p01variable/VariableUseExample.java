package ch02.lecture.p01variable;

public class VariableUseExample {
	public static void main(String[] args) {
		int myHour = 3;
		int min = 5; // minute 한번에 바꾸고 싶다 ctrl +1 첫번째거 눌러서 한꺼번에 바꾸기
		// 줄맞추기 : ctrl + shift + f
		System.out.println(myHour + "시간 " + min + "분");

		int totalMinute = (myHour * 60) + min;
		System.out.println("총 " + totalMinute + "분");
	}
}
