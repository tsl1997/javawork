package cn.k2052;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class ClassNum1 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个小数：");
		String num1 = sc.next();//获取字符串数据
		System.out.print("请输入第二个小数：");
		String num2 = sc.next();
		double num3=Double.parseDouble(num1);//类型转换
		double num4=Double.parseDouble(num2);//类型转换
		System.out.println(num3/num4);//输出结果*/

		/*String str="我";
		byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
		System.out.println(Arrays.toString(bytes));*/

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一段字符串：");
		String str = sc.nextLine();
		char[] chars = str.toCharArray();
		int dnum=0;//大写字母
		int xnum=0;//小写字母
		int num=0;//数字
		int other=0;//其他
		for (int i=0;i<chars.length;i++){
			if (chars[i]>='A' && chars[i]<='Z'){
				dnum++;
			}else if(chars[i]>='a' && chars[i]<='z'){
				xnum++;
			}else if (chars[i]>='0' && chars[i]<='9'){
				num++;
			}else{
				other++;
			}
		}
		System.out.println("该字符串：\n"+
				"大写字母有："+dnum+
				"\n小写字母有："+xnum+
				"\n数字有："+num+
				"\n其他有："+other);

	}

}
