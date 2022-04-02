package homeWork.no7;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		//数据
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String Demo1 = sc.nextLine();
		System.out.print("请输入要查找的字符串：");
		String target = sc.nextLine();
		String Demo=Demo1;
		//逻辑
		int num=0;
		while (true) {
			if(Demo.contains(target)){
				Demo=Demo.substring(Demo.indexOf(target)+1);
				num++;
			}else{
				break;
			}
		}
		//输出结果
		System.out.println("\""+Demo1+"\"中包含"+num+"个\""+target+"\"");

	}
}
