import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner wendu = new Scanner(System.in);
		System.out.println("请输入当前美国的华氏温度：");
		double hua = wendu.nextDouble();//获取用户输入华氏温度
		double she = 5/9.0*(hua-32);//转化为摄氏温度
		System.out.println("美国当地华氏温度是："+hua+"℉");
		System.out.println("转换后的摄氏温度是："+she+"℃");
	}
}
