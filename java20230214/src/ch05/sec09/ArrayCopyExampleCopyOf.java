package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExampleCopyOf {
	//copyOf로 작성해 보아라!
	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldStrArray = {"java","array","copy"};
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5]; 
//위의 생성항목을 바로 String[] newStrArray = Arrays.copyOF(oldStrArray,5);로도 가능 그럼 
//아래 배열 항목복사를 따로 작성할 필요 없음		
		//배열 항목 복사
		newStrArray = Arrays.copyOf(oldStrArray, 5);
		
		//배열 항목 출력\
		System.out.println(Arrays.toString(oldStrArray));
		System.out.println(Arrays.toString(newStrArray));
		
	}
}
