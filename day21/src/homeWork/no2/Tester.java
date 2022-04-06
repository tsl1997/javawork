package homeWork.no2;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		/*解析：对称字符串-- 字符串的顺序和逆序长得一样的。
举例："abcba"===>逆序"abcba" "abccba"===>"abccba"
"abcab"===>"bacba" 不是对称字符串*/
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String s1 = sc.nextLine();//获取字符串
		StringBuilder sb=new StringBuilder(s1).reverse();//逆序字符串
		if(s1.equals(sb.toString())){
			System.out.println("是对称字符串");
		}else{
			System.out.println("不是对称字符串");
		}
	}
}
