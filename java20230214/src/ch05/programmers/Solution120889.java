package ch05.programmers;

import java.util.Arrays;

public class Solution120889 {

	class Solution {
	    public int solution(int[] sides) {
	        Arrays.sort(sides);
	        return(sides[0] + sides[1] > sides[2]) ? 1 : 2;
	    }
	}
}
