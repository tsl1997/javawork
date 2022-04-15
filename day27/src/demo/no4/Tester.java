package demo.no4;

import java.util.Scanner;

public class Tester {
	/*"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
	比如：153是一个"水仙花数"，因为153=1的三次方加上5的三次方加上3的三次方。*/
	public static Boolean daffodils(int num){
		if(num<100 || num>999){
			return false;//当输入的数字错误的时候直接就不是水仙花数
		}
		int num1=num/100;//取百位
		int num2=num/10%10;//取10位、
		int num3=num%10;//取个位
		if((num3*num3*num3+num2*num2*num2+num1*num1*num1)==num){
			//有这个时间还不如直接写了
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(Tester.daffodils(i)){
			System.out.println("是水仙花数");
		}else{
			System.out.println("不是水仙花数");
		}
	}
}
