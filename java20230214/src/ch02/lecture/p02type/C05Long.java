package ch02.lecture.p02type;

public class C05Long {
public static void main(String[] args) {
	//long
	//(8 bytes, 64bits)
	
	long l1 = 3000000000L; //int의 허용범위를 넘어서면 뒤에 대,소문자 l이나 float의 f 등을 써줘야함
	l1 = 999827341974192L;
	l1 = -999827341974192L;
	
	l1 = 999_8273_4197_4192L; //너무 길어서 좀 읽기 쉽게 하겠다
	l1 = -999_827_341_974_192L; //4자리씩 언더 스코어  미국식 3자리씩 넣어주기
}
}
