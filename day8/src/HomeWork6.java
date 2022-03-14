import java.util.Scanner;

public class HomeWork6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] scores=new int[3][5];
		//1：获取数据
		for (int i=0;i<scores.length;i++){
			System.out.println("***********第"+(i+1)+"个班***********");
			for (int j=0;j<scores[i].length;j++){
				System.out.print("请输入第"+(j+1)+"名学生的成绩：");
				scores[i][j] = input.nextInt();
			}
		}
		//2:逻辑运算
		System.out.println("***********成绩统计***********");
		for (int i=0;i<scores.length;i++){
			System.out.print((i+1)+"班级总成绩：");
			int sum=0;
			for (int j=0;j<scores[i].length;j++){
				sum+=scores[i][j];
			}
			System.out.print(sum+"\n");
		}
	}
}
