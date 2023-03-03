package ch05.programmers;

public class Solution120849for {
	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        for(int i =0; i < my_string.length(); i++){
	char c = my_string.charAt(i);
	            switch(c) {
	                    case 'a','e','i','o','u' ->{
	                        
	                    }
	                    
	                    default ->{
	                        answer += c;
	                        }
	            }
	            }
	        return answer;
	    }
	}
}
