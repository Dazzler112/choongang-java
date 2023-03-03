package ch05.exercise;

public class Example08 {
	//주어진 배열 항목의 전체 합과 평균을 구해 출력하는
	//코드를 작성해 보세요 (중첩 for문 이용)
	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,82,93,87,88}
		};
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < array.length; i++) {
			//System.out.println(array[i].length);
			cnt += array[i].length;
			for(int j = 0; j < array[i].length; j++) {
				//System.out.println(array[i][j]);
				sum += array[i][j];
			}
		}
		System.out.println(sum);
		System.out.println(sum/cnt);
		}
	}
