import java.util.Scanner;

public class ExtendExercise5 {
	public static void main(String[] args) {
		//1:输入整数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		//2:判断是否可以被3或者5整除
		String output = (num%3==0||num%5==0)?"该整数是3或5的倍数":"该整数不能被3或5中的任何一个数整除";
		System.out.println(output);
	}
}
