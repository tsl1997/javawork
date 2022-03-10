import java.util.Scanner;

public class ExerciseOrder {
	public static void main(String[] args) {
		//1:获取用户的姓名
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的姓名：");
		String userName = input.next();
		//2:打印菜品清单
		//序号、名称、单价、点赞
		System.out.println("*******************************");
		System.out.println("序号\t\t\t名称\t\t\t单价\t\t\t点赞");
		System.out.println("1\t\t\t红烧肉\t\t\t25\t\t\t666");//第一份菜品清单
		System.out.println("2\t\t\t麻婆豆腐\t\t\t15\t\t\t888");//第二份菜品清单
		System.out.println("3\t\t\t鱼香肉丝\t\t\t30\t\t\t999");//第三份菜品清单
		System.out.println("*******************************");
		//3：提示用户选择菜品和份数
		System.out.print("请选择你需要的菜品(数字1-3）：");
		int caiPin = input.nextInt();
		System.out.print("请选择你需要的份数(数字）：");
		int fenShu = input.nextInt();
		//4:提示用户选择送餐时间：要求当天10到20点间整点送餐，要求用户输入10~20的整数，输入错误，重复输入。
		System.out.println("请输入你的送餐时间（整数10-20）：");
		int time = input.nextInt();
		//5:判断用户输入的世界是否正确
		if (time>=10&&time<=20){
			System.out.println("你输入的时间正确！");
			//6:请输入送餐地址
			System.out.print("请输入送餐地址：");
			String address = input.next();
			//7:获取当前状态，默认是0
			int moRen=0;
			if (moRen==0){
				System.out.println("当前状态是0（已经预定）");
				//8:计算餐费，当餐费大于50元免运费，否则有6元运费。

			}else{
				System.out.println("当前状态是1（已完成）");
			}
		}else{
			System.out.println("对不起，你输入的送餐时间不在工作范围内，请重新输入！");
		}
	}
}
