import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		/*
		* （1）循环输出数组的值；
		（2）求数组中所有数值的和；
		（3）猜数游戏开始：从键盘中任意输入一个数据，判断数组中是否包含此数，输出效果如下图所示；*/
		Scanner input = new Scanner(System.in);
		//1:定义一个数组，直接赋值
		int[] nums={12,45,360,520,666,88};
		//2:遍历数组中的所有值，for循环，另外加上sum求和
		int sum=0;
		for (int i=0;i< nums.length;i++){
			System.out.println(nums[i]);
			sum+=nums[i];
		}
		//3:输出元素之和sum
		System.out.println("数组元素之和为："+sum);
		//4:获取用户输入数字
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		//5:判断该数是否在数组内，for循环，在则输出结果，不在则sorry
		int isnums=-1;//判断回复
		//5-1：寻找数组内是否包含num
		for (int i=0;i< nums.length;i++){
			if (num==nums[i]){
				isnums=i;//标记索引位置
				break;//找到后跳出循环，防止资源浪费
			}
		}
		//5-2：输出提示信息
		if (isnums<0){
			System.out.println("Sorry!");
		}else {
			System.out.println("数组中包含该数，索引为："+isnums);
		}
	}
}
