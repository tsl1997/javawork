package cn.k2052;

import java.util.Scanner;

public class StringHuiWen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		StringBuilder sb = new StringBuilder(s);
		StringBuilder s1 = sb.reverse();
		if(s.equals(s1.toString())){
			System.out.println("该字符串是回文！");
		}else{
			System.out.println("该字符串不是回文！");
		}


	}
}
