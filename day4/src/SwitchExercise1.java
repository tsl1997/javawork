import java.util.Scanner;

public class SwitchExercise1 {
	public static void main(String[] args) {
		//1:获取用户的编程大赛名次
		Scanner input = new Scanner(System.in);
		System.out.print("请输入编程大赛的名次：");
		int no = input.nextInt();
		/*名次为“1”时的奖励。参观麻省理工大学计算机学院组织1个月夏令营
		当名次为“2”时"奖励hp笔记本一部"，
		名次为“3”时"奖励移动硬盘一部"，
		其他名次没有奖励。*/
		switch (no){
			case 1:
				System.out.println("参观麻省理工大学计算机学院组织1个月夏令营");
				break;
			case 2:
				System.out.println("hp笔记本一部");
				break;
			case 3:
				System.out.println("移动硬盘一部");
				break;
			default:
				System.out.println("没有奖励");
				break;
		}
	}
}
