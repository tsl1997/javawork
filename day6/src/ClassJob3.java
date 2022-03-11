import java.util.Scanner;

public class ClassJob3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sun = 0;//定义求和变量
		for (int i = 1;i<=5;i++){
			System.out.print("请输入第"+i+"门课成绩：");//输入成绩
			int num = input.nextInt();
			if(num>120||num<0){//判断成绩是否合肥
				System.out.println("成绩只能在0-120之间，输入数据不合法！");
				i--;//自减，不合法重新输入
				continue;
			}
			sun+=num;//合法数据求和
		}
		System.out.println("平均成绩为："+sun/5);
	}
}
