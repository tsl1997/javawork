import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		/*day06课后必做作业，第一题：
		循环录入某学生5门课的成绩并计算平均分，
		如果某分数录入为负，使用break语句停止录入，并提示录入错误，实现效果如下图所示。
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生姓名：");
		String name = input.next();
		int score = 0;//定义成绩变量
		double sun = 0;//定义求和变量
		int i = 1;//定义循环变量

		for (;i<=5;i++){
			System.out.print("请输入第"+i+"门课的成绩：");
			score = input.nextInt();
			if (score<0){
				System.out.println("抱歉，分数录入错误，请重新进行录入!");
				break;//当分数不合法时结束循环
			}
			sun+=score;
			if(i==5){//在第五次输出下面的内容，没到则不输出
				System.out.println(name+"的5门成绩的平均分为："+sun/5);
			}
		}
	}
}
