import java.util.Scanner;

public class Homework7 {
	public static void main(String[] args) {
		/*键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
		例如键盘录入：ABCDEabcd123456!@#$%^
		输出：ABCDEabcd123456!@#$%^中大写字母有:5个,小写字母有:4个,数字字符:6个,其他字符:6个*/
		//1:监听器和定义变量
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的内容：");
		String content = input.next();//获取输入的内容，类型为String

		int min = 0;//定义小写字母变量
		int max = 0;//定义大写字母变量
		int num = 0;//定义数字变量
		int other = 0;//定义其他变量
		int x = 0;

		//2：类型转换，将String转为char数组，将char转换为数值，判断数值是否为固定内容
		char[] contentChar = content.toCharArray();//content转换为char数组

		for (int i = 0;i<contentChar.length;i++){
			x = contentChar[i];//将数值具体元素赋值给int变量x，类型转换char--int
			if (x>=65 && x<=90){
				max++;//如果x在ASCII码表范围内，大写字母+1，以此类推，下同
			}
			else if (x>=97 && x<=122){
				min++;
			}
			else if (x>=48 && x<=57){
				num++;
			}
			else {
				other++;
			}
		}
		//3:输出结果
		System.out.print(content+"中大写字母有:"+max+"个,");
		System.out.print("小写字母有:"+min+"个,");
		System.out.print("数字字符有:"+num+"个,");
		System.out.print("其他字符有:"+other+"个。");
	}
}
