package cn.k2503.car;
/**这是汽车服务类*/

import cn.k2502.Car.Car4;

import java.util.Scanner;

/**这是汽车服务类*/
public class CarService {
	/**打印方法*/
	public static void daYing(){
		for (int i = 0; i <15;i++) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) {
	//public void ok(){
		Scanner input = new Scanner(System.in);
		daYing();//打印星星
		System.out.print("欢迎光临腾飞汽车租聘公司");
		daYing();
		System.out.println("\n1、轿车\t 2、客车");
		System.out.print("请选择你要租聘的汽车类型(1或者2)：");
		int t = input.nextInt();//获取汽车类型1轿车2客车
		CarAdmin carAdmin = new CarAdmin();//创建管理对象
		Car[] cars = carAdmin.car();//获取车的数据
		if (t == 1) {
			int temp=-1;//临时变量
			System.out.print("请选择你要租聘的汽车品牌：1、宝马\t2、别克");
			int brand = input.nextInt();//获取汽车品牌
			if (brand==1){
				System.out.print("请选择你要租聘的汽车型号：1、X6\t2、550i ：");
			}else if (brand==2){
				System.out.print("请选择你要租聘的汽车型号：1、林荫大道\t2、GL8 ：");
			}else{
				System.out.println("选择错误！");
				return;
			}
			int type = input.nextInt();//获取汽车型号
			for (int i=0;i<cars.length;i++){
				if (type.equals(((Coach)cars[i]).getType())){
					temp=i;
					break;
				}
			}
			System.out.print("请输入你要租聘的天数：");
			int days = input.nextInt();//获取租聘天数
			System.out.println("分配给你的汽车牌号是："+(cars[temp]).getCarNumber());//获取汽车牌号属性
			double money=cars[temp].calRent(days,cars[temp].getMoney());//调试时使用，查看金额计算是否正确
			System.out.println("你需要支付的租聘费用是："+money);//获取租金

		}else if (t == 2) {

		}else{

		}
	}
}
