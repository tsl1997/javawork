import java.util.Scanner;

public class ExtendExercise3 {
	public static void main(String[] args) {
		//1：获取三个用户输入的数字
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a的整数值：");
		int a = input.nextInt();
		System.out.print("请输入b的整数值：");
		int b = input.nextInt();
		System.out.print("请输入c的整数值：");
		int c = input.nextInt();
		//2:比较3个数值的大小
		//System.out.println("a="+a+" b="+b+" c="+c);
		if (a<=b){
			if (b<c){
				System.out.println("排序完成：a="+a+" b="+b+" c="+c);
			}else if (a<c){
				int num1=c;
				c=b;
				b=num1;
				System.out.println("排序完成：a="+a+" b="+b+" c="+c);
			}else{
				int num2=c;
				c=b;
				b=a;
				a=num2;
				System.out.println("排序完成：a="+a+" b="+b+" c="+c);
			}
		}else if (b>c){
			int num3=a;
			a=c;
			c=num3;
			System.out.println("排序完成：a="+a+" b="+b+" c="+c);
		}else if (a>c){
			int num4=a;
			a=b;
			b=c;
			c=num4;
			System.out.println("排序完成：a="+a+" b="+b+" c="+c);
		}else{
			int num5=b;
			b=a;
			a=num5;
			System.out.println("排序完成：a="+a+" b="+b+" c="+c);
		}
	}
}
