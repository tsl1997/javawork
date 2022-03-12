import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		//正确使用数组和循环存储控制台输入的5位学员成绩，计算平均分并输出，
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		int[] score=new int[5];//定义成绩变量数组
		double sum =0;//定义求和变量

		//输入数据，并求和
		for (int i=0;i<5;i++){
			score[i] = input.nextInt();
			sum+=score[i];
		}

		//输出成绩平均分
		System.out.println("学员的平均分是："+sum/5);
	}
}
