import java.util.Scanner;

public class HomeWork9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums=new int[]{99,85,82,63,60};//原数组
		int[] num1=new int[nums.length+1];//创建新数组
		//获取用户输入的数据
		System.out.print("请输入你的数据：");
		int score = input.nextInt();
		//获取用户输入的位置
		System.out.print("请输入你的位置：");
		int numNO = input.nextInt();
		//插入数据
		num1[numNO]=score;//插入目标数据
		//填充原来的数据数据
		for (int i=0;i< nums.length;i++){//填数
			if (i<numNO){
				num1[i]=nums[i];//插入前数据不变
			}
			if (i>=numNO){
				num1[i+1]=nums[i];//插入后数据后延
			}
		}
		//输出新数据
		System.out.println("插入后的成绩是：");
		for (int i=0;i< num1.length;i++){
			System.out.print(num1[i]+",");
		}
	}
}
