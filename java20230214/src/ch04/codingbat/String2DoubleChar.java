package ch04.codingbat;

public class String2DoubleChar {
	public String doubleChar(String str) {
		  String res = "";
		  
		  for(int i = 0; i <str.length(); i++){
		  res += str.charAt(i); //T
		  res += str.charAt(i);//T
		  }
		  return res;
		}

}
