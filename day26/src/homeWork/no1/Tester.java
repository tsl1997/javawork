package homeWork.no1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Tester {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("src\\homeWork\\no1\\1.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		System.out.println(s);
		br.close();
		fr.close();
	}
}
