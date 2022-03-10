import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		//1:获取用户考试成绩
		Scanner input = new Scanner(System.in);
		System.out.print("请输入考试成绩：");
		int num = input.nextInt();
		/*
		* 2:当成绩大于等于80分时成绩评测为“良好”，
		* 当成绩小于80分但是大于等于60分时成绩评测为“中等”，
		* 否则成绩评测为“差”。
		* */
		if (num>80){
			System.out.println("良好");
		}else if(num>60){
			System.out.println("中等");
		}else {
			System.out.println("差");
		}
	}
}
