import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		/*day06课后必做作业，第二题：
		正确使用continue语句，实现统计80分以上的学生人数，并按照下图所示输出人数和比例。
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入班级总人数：");
		double num = input.nextDouble();//获取用户输入的人数变量
		int score = 0;//定义成绩变量
		int isOk = 0;//定义合格人数变量
		for (int i=1;i<=num;i++){
			System.out.print("请输入第"+i+"位同学的成绩：");
			score = input.nextInt();//获取用户输入的成绩
			//判断用户输入的成绩，是否达标
			if (score<80){
				continue;//当成绩小于80时，跳出并执行下一次循环
			}
			isOk++;//获取总分超过80的人数
		}
		System.out.println("80分以上的人数是："+isOk);//80份以上的人数
		System.out.println("80分以上的人数占比："+isOk/num*100+"%");//80分人数占比

	}
}
