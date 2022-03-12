import java.util.Scanner;

public class KaoShi3 {
	public static void main(String[] args) {
		/*提示用户输入1-7之间的数字。如果用户输入1-5的数字，使用sout()输出“好好学习，天天向上”，
		如果6-7数字，使用sout()输出“休息一下，放松放松”，输入其他数字，
		使用sout()输出“系统暂时不支持该功能，请升级后再试....”
		* */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入1-7之间的数字：");
		int num = input.nextInt();//获取用户输入的数据
		//2：判断用户的数据是否合理，并且给出对应的回复
		if (num>=1 && num<=5){
			System.out.println("好好学习，天天向上");
		}else if (num>=6 && num<=7){
			System.out.println("休息一下，放松放松!");
		}else {
			System.out.println("系统暂时不支持该功能，请升级后再试....");
		}
	}
}
