import java.util.Scanner;

public class ClassJob1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 1000;//定义用户卡内余额
		int money;//定义取款金额
		do {
			System.out.print("请输入取款金额？：");
			money = input.nextInt();
			if (money%100!=0){
				System.out.println("请输入整百金额！");
			}
			else if (money>num){//分开提示：增加用户输入时间，降低用户取款速度，避免银行挤兑风险
				System.out.println("余额不足！当前余额为："+num);//提示用户账号余额
			}
		}while (money%100!=0 || money>num);
		System.out.println("取款成功！");
		System.out.println("取款金额为："+money);
		System.out.println("卡内金额为："+(num-money));
	}
}
