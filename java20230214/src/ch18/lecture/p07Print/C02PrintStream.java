package ch18.lecture.p07Print;

import java.io.*;

public class C02PrintStream {
	public static void main(String[] args) {
		String name = "output/print2.txt";
		try(PrintStream pw = new PrintStream(name);)
		{
			pw.println(999999);
			pw.println(9.99999);
			pw.println(false);
			pw.println("hello world");
			pw.println("더 글로리");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//PrintWriter와 별차이가 없다
