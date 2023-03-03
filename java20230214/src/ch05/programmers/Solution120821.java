package ch05.programmers;

public class Solution120821 {
	public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[num_list.length];
        
        for (int i = 0; i < len; i++){
            answer[len -i -1] = num_list[i];
        }
        return answer;
    }
}
//ex 꼭 펜하고 적어서 해볼것
//길이 5
/*
원본   타겟
0	 4
1	 3
2	 2
3	 1
4	 0

length - i - 1
*/