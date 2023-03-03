package ch05.lecture.P01Array;

public class C02Array {
	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[3];
				
		double[] arr2;
		arr2 = new double[2];
		
		arr2[0] = 3.14;
		arr2[1] = 99.9;
		
		char[] arr3;
		arr3 = new char[3];
		arr3[0] = '가';
		arr3[1] = 'a';
		arr3[2] = '나';
		
		int[] arr4 = new int[5]; //한번에 선언하는법
		arr4[0] = 100;
		arr4[1] = 200;
		arr4[2] = 300;
		
		//참조타입으로도 가능
		String[] arr5 = new String[2];
		arr5[0] = "hello";
		arr5[1] = "java";
		
		//배열을 원소로 갖는 것도 만들수 있음
		int[][] arr6 = new int[3][4];
	}
}
