package ch05.exercise;

public class Example07 {
	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int len = array.length;
		int answer = Integer.MIN_VALUE;//-가 나올경우 포함
		for(int i = 0; i <len; i++) {
			
			//내가 알고 있는 수보다 크면??
			if(answer < array[i]) {
				answer = array[i];
			}
			//그렇지 않으면?
		}
		System.out.println(answer);
	}
}
