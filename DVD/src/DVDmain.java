import java.util.Scanner;

public class DVDmain {
	static Scanner input=new Scanner(System.in);
	static String[] dvdName=new String[6];//名称
	static boolean[] dvdOk=new boolean[6];//状态
	static int[] dvdDay=new int[6];//借出日期
	static int[] dvdNum=new int[6];//借出次数

	public static void main(String[] args) {
		//初始化默认值
		dvdName[0]="一剪梅";
		dvdOk[0]=true;
		dvdDay[0]=30;
		dvdNum[0]=5;
		//进入菜单
		do {
			menu();
			System.out.print("请输入你要选择的功能编号(1-6):");//提示输入选择
			int menuId = input.nextInt();
			switch (menuId) {
				case 1:
					add();
					break;
				case 2:
					find();
					break;
				case 3:
					delete();
					//Ok();
					break;
				case 4:
					lend();
					break;
				case 5:
					go();
					break;
				case 6:
					System.out.println("欢迎下次使用！");
					System.exit(0);//结束虚拟机
				default:
					System.out.println("输入错误，请重新输入！");
					break;
			}
		}while (true);
	}

	public static void menu() {
		//打印界面
		System.out.println("DVD管理系统");
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.println();
		String[] start={"新增DVD", "查看DVD",  "删除DVD", "借出DVD","归还DVD", "退出系统"};
		for (int i = 0; i < start.length; i++) {
			System.out.print((i + 1) + "." + start[i] + "\n");
		}
	}

	public static void add() {
		System.out.println("--->新增DVD");
		//查看DVD货架是否已经装满，如果装满就跳转到主菜单。
		if (dvdName[dvdName.length-1]!=null){
			System.out.println("DVD货架已经装满，请先删除后再进行新增操作！");
		}else {
			System.out.println("请输入DVD名称：");
			String name = input.next();//临时存储变量
			for (int i = 0; i < dvdName.length; i++) {
				if (dvdName[i] == null) {
					dvdName[i] = name;//将新增的DVD名称存储到数组
					System.out.println("添加《" + name + "》成功！");
					break;
				}
			}
		}
	}

	public static void find() {
		System.out.println("--->查看DVD");
		for (int i = 0; i < 20; i++) {
			System.out.print("-");//华丽的分割线
		}
		System.out.println("\nDVD名称\t\tDVD状态\t\t借出日期\t\t借出次数");
		for (int i=0;i< dvdName.length;i++){
			if (dvdName[i]==null){
				break;//名称不存在就停止循环，否则就存在，输出后面程序
			}
			System.out.print(dvdName[i]+"\t\t");//输出DVD名称
			System.out.print((dvdOk[i]?"已借出":"未借出")+"\t\t");//输出借出状态
			System.out.print((dvdOk[i]?dvdDay[i]:"未借出")+"\t\t");//用借出状态来判断借出日期
			System.out.print(dvdNum[i]+"\t\t\n");//输出借出次数(现在未借出不代表以前也未借出，所以不能用借出状态判断）
		}
	}

	public static void delete() {
		System.out.println("--->删除DVD");
		System.out.print("请输入你需要删除的DVD名称：");
		String name = input.next();
		int num=-1;//临时变量，存储需要删除的下标信息
		for (int i=0;i< dvdName.length;i++){
			if (dvdName[i]==null){
				break;//解决空指针异常
			}
			if (!dvdName[i].equals(name)){
				continue;//当输入值和目标值不等时直接跳过本次循环
			}
			if (dvdOk[i]){
				num=-2;
				break;
				//此处欠佳，原因是当DVD被借出时，num为-1，继续输出没有找到，产生歧义
				//解决方式，修改下面的判断条件
			}
			num=i;//需要删除的目标
		}
		//删除操作
		if (num==-2){
				System.out.println("该DVD已经被借出，暂时不能删除！");
		} else if (num==-1){
			System.out.println("没有找到需要删除的DVD，请重新输入！");
		}else{//删除操作
			for (int i=num;i<dvdName.length-1;i++){
				dvdName[i]=dvdName[i+1];//后面往前面一点，覆盖删除的变量
				dvdOk[i]=dvdOk[i+1];
				dvdDay[i]=dvdDay[i+1];
				dvdNum[i]=dvdNum[i+1];
			}
			int last=dvdName.length-1;//临时变量
			dvdName[last]=null;//末尾变量重置为空
			dvdOk[last]=false;
			dvdDay[last]=0;
			dvdNum[last]=0;
			System.out.println(name+"删除成功！");
		}
	}

	public static void lend() {
		System.out.println("--->借出DVD");
		System.out.print("请输入你需要借出的DVD名称：");
		String name = input.next();
		int num=-1;//临时变量，存储需要借出的下标信息
		for (int i=0;i< dvdName.length;i++){
			if (dvdName[i]==null){
				break;//解决空指针异常
			}
			if (!dvdName[i].equals(name)){
				continue;//当输入值和目标值不等时直接跳过本次循环
			}
			if (dvdOk[i]){
				num=-2;
				break;
			}
			num=i;//可以借出的DVD标记，下标
		}
		//借出操作
		if (num==-2){
			System.out.println("该DVD已经被借出，不能重复借出！");
		} else if (num==-1){
			System.out.println("没有找到需要借出的DVD，请重新输入！");
		}else{
			int day ;//临时变量，借出天数
			do {
				System.out.print("请输入需要借出的日期(1-31)：");
				day = input.nextInt();
				if (day < 1 || day > 31) {
					System.out.println("输入的日期数据不合法，请输入1-31之间的整数！");
				}
			}while (day < 1 || day > 31);
			dvdOk[num]=true;
			dvdDay[num]=day;
			System.out.println("借出《"+name+"》成功，借出天数为："+day);
		}
	}

	public static void go() {
		System.out.println("--->归还DVD");
		System.out.print("请输入你需要归还的DVD名称：");
		String name = input.next();
		int temp =-1;
		for (int i=0;i< dvdName.length;i++){
			if (dvdName[i]==null){
				break;//解决空指针异常
			}
			if (!dvdName[i].equals(name)){
				continue;//当输入值和目标值不等时直接跳过本次循环
			}
			if (!dvdOk[i]){
				System.out.println("该DVD已经被归还，不能重复归还！");
				break;
			}
			dvdOk[i]=false;
			dvdDay[i]=0;
			dvdNum[i]++;//当归还时，借出次数加一
			System.out.println("归还《"+name+"》成功！");
			temp=i;
			break;
		}
		if (temp==-1){
			System.out.println("找不掉你需要归还的DVD，请重新输入!");
		}
	}

}
