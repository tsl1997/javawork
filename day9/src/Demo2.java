import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		int[][] ages=new int[3][];
		Scanner input = new Scanner(System.in);

		for (int i=0;i< ages.length;i++){
			System.out.println("---------第"+(i+1)+"个班级---------");
			System.out.print("请输入第"+(i+1)+"个班级的总人数：");
			int nums = input.nextInt();
			ages[i]=new int[nums];//获取班级人数
			for (int j=0;j<ages[i].length;j++){
				System.out.print("请输入第"+(j+1)+"个学生的年龄：");
				int age = input.nextInt();
				ages[i][j]=age;//填入年龄
			}
		}
		//输出结果,传递平均分，求和
		for (int i=0;i< ages.length;i++){
			double sum=0;
			for (int j=0;j<ages[i].length;j++){
				sum+=ages[i][j];//求和
				System.out.print(ages[i][j]+"\t");
			}
			System.out.print("第"+(i+1)+"个班平均年龄是："+sum/ages[i].length);
			System.out.println();//换行
		}
	}
}
