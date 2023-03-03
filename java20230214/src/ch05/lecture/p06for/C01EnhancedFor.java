package ch05.lecture.p06for;

public class C01EnhancedFor {
	public static void main(String[] args) {
		int[] arr1 = {5,6,10,9,1,2};
		
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);//코드가 너무길다 간결하게 했으면 좋겠다..
		}
		
		// enhanced for(향상된 for) ,foreach
		for (int n : arr1) {
			System.out.println(n); //index없이 사요가능
		}						//이것만 쓰겠다! 는 불가 index가 필요한 경우 도 있어서..
	}
}
//enhanced for 보고싶으면 example문제로..