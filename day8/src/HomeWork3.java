import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		int[] scores=new int[]{12,45,25,89,62};
		Scanner input = new Scanner(System.in);
		//1:获取数据
		System.out.println("请输入5名同学的成绩：");
		for (int i=0;i< scores.length;i++){
			scores[i] = input.nextInt();
		}
		//2：顺序
		Arrays.sort(scores);
		System.out.print("学生成绩按照升序排列：");
		for (int a:scores){
			System.out.print(a+"\t");
		}
		//3：降序
		for (int i=scores.length-1;i>0;i--){
			for (int j=scores.length-1;j>0;j--){
				if (scores[j]>scores[j-1]){
					int temp=scores[j];
					scores[j]=scores[j-1];
					scores[j-1]=temp;
				}
			}
		}
		System.out.print("\n学生成绩按照降序排列：");
		for (int a:scores){
			System.out.print(a+"\t");
		}
	}
}
