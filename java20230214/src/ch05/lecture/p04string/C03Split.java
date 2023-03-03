package ch05.lecture.p04string;

public class C03Split {
	public static void main(String[] args) {
		//split
		//특정 문자 패턴으로 문자열을 나우어서 배열로 리턴
		
		String str1 = "hello,java,world,html,css";//문자열을 콤마 기준으로 나누고싶다...
		String[] arr1 = str1.split(",");
		
		System.out.println(arr1.length); 	//5
		System.out.println(arr1[0]);       //hello
		System.out.println(arr1[4]);		//css
		
		String str2 = "spring react vue angular jsp sass";//문자열로 끊고싶다..
		String[] arr2 = str2.split(" ");
		
		System.out.println(arr2.length);                 //6
		System.out.println(arr2[0]);                  //spring
		System.out.println(arr2[arr2.length -1]);     //sass
		
		String str3 = "I'm ironman.";  //이렇게 중구난방인경우 빈문자열을 줘보자
		String[] arr3 = str3.split("");
		System.out.println(arr3.length);                    //12
		System.out.println(arr3[0]);                        //I
		System.out.println(arr3[arr3.length-1]);            //.
	}
}
