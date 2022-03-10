import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		//1:获取用户的比赛成绩
		Scanner input = new Scanner(System.in);
		System.out.print("请输入比赛成绩（s）：");
		int num = input.nextInt();
		/*2:当成绩小于等于“10秒”时，选手有资格进入决赛，
		 *对于进入决赛的选手再对性别“男和女”
		 *分别进入“男子组决赛”或“女子组决赛”。
		 */
		if (num>10){
			System.out.println("很抱歉，你没有资格进入决赛！");
		}else{
			System.out.print("请输入性别：");
			String sex = input.next();
			if (sex.equals("男")){
				System.out.println("进入男子决赛组");
			}else if (sex.equals("女")){
				System.out.println("进入女子决赛组");
			}else {
				System.out.println("性别输入错误，请检查！");
			}
		}
	}
}
