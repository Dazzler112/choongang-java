package ch05.programmers;

public class Solution120839 {
	class Solution {
	    public String solution(String rsp) {       char[] ary = rsp.toCharArray();
	        String answer = "";
	                                            for(char a : ary){
	          char w = switch(a){
	                  case '0' -> '5';
	                  case '2' -> '0';
	                  case '5' -> '2';
	                  default -> ' ';
	          };    
	           answer += w;                                }
	        return answer;
	    }
	}
}
