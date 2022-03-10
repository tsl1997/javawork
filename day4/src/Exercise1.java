import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		//1：获取一个数字
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int num = input.nextInt();
		//2：判断数字是否为偶数
		if (num%2==0){//取除以2的余数
			System.out.println(num+"是偶数");
		}else {
			System.out.println(num+"不是偶数");
		}
	}
}
