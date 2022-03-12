import java.util.Scanner;
//使用数组和循环获取5位学员的成绩，使用int max;变量存储最大值。
public class HomeWork4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] score=new int[5];
		//1：获取用户输入数据
		System.out.println("请输入5位学员的成绩：");
		for (int i=0;i<5;i++){
			score[i]=input.nextInt();
		}
		//2:处理数据，求最大值
		int max=score[0];//假设第一个就是最大值
		for (int i=1;i<5;i++){
			if (score[i]>max){
				max=score[i];//最大值始终赋值给max
			}
		}
		//3:输出结果
		System.out.println("考试成绩最高分为："+max);
	}
}
