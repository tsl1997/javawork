import java.util.Scanner;

public class Exercise6_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1；获取学生姓名，定义变量
		System.out.println("请输入学生姓名：");
		String name = input.next();
		int count = 0;//定义循环变量
		double sun = 0;//定义求和变量
		int score = 0;//定义成绩变量
		String choose = "yes";//定义是否输入变量
		//2：逻辑，循环
		while (count<5 && sun<=700 && choose.equals("yes")){
			System.out.print("第"+(count+1)+"门功课的成绩：");
			score = input.nextInt();//获取用户输入成绩
			sun+=score;//成绩求和
			count++;//循环变量自增
			System.out.print("请问是否要继续输入(yes继续，其他键退出)：");
			choose = input.next();
		}
		System.out.println(name+count+"门课的平均成绩是:"+sun/count);
	}
}
