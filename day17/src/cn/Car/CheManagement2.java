package cn.Car;

import java.util.Scanner;

/**这是第二个测试，一次性租用多量汽车*/
public class CheManagement2 {
	public static void main(String[] args) {
		Che[] cheX = new Che[10];//保存车的对象数组
		CheServer cheServer = new CheServer();
		cheServer.init();
		Scanner input = new Scanner(System.in);//监听器
		System.out.print("*******");
		System.out.print("欢迎光临汽车租赁系统");
		System.out.print("*******");
		do {
			System.out.println("\n1.轿车  2.客车");
			System.out.print("请选择你要租赁的汽车品牌：");
			int cheID = input.nextInt();//获取汽车品牌ID
			String brand = null;//获取品牌
			String type = null;//获取型号
			int seatNum = 0;//获取座位数
			int brandID = 0;//获取品牌ID
			switch (cheID) {
				case 1:
					System.out.print("请选择你要租聘的汽车品牌：1.宝马  2.别克");
					brandID = input.nextInt();
					if (brandID == 1) {
						System.out.print("请选择你要租赁的汽车类型：1.X6   2.550i");
						int typeID = input.nextInt();
						brand = "宝马";
						type = typeID == 1 ? "X6" : "550i";
					} else if (brandID == 2) {
						System.out.print("请选择你要租赁的汽车类型：1.林荫大道   2.GL8");
						int typeID = input.nextInt();
						brand = "别克";
						type = typeID == 1 ? "林荫大道" : "GL8";
					} else {
						System.out.print("暂未提供该品牌的车辆");
					}
					break;
				case 2:
					System.out.print("请选择你要租聘的汽车品牌：1.金龙  2.金杯");
					brandID = input.nextInt();
					if (brandID == 1) {
						brand = "金龙";
					} else if (brandID == 2) {
						brand = "金杯";
					} else {
						System.out.print("暂未提供该品牌");
					}
					System.out.print("请选择你要租赁的汽车座位数：1.16座   2.34座");
					int SeatNumID = input.nextInt();
					seatNum = SeatNumID == 1 ? 16 : 34;
					break;
				case 3:
					break;
				default:
					System.out.print("暂未提供该品牌！");
					break;
			}
			//3：找车
			Che che = cheServer.findCheX(brand, type, seatNum);//返回对象，X是增强版
			//4:租聘天数
			System.out.print("请输入你要租赁的天数：");
			che.setDays(input.nextInt());//获取天数，并赋值
			//5：打印结果
			System.out.println("分配给你的汽车牌号是：" + che.getCarNo());
			for (int i = 0; i < cheX.length; i++){
				if (cheX[i]==null){
					cheX[i] = che;//将对象che给具体的数组cheX[i]
					break;
				}
			}
			System.out.println("是否继续添加车辆？(y继续，其他退出结算）");
			String temp = input.next();
			if (!temp.equalsIgnoreCase("y")){//当不是y时退出添加
				break;
			}
		}while(cheX[cheX.length-1]==null);//当最后一辆车存在时停止循环
		double sumMoney=0;//定义租金求和
		System.out.println("当前购物车：\n车牌\t\t\t租赁天数\t租赁费用\t\t打折情况");
		for (int i = 0; i < cheX.length; i++){
			if (cheX[i]==null){
				break;//当没有车后停止循环
			}
			sumMoney+=cheX[i].giveMoney();//租金求和
			System.out.println(cheX[i].getCarNo()+"\t"+cheX[i].getDays()+"天"+
					"\t"+cheX[i].giveMoney()+"元"+ "\t"+cheX[i].getDiscount());
			//打印车牌信息，最后输出
		}
		System.out.println("你需要支付的租赁费用一共是："+sumMoney+"元");//租金求和费用输出
	}
}
