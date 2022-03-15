import java.util.Scanner;

public class chiHuo {
	//定义需要的数组
	static String[] caiPinName={"红烧肉","水煮鱼","豆腐脑","水白菜","佛跳墙"};//名称
	static double[] caiPinPrices={30.0,50.0,10.0,18.88,99.99};//价格
	static int[] caiPinLike={21,15,5,1,33};//点赞数
	static Scanner input = new Scanner(System.in);

	static int[] dingDanId=new int[10];//订单编号
	static int[] dingDanCount=new int[10];//订单份数
	static String[] dingDanName=new String[10];//订单姓名
	static long[] dingDanPhone=new long[10];//订单电话
	static String[]	dingDanAddress=new String[10];//订单地址
	static String[]	dingDanTimes=new String[10];//订单送餐时间

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		do {
			menu();
			System.out.print("\n请输入你要使用的菜单功能：");//输入菜单功能
			int menuId = input.nextInt();
			switch (menuId) {
				case 1:
					dingDan();
					break;
				case 2:
					System.out.println("这是菜单2");
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.println("欢迎下次使用！");
					System.exit(0);//结束虚拟机
				default:
					break;
			}
		}while (true);
	}

	public static void menu() {
		//0：打印主菜单
		for (int i=0;i<40;i++){
			System.out.print("-");
		}
		System.out.print("吃货联盟");
		for (int i=0;i<40;i++){
			System.out.print("-");
		}
		System.out.println();
		String[] start={"我要订餐","查看订单","签收订单","删除订单","我要点赞","退出系统"};
		for (int i=0;i< start.length;i++){
			System.out.print((i+1)+"."+start[i]+"\t");
		}
	}

	public static void dingDan() {
		for (int i=0;i<40;i++){
			System.out.print("-");
		}
		System.out.print("当前菜品");
		for (int i=0;i<40;i++){
			System.out.print("-");
		}
		//打印菜品信息
		System.out.println("\n名称\t\t\t价格\t\t\t点赞数");
		for (int i=0;i< caiPinName.length;i++){
			System.out.print((i+1)+caiPinName[i]+"\t\t");
			System.out.print(caiPinPrices[i]+"\t\t");
			System.out.print(caiPinLike[i]+"\t\t");
			System.out.println();//换行,控制界面
		}
		//1：询问顾客意愿
		int temp=-1;//控制循环输入合法菜品编号
		int caiPinId=-1;//传递菜品信息
		do {
			System.out.print("请问你需要点几号菜品？");
			caiPinId = input.nextInt();
			if (caiPinId < 0 || caiPinId > 5) {
				System.out.println("暂时没有找到你需要的菜品哦！请重新输入！");
				caiPinId=-1;//重置菜品ID
			} else {
				temp = 0;//菜品编号是否合法，合法退出
			}
		}while (temp<0);
		//遍历是否已经订单满了，如果是，则退出，如果否，继续输入信息
		temp=-1;//重置临时变量，询问是否将已经满了订单
		for (int i=0;i<dingDanId.length;i++){
			if (dingDanId[i]==0){
				dingDanId[i]=caiPinId-1;//订单ID显示的是菜品的下标
				temp=i;//重置临时变量
				break;
			}
		}
		if (temp<0) {
			System.out.println("订单已经满了，请删除后再使用订餐功能！");
			menu();//调回主界面，后面修改为条到删除界面
		}

		//2：询问要点几份菜品
		System.out.print("\n请问你需要点几份？");
		System.out.print("\n请问你的姓名是？");
		System.out.print("\n请问你的联系方式是？");
		System.out.print("\n请问你送餐地址？");
		System.out.print("\n请问你的送餐时间？");



	}
}
