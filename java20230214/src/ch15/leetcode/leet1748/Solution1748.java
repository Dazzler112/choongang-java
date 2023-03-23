package ch15.leetcode.leet1748;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> num1 = new HashMap<>();
		
		for(int n : nums) {
			if(num1.containsKey(n)) {
				int getValues = num1.get(n);
				num1.put(n, getValues+1);
			}else {
				num1.put(n, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: num1.entrySet()) {
			int val = entry.getValue();
			if(val % 2 ==1) {
				return true;
			}
		}
		return false;
	}
}
