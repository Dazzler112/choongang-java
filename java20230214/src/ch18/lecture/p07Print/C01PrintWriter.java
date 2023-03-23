package ch18.lecture.p07Print;

import java.io.*;

public class C01PrintWriter {
	public static void main(String[] args) {
		String name = "output/print1.txt";
		
		try(
		PrintWriter pw = new PrintWriter(name);
	){
			pw.println(33333);
			pw.println(3.14);
			pw.println(true);
			pw.println("hello world");
			pw.println("슬램덩크");//한글 스트링 int double 다되네
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//이런것도 있다