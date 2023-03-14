package ch12.codingbat.array2;
//Math 배운김에 해보자
public class bigDiff {

	public class bigDiff {

		public int bigDiff(int[] nums) {
			  int max = Integer.MIN_VALUE;
			  int min = Integer.MAX_VALUE;
			  for (int n : nums){
			    min = Math.min(min , n);
			    max = Math.max(max, n);
			  }
			  return max - min;
			}

}
