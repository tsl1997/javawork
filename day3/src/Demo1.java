import java.util.Scanner;

public class Demo1 {

	}	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);//定义scanner类，申明变量num
		System.out.print("请输入第一个数据：");
		int num1 = num.nextInt();//获取用户第一个数据，int保存
		System.out.print("请输入第二个数据：");
		int num2 = num.nextInt();//获取用户第二个数据，int保存
		System.out.println("用户输入的两个数据相等吗？"+ (num1==num2));
}
