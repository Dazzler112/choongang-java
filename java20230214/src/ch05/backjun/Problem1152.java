package ch05.backjun;

import java.util.Scanner;

public class Problem1152 {
		        public static void main(String[] args){
		    String input = "The Curious Case of Benjamin Button";

		    Scanner sc = new Scanner(System.in);
		    String line = sc.nextLine();    

		    String[] arr = line.split(" ");
		    int answer = 0;

		    for(int i =0; i < arr.length;i++){
		        if(!arr[i].equals("")){
		            answer++;
		            }
		    }

		    System.out.println(answer);
		    }
}
