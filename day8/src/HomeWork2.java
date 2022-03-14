import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1:获取成绩
		System.out.println("请输入5名同学的成绩：");
		int[] score=new int[5];
		for (int i=0;i< score.length;i++){
			score[i] = input.nextInt();
		}
		//2:交换数据
		for (int i=score.length-1;i>0;i--){
			for (int j=score.length-1;j>0;j--){
				if (score[j]>score[j-1]){
					int temp=score[j];
					score[j]=score[j-1];
					score[j-1]=temp;
				}
			}
		}
		//3:输出结果
		System.out.println("学生成绩降序排列：");
		for (int a:score){
			System.out.print(a+"\t");
		}
	}
}
