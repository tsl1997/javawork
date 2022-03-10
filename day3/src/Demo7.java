import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		Scanner wages = new Scanner(System.in);
		System.out.print("请输入基本工资:");
		int basicWages = wages.nextInt();//获取基本工资
		double wuJia = basicWages*0.4;//物价补贴40%
		double fangZu = basicWages*0.25;//房租补贴25%
		double shiJi = basicWages + wuJia + fangZu;//实际薪水
		System.out.println("该员工的工资细目为：");
		System.out.println("基本工资为："+basicWages);
		System.out.println("物价津贴为："+wuJia);
		System.out.println("房租补贴为："+fangZu);
		System.out.println("员工实际薪水为："+shiJi);
	}
}
