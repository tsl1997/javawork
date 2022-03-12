import java.util.Scanner;
//从键盘上输入10个整数，合法值为1、2或3，不是这三个数则为非法数字。试编程统计每个整数和非法数字的个数。
public class HomeWork7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums=new int[10];//定义数组
		//1:用户输入数据
		System.out.println("请输入10个整数：");
		for (int i=0;i<10;i++){
			nums[i] = input.nextInt();
		}
		//2:判断合法类似的数据个数
		int numOne=0;//定义合法值1
		int numTwo=0;//定义合法值2
		int numThree=0;//定义合法值3
		int numNO=0;//定义非法数据
		//用循环判断个数
		for (int i=0;i<10;i++){
			if (nums[i]==1){
				numOne++;//当数据是1时，合法值自增
				continue;//跳过本次，执行下一次
			}
			if (nums[i]==2){
				numTwo++;//当数据是2时，合法值自增
				continue;//跳过本次，执行下一次
			}
			if (nums[i]==3){
				numThree++;//当数据是3时，合法值自增
				continue;//跳过本次，执行下一次
			}
			numNO++;
		}
		//3:输出结果
		System.out.println("数字1的个数："+numOne);
		System.out.println("数字2的个数："+numTwo);
		System.out.println("数字3的个数："+numThree);
		System.out.println("非法数字的个数："+numNO);
	}
}
