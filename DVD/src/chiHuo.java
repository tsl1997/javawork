import java.util.Scanner;

public class chiHuo {
	//定义需要的数组
	static String[] caiPinName = {"红烧肉", "水煮鱼", "豆腐脑", "水白菜", "佛跳墙"};//名称
	static double[] caiPinPrices = {30.0, 50.0, 10.0, 18.88, 99.99};//价格
	static int[] caiPinLike = {21, 15, 5, 1, 33};//点赞数
	static Scanner input = new Scanner(System.in);

	static int[] dingDanId = new int[3];//订单编号
	static int[] dingDanCount = new int[10];//订单份数
	static String[] dingDanName = new String[10];//订单姓名
	static long[] dingDanPhone = new long[10];//订单电话
	static String[] dingDanAddress = new String[10];//订单地址
	static String[] dingDanTimes = new String[10];//订单送餐时间
	static double[] dingDanMoney = new double[10];//订单金额
	static boolean[] dingDanOk = new boolean[10];//订单签收

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
					find();
					break;
				case 3:
					Ok();
					break;
				case 4:
					delete();
					break;
				case 5:
					like();
					break;
				case 6:
					System.out.println("欢迎下次使用！");
					System.exit(0);//结束虚拟机
				default:
					break;
			}
		} while (true);
	}

	public static void menu() {
		//0：打印主菜单
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.print("吃货联盟");
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		String[] start = {"我要订餐", "查看订单", "签收订单", "删除订单", "我要点赞", "退出系统"};
		for (int i = 0; i < start.length; i++) {
			System.out.print((i + 1) + "." + start[i] + "\t");
		}
	}

	public static void dingDan() {
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.print("当前菜品");
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		//打印菜品信息
		System.out.println("\n名称\t\t\t价格\t\t\t点赞数");
		for (int i = 0; i < caiPinName.length; i++) {
			System.out.print((i + 1) + caiPinName[i] + "\t\t");
			System.out.print(caiPinPrices[i] + "\t\t");
			System.out.print(caiPinLike[i] + "\t\t");
			System.out.println();//换行,控制界面
		}
		//1：询问顾客意愿
		int temp = -1;//控制循环输入合法菜品编号
		int caiPinId = -1;//传递菜品信息
		do {
			System.out.print("请问你需要点几号菜品？");
			caiPinId = input.nextInt();
			if (caiPinId < 1 || caiPinId > 5) {
				System.out.println("暂时没有找到你需要的菜品哦！请重新输入！");
				caiPinId = -1;//重置菜品ID
			} else {
				temp = 0;//菜品编号是否合法，合法退出
			}
		} while (temp < 0);
		//遍历是否已经订单满了，如果是，则退出，如果否，继续输入信息
		temp = -1;//重置临时变量，询问是否将已经满了订单
		for (int i = 0; i < dingDanId.length; i++) {
			if (dingDanId[i] == 0) {
				dingDanId[i] = caiPinId;//订单ID显示的是菜品的下标
				temp = i;//重置临时变量
				break;
			}
		}
		if (temp < 0) {
			System.out.println("订单已经满了，请删除后再使用订餐功能！");
			menu();//调回主界面，后面修改为条到删除界面
		}
		//2：询问要点几份菜品
		System.out.print("请问你需要点几份？");
		dingDanCount[temp] = input.nextInt();//temp上次传递了i的值，此处是借用dingDanId的索引
		System.out.print("请问你的姓名是？");
		dingDanName[temp] = input.next();//同上
		System.out.print("请问你的联系方式是？");
		dingDanPhone[temp] = input.nextLong();
		System.out.print("请问你送餐地址？");
		dingDanAddress[temp] = input.next();
		System.out.print("请问你的送餐时间？");
		dingDanTimes[temp] = input.next();
		//3：输出订单
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.print("当前订单是：");
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		//订单金额
		dingDanMoney[temp] = dingDanCount[temp] * caiPinPrices[dingDanId[temp] - 1];
		System.out.println("\n菜品：" + caiPinName[dingDanId[temp] - 1]);
		System.out.println("份数：" + dingDanCount[temp]);
		System.out.println("姓名：" + dingDanName[temp]);
		System.out.println("联系方式：" + dingDanPhone[temp]);
		System.out.println("送餐地址：" + dingDanAddress[temp]);
		System.out.println("送餐时间：" + dingDanTimes[temp]);
		System.out.println("订单金额：" + dingDanMoney[temp]);
		//4:询问是否却订单
		System.out.println("是否确认订单？(输入n取消，其他确认):");
		String isOk = input.next();//确认订单
		if (isOk.equals("n")) {
			//当输入n时，取消订单，并且充值订单信息
			dingDanId[temp] = 0;//重置ID
			dingDanCount[temp] = 0;
			dingDanName[temp] = "";
			dingDanPhone[temp] = 0;
			dingDanAddress[temp] = "";
			dingDanTimes[temp] = "";
			System.out.println("订单已经取消！！！");
			//menu();//注释掉此处跳转
		}
	}


	public static void find() {
		//横幅---分割线
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.print("查看订单");
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		//输出结果
		System.out.println("\n编号\t菜品\t\t\t份数\t姓名\t联系方式\t送餐地址\t送餐时间\t订单金额\t签收状态\t是否点赞");
		for (int i = 0; i < dingDanId.length; i++) {
			if (dingDanId[i] == 0) {
				break;
			}
			System.out.print("\n" + (i + 1) + "\t");//输出编号
			System.out.print(caiPinName[dingDanId[i] - 1] + "\t");//输出菜品
			System.out.print(dingDanCount[i] + "\t");//输出份数
			System.out.print(dingDanName[i] + "\t");//输出姓名
			System.out.print(dingDanPhone[i] + "\t");//输出电话
			System.out.print(dingDanAddress[i] + "\t");//输出送餐地址
			System.out.print(dingDanTimes[i] + "\t");//输出送餐时间
			System.out.print(dingDanMoney[i] + "\t");//输出金额
			System.out.print(dingDanOk[i]?"已签收":"未签收" + "\t");//输出签收状态
			System.out.println();//换行控制
		}
	}

	public static void delete() {
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.print("当前订单");
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		int nums = -1;//传递订单索引数据
		System.out.println("\n编号\t菜品\t\t\t份数\t姓名\t联系方式\t送餐地址\t送餐时间\t订单金额\t签收状态\t是否点赞");
		for (int i = 0; i < dingDanId.length; i++) {
			if (dingDanId[i] == 0) {
				break;
			}
			System.out.print("\n" + (i + 1) + "\t");//输出编号
			System.out.print(caiPinName[dingDanId[i] - 1] + "\t");//输出菜品
			System.out.print(dingDanCount[i] + "\t");//输出份数
			System.out.print(dingDanName[i] + "\t");//输出姓名
			System.out.print(dingDanPhone[i] + "\t");//输出电话
			System.out.print(dingDanAddress[i] + "\t");//输出送餐地址
			System.out.print(dingDanTimes[i] + "\t");//输出送餐时间
			System.out.print(dingDanMoney[i] + "\t");//输出金额
			System.out.print(dingDanOk[i]?"已签收":"未签收" + "\t");//输出签收状态
			System.out.println();//换行控制
			nums++;
		}
		//删除提示
		int num=-1;
		do {
			System.out.print("请输入你需要删除的订单编号：");
			num = input.nextInt();
			if (num < 1 || num > dingDanId.length) {
				System.out.println("找不到该订单，请重新输入！");
			} else {
				break;
			}
		}while (true);

		if (dingDanOk[num-1]==false){
			System.out.println("该订单未签收，请先签收后再来删除！");
		}else {
			for (int i=num-1;i<dingDanId.length-1;i++){
				dingDanId[i] = dingDanId[i+1];//订单编号
				dingDanCount[i] = dingDanCount[i+1];//订单份数
				dingDanName[i] = dingDanName[i+1];//订单姓名
				dingDanPhone[i] = dingDanPhone[i+1];//订单电话
				dingDanAddress[i] = dingDanAddress[i+1];//订单地址
				dingDanTimes[i] = dingDanTimes[i+1];//订单送餐时间
				dingDanMoney[i] = dingDanMoney[i+1];//订单金额
				dingDanOk[i] = dingDanOk[i+1];//订单签收
			}
			//重置末尾订单重复的问题
			dingDanId[dingDanId.length-1] = 0;//订单编号
			dingDanCount[dingDanId.length-1] = 0;//订单份数
			dingDanName[dingDanId.length-1] = "";//订单姓名
			dingDanPhone[dingDanId.length-1] = 0;//订单电话
			dingDanAddress[dingDanId.length-1] = "";//订单地址
			dingDanTimes[dingDanId.length-1] = "";//订单送餐时间
			dingDanMoney[dingDanId.length-1] = 0.0;//订单金额
			dingDanOk[dingDanId.length-1] = false;//订单签收
			System.out.println("删除成功！");
		}

	}

	public static void Ok() {
		//横幅---分割线
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.print("签收订单");
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		//输出结果
		System.out.println("\n编号\t菜品\t\t\t份数\t姓名\t联系方式\t送餐地址\t送餐时间\t订单金额\t签收状态\t是否点赞");
		for (int i = 0; i < dingDanId.length; i++) {
			if (dingDanId[i] == 0) {
				break;
			}
			System.out.print("\n" + (i + 1) + "\t");//输出编号
			System.out.print(caiPinName[dingDanId[i] - 1] + "\t");//输出菜品
			System.out.print(dingDanCount[i] + "\t");//输出份数
			System.out.print(dingDanName[i] + "\t");//输出姓名
			System.out.print(dingDanPhone[i] + "\t");//输出电话
			System.out.print(dingDanAddress[i] + "\t");//输出送餐地址
			System.out.print(dingDanTimes[i] + "\t");//输出送餐时间
			System.out.print(dingDanMoney[i] + "\t");//输出金额
			System.out.print(dingDanOk[i]?"已签收":"未签收" + "\t");//输出签收状态
			System.out.println();//换行控制
		}
		//
		int isOKOne=-1;
		do {
			System.out.println("请输入你要签收的订单编号：");
			isOKOne = input.nextInt();
			if (isOKOne < 1 || isOKOne > dingDanId.length) {
				System.out.println("找不到该订单，请重新输入！");
			}else{
				break;//跳出循环
			}
		}while (true);

		if (dingDanOk[isOKOne-1]==false){
			dingDanOk[isOKOne-1]=true;
			System.out.println("订单签收成功");
		}else{
			System.out.println("签收失败，请重新选择订单！");
		}
	}

	public static void like() {
		//打印菜品信息
		System.out.println("名称\t\t\t价格\t\t\t点赞数");
		for (int i = 0; i < caiPinName.length; i++) {
			System.out.print((i + 1) + caiPinName[i] + "\t\t");
			System.out.print(caiPinPrices[i] + "\t\t");
			System.out.print(caiPinLike[i] + "\t\t");
			System.out.println();//换行,控制界面
		}

		System.out.println("请选择需要点赞的菜品编号：");
		int good = input.nextInt();
		if (good<0||good>caiPinName.length){
			System.out.println("不能评价系统里面没有的菜品哦！");
			menu();
		}
		caiPinLike[good-1]++;//点赞操作
		System.out.println(caiPinName[good-1]+"点赞成功！！！刷新后数据如下：");
		System.out.println("\n名称\t\t\t价格\t\t\t点赞数");
		System.out.print(caiPinName[good-1] + "\t\t");
		System.out.print(caiPinPrices[good-1] + "\t\t");
		System.out.print(caiPinLike[good-1] + "\t\t");
		System.out.println();//换行,控制界面
	}

}