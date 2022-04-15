package demo.no3;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = input.nextInt();
		if(Year.isRunYear(year)){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
}
