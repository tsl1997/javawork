package classJob;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> str = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		str.add("第一是幸福");
		str.add("第二是努力");
		str.add("第三是幸运");
		str.add("第四是平安");
		str.add("第五是财富");
		while (true) {
			System.out.println("请输入最新浏览记录：");
			String s = sc.nextLine();
			if (str.size() >= 5) {
				str.removeLast();
			}
			str.addFirst(s);
			for (String d : str) {
				System.out.println(d);
			}
		}
	}
}
