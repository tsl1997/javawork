import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		//1:获取用户输入java成绩
		Scanner input = new Scanner(System.in);
		System.out.print("输入张三的java成绩：");
		int javaNum = input.nextInt();
		//2:分析是否大于90，给予奖惩
		if (javaNum>90){
			System.out.println("老师说：不错，奖励一个iPhone5 !");
		}else{
			System.out.println("老师说：惩罚蹲马步5分钟！");
		}
	}
}
