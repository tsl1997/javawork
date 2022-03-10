import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		//1:先定义监听器和两个String变量
		Scanner input = new Scanner(System.in);
		String xuanZhe = "";//定义循环变量
		do {
			System.out.println("上机编写程序！");
			System.out.print("合格了吗？(y/n):");
			xuanZhe = input.next();
		}while (!xuanZhe.equals("y"));//获取变量不是y的结果循环操作
		System.out.println("恭喜你通过了测试！");
	}
}
