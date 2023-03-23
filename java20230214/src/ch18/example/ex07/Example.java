package ch18.example.ex07;

import java.io.*;

public class Example {
	public static void main(String[] args) {
		String filePath = "src/ch18/example/ex07/Example.java";
		
		try(FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);){
		
		int rowNumber = 0;
		String rowData;
		int hour = 0;
		while(true) {
			rowNumber = fr.read();
			rowData = br.readLine();
			int totalMinute = rowNumber + hour;
			System.out.println("총" + totalMinute + "분");
		}
		br.close(); fr.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}
