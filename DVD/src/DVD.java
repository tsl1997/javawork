import java.util.Scanner;

public class DVD {
	//定义数据类型，初始化变量数组
	public static Scanner input = new Scanner(System.in);
	public static String[] dvdNames = new String[10];//名称，默认“”
	public static boolean[] dvdStatus = new boolean[10];//借出状态，默认false
	public static String[] dvdDate = new String[10];//出借日期，默认null
	public static int[] dvdTimes = new int[10];//出借次数，默认0

	public static void main(String[] args) {
		//初始化默认添加一个DVD
		dvdNames[0] = "一剪梅";
		dvdStatus[0] = true;
		dvdDate[0] = "2022-2-22";
		dvdTimes[0] = 6;

		do {
			startMenu();//加载主界面
			int choose = input.nextInt();
			switch (choose) {
				case 1:
					startAdd();
					break;
				case 2:
					startFind();
					break;
				case 3:
					startDelete();
					break;
				case 4:
					startLend();
					break;
				case 5:

					break;
				case 6:
					System.out.println("感谢您的使用，下次再见！");
					return;
				default:
					System.out.println("输入错误，请重新输入！");
					break;
			}
		} while (true);
	}

	//主界面
	public static void startMenu() {
		System.out.println("欢迎使用迷你 DVD 管理器");
		System.out.println("-----------------------------------");
		//System.out.println("0.DVD排行榜");
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("6.退   出");
		System.out.println("-----------------------------------");
		System.out.print("请选择：");
	}

	//增加
	public static void startAdd() {
		System.out.println("--->新增DVD");
		System.out.println("请输入DVD名称：");
		String name = input.next();
		for (int i = 0; i < dvdNames.length; i++) {
			if (dvdNames[i] == null) {
				dvdNames[i] = name;
				System.out.println("添加《" + name + "》成功！");
				break;
			}
			if (dvdNames[dvdNames.length - 1] != null) {
				System.out.println("DVD货架已满，请删除后再次增加！");
				break;
			}
		}
	}

	//查找
	public static void startFind() {
		System.out.println("--->查看DVD");
		System.out.println("DVD名称\t\t借出状态\t\t借出日期\t\t借出次数");
		for (int i = 0; i < dvdNames.length; i++) {
			if (dvdNames[i] == null) {
				break;
			}
			System.out.println(dvdNames[i] + "\t\t" + dvdStatus[i] + "\t\t" +
					dvdDate[i] + "\t" + dvdTimes[i]);
		}
	}

	//删除
	public static void startDelete() {
		System.out.println("--->删除DVD");
		int temp = 0;
		do {
			System.out.println("请输入需要删除的DVD名称：");
			String name = input.next();
			for (int i = 0; i < dvdNames.length; i++) {
				if (dvdNames[i] == null) {
					System.out.println("很抱歉，无法删除该DVD");
					break;
				}
				if (dvdNames[i].equals(name)) {
					dvdNames[i] = null;//重置为空
					System.out.println("《" + name + "》删除成功！");
					temp = 1;//跳出循环的重置
					break;
				}
			}
		} while (temp == 0);
	}

	//借出
	public static void startLend() {
		System.out.println("--->借出DVD");
		int temp2 = -1;
		do {
			System.out.println("请输入需要借出的DVD名称：");
			String name = input.next();
			//寻找是否存在该名称的DVD，用temp1标记
			int temp1 = -1;
			for (int i = 0; i < dvdNames.length; i++) {
				if (dvdNames[i] == null) {
					System.out.println("找不到该DVD，请重新输入！");
					break;
				}
				if (dvdNames[i].equals(name)) {
					temp1 = i;//判断是否找到了
					break;
				}
			}
			//提示信息，询问需要保存的借出数据
			if (!dvdStatus[temp1]) {
				System.out.println("当前可以借出，请输入借出日期(2022-1-23)：");
				String date = input.next();
				dvdStatus[temp1] = true;
				dvdDate[temp1] = date;
				dvdTimes[temp1]++;
				System.out.print("是否要继续借出其他DVD(y/n)：");
				String isOk = input.next();
				if (!isOk.equalsIgnoreCase("y")) {
					temp2 = 1;//停止本轮循环
				}
			} else {
				System.out.println("该DVD不可借出，请选择其他的产品！");
			}
		} while (temp2 < 0);
	}

	//归还
	public static void startReturn() {
		System.out.println("--->归还DVD");
		System.out.println("请输入需要归还的DVD名称：");
		String name = input.next();
		int temp3 = -1;
		do {
			int temp51 = -1;
			for (int i = 0; i < dvdNames.length; i++) {
				if (dvdNames[i] == null) {
					System.out.println("找不到该DVD，请重新输入！");
					break;
				}
				if (dvdNames[i].equals(name)) {
					temp51 = i;//判断是否找到了
					break;
				}
			}
			if (dvdStatus[temp51]) {
				System.out.println("《" + name + "》归还成功！");
				dvdStatus[temp51] = false;
				System.out.print("是否要继续归还其他DVD(y/n)：");
				String isOk = input.next();
				if (!isOk.equalsIgnoreCase("y")) {
					temp3 = 1;//停止本轮循环
				}
			}
		}while (temp3<0);
	}

}
