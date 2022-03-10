import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		//1：获取用户成绩
		Scanner input = new Scanner(System.in);
		System.out.print("输入张三的java成绩：");
		int num = input.nextInt();
		//2:分析判断成绩是否大于90
		if (num>90){
			System.out.println("老师说：不错，奖励一个Iphone5！");
		}else{
			System.out.println("老师说：太差，回去多练习作业吧！");
		}
	}
}
