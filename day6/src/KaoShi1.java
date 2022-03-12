import java.util.Scanner;

public class KaoShi1 {
	public static void main(String[] args) {
		//求水仙花数
		for (int num = 100;num<1000;num++) {
			//2:分别取出个十百位
			int num1 = num % 10;//取个位
			int num2 = num / 10 % 10;//取十位
			int num3 = num / 100;//取百位
			//求是否是水仙花
			boolean isOK = Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3) == num;
			if (isOK){
				System.out.println(num);//打印水仙花
			}
		}
	}
}
