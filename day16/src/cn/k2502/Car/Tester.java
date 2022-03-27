package cn.k2502.Car;

import java.util.Scanner;

/**这是一个测试类*/
public class Tester {
	/**打印方法*/
	public static void daYing(){
		for (int i = 0; i <15;i++) {
			System.out.print("*");
		}
	}
	/**程序错误*/
	public static void bug(){
		System.out.println("输入错误，程序结束！");
	}
	/**主入口*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//设置监听器
		//打印进入页面
		daYing();//打印星星
		System.out.print("欢迎光临腾飞汽车租聘公司");
		daYing();
		System.out.println("\n1、轿车\t 2、客车");
		System.out.print("请选择你要租聘的汽车类型(1或者2)：");
		int type = input.nextInt();//获取汽车类型1轿车2客车
		if (type == 1) {
			System.out.print("请选择你要租聘的汽车品牌：1、宝马\t2、别克");
			int brand = input.nextInt();//获取汽车品牌
			if (brand==1){
				System.out.print("请选择你要租聘的汽车型号：1、X6\t2、550i ：");
				int t = input.nextInt();//获取汽车型号
				if (t == 1) {
					System.out.print("请输入你要租聘的天数：");
					int days = input.nextInt();//获取租聘天数
					Car1 car1 = new Car1();//创建对象
					System.out.println("分配给你的汽车牌号是："+ car1.carNumber);//获取汽车牌号属性
					double money=car1.calRent(days, car1.money);//调试时使用，查看金额计算是否正确
					System.out.println("你需要支付的租聘费用是："+money);//获取租金
				}else if(t==2){
					System.out.print("请输入你要租聘的天数：");
					int days = input.nextInt();//获取租聘天数
					Car car2 = new Car2();//创建对象
					System.out.println("分配给你的汽车牌号是："+((Car2)car2).carNumber);//获取汽车牌号属性
					double money=car2.calRent(days,((Car2)car2).money);//调试时使用，查看金额计算是否正确
					System.out.println("你需要支付的租聘费用是："+money);//获取租金
				}else {
					bug();
				}
			}else if (brand==2){
				System.out.print("请选择你要租聘的汽车型号：1、林荫大道\t2、GL8 ：");
				int t = input.nextInt();//获取汽车型号
				if (t == 1) {
					System.out.print("请输入你要租聘的天数：");
					int days = input.nextInt();//获取租聘天数
					Car car3 = new Car3();//创建对象
					System.out.println("分配给你的汽车牌号是："+((Car3)car3).carNumber);//获取汽车牌号属性
					double money=car3.calRent(days,((Car3)car3).money);//调试时使用，查看金额计算是否正确
					System.out.println("你需要支付的租聘费用是："+money);//获取租金
				}else if(t==2){
					System.out.print("请输入你要租聘的天数：");
					int days = input.nextInt();//获取租聘天数
					Car car4 = new Car4();//创建对象
					System.out.println("分配给你的汽车牌号是："+((Car4)car4).carNumber);//获取汽车牌号属性
					double money=car4.calRent(days,((Car4)car4).money);//调试时使用，查看金额计算是否正确
					System.out.println("你需要支付的租聘费用是："+money);//获取租金
				}else {
					bug();
				}
			}else{
				bug();
			}

		}else if(type==2){
			System.out.print("请选择你要租聘的汽车品牌：1、金杯\t2、金龙");
			int brand = input.nextInt();//获取汽车品牌
			if (brand==1){
				System.out.print("请选择你要租聘的汽车座位数：1、16座\t2、34座 ：");
				int t = input.nextInt();//获取汽车型号
				if (t == 1) {
					System.out.print("请输入你要租聘的天数：");
					int days = input.nextInt();//获取租聘天数
					Car car5 = new Car5();//创建对象
					System.out.println("分配给你的汽车牌号是："+((Car5)car5).carNumber);//获取汽车牌号属性
					double money=car5.calRent(days,((Car5)car5).money);//调试时使用，查看金额计算是否正确
					System.out.println("你需要支付的租聘费用是："+money);//获取租金
				}else if(t==2){
					System.out.print("请输入你要租聘的天数：");
					int days = input.nextInt();//获取租聘天数
					Car car7 = new Car7();//创建对象
					System.out.println("分配给你的汽车牌号是："+((Car7)car7).carNumber);//获取汽车牌号属性
					double money=car7.calRent(days,((Car7)car7).money);//调试时使用，查看金额计算是否正确
					System.out.println("你需要支付的租聘费用是："+money);//获取租金
				}else {
					bug();
				}
			}else if (brand==2){
				System.out.print("请选择你要租聘的汽车座位数：1、16座\t2、34座 ：");
				int t = input.nextInt();//获取汽车型号
				if (t == 1) {
					System.out.print("请输入你要租聘的天数：");
					int days = input.nextInt();//获取租聘天数
					Car car6 = new Car6();//创建对象
					System.out.println("分配给你的汽车牌号是："+((Car6)car6).carNumber);//获取汽车牌号属性
					double money=car6.calRent(days,((Car6)car6).money);//调试时使用，查看金额计算是否正确
					System.out.println("你需要支付的租聘费用是："+money);//获取租金
				}else if(t==2){
					System.out.print("请输入你要租聘的天数：");
					int days = input.nextInt();//获取租聘天数
					Car car8 = new Car8();//创建对象
					System.out.println("分配给你的汽车牌号是："+((Car8)car8).carNumber);//获取汽车牌号属性
					double money=car8.calRent(days,((Car8)car8).money);//调试时使用，查看金额计算是否正确
					System.out.println("你需要支付的租聘费用是："+money);//获取租金
				}else {
					bug();
				}
			}else{
				bug();
			}
		}else {
			bug();
		}
	}
}
