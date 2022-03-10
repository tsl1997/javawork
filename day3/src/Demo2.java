import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner num =new Scanner(System.in);
		System.out.print("请输入第一个数据：");
		int num1 = num.nextInt();//获取用户第一个数据，int保存
		System.out.print("请输入第二个数据：");
		int num2 = num.nextInt();//获取用户第二个数据，int保存
		int num3 = num1>num2?num1:num2;//获取最大值，并赋值给num3
		System.out.println("num1和num2中最大的值是："+num3);
	}
}
