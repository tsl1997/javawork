import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		//1：获取用户的音乐和java数据
		Scanner input = new Scanner(System.in);
		System.out.print("请输入张三的java成绩：");
		int javaNum = input.nextInt();
		System.out.print("请输入张三的音乐成绩：");
		int musicNum = input.nextInt();
		//2:分析数据当Java成绩大于90分且音乐成绩大于80分，或者Java成绩等于100分且音乐成绩大于70分时，给予奖励
		if ((javaNum>90&&musicNum>80)||(javaNum==100&&musicNum>70)){
			System.out.println("老师说:不错，奖励一个iPhone5 !");
		}else{
			System.out.println("很抱歉，成绩不达标哦！");
		}
	}
}
