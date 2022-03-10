import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统 > 幸运抽奖");
		Scanner id = new Scanner(System.in);
		System.out.print("\n请输入四位会员号：");
		int vip = id.nextInt();//获取会员卡号
		int id2 = (vip/100)%10;//获取百位数字
		int random=(int)(Math.random()*10);
		System.out.println("百位数字："+id2);//查看运算是否正确
		System.out.println("随机数字："+random);//查看生成的随机数
		String give = id2==random?"是幸运客户，奖励MP3一个。":"，谢谢您的支持！";
		System.out.println(vip+"客户"+give);
	}
}
