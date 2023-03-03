package ch05.lecture.p03matrix;

public class C01Matrix {
	public static void main(String[] args) {
		

	//2차원 배열(행렬)
	
	int[][] arr = new int[3][]; //길이 앞부분 처음부분에 써줘야함
	System.out.println(arr.length);
	
	arr[0] = new int[] {1,3,5,7};
	arr[1] = new int[] {2,4,8,10};
	arr[2] = new int[] {9,10,11,12};
	
	System.out.println(arr[0][0]);//1행 1열
	System.out.println(arr[1][1]);
	System.out.println(arr[1][2]);//첫째인덱스 세로 두번쨰 가로
	System.out.println(arr[2][3]);
	
	System.out.println("전체탐색 for");
	for (int i =0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.println(arr[i][j]);
		}
	}
	}
}
