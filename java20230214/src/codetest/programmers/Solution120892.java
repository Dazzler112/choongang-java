package codetest.programmers;

public class Solution120892 {
	public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code; i<=answer.length(); i += code) {
        	answer += cipher.charAt(i-1);//0번index부터 시작해야 해서
        }
        return answer;
	}
}