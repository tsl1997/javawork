import java.util.Scanner;

public class TuiXiangZi {
	//写一个推箱子小游戏
	//1：定义游戏界面
	static int[][] menu=new int[12][12];
	//2:设置围墙，用1表示
	static int qiang=1;//设置围墙
	static int last= menu.length-1;//边界值
	static Scanner input=new Scanner(System.in);//设置监听器
	static int move=-1;//移动操作，无意义值
	//3：小人参数，设置小人所在位置的横纵坐标参数
	static int gameRow=1;//小人横坐标
	static int gameList=1;//小人纵坐标
	static int xiangRow=5;//箱子横坐标
	static int xiangList=5;//箱子纵坐标


	public static void main(String[] args) {
		//主入口
		for (int i=0;i<menu.length;i++){
			menu[0][i]=qiang;//第一行设置围墙
			menu[last][i]=qiang;//最后一行设置围墙
			menu[i][0]=qiang;//第一列
			menu[i][last]=qiang;//最后一列
		}
		//3：尝试打印游戏界面
		//4:设置小人出现的位置(固定或者随机)，设置小人所在位置的横纵坐标参数

		menu[gameRow][gameList]=8;//设置小人
		//menu[xiangRow][xiangList]=4;//设置箱子
		game();
		do {
			System.out.println("请选择小人移动的方向(1上，2下，3左，4右，5退出游戏）：");
			move = input.nextInt();
			gameMove();
			game();
		}while (move!=5);
	}

	//打印界面，重复调用
	public static void game() {
		for (int i=0;i<=last;i++){
			for (int j=0;j<=last;j++){
				if (menu[i][j]==0){
					System.out.print(" ");
					continue;
				}
				System.out.print(menu[i][j]);
			}
			System.out.println();//换行，控制界面
		}
	}

	//人物移动
	public static void gameMove() {
		//先判断是否有墙，如有就不再执行。
		if (move<0 || move>5){
			System.out.println("输入错误，请重新输入！");
		}else{
			boolean move1=move==1&&menu[gameRow-1][gameList]==1;//向上移动遇到墙
			boolean move2=move==2&&menu[gameRow+1][gameList]==1;//向下移动
			boolean move3=move==3&&menu[gameRow][gameList-1]==1;//向左移动
			boolean move4=move==4&&menu[gameRow][gameList+1]==1;//向右移动
			if (move1 || move2 ||move3 ||move4){
				System.out.println("旁边是墙，无法操作，请选择其他的方向操作！");
			}else{
				menu[gameRow][gameList]=0;//旧地点删除
				if (move==1){
					gameRow=gameRow-1;//坐标移动
				}
				if (move==2){
					gameRow=gameRow+1;//坐标移动
				}
				if (move==3){
					gameList=gameList-1;//坐标移动
				}
				if (move==4){
					gameList=gameList+1;//坐标移动
				}
				menu[gameRow][gameList]=8;//人物出现在新位置
			}
		}
		/*if (move==1){//向上移动
			if (menu[gameRow-1][gameList]==1) {
				System.out.println("上面是墙，无法移动，请选择其他的方向操作！");
			}else{//当没有墙时，处理人物移动
				menu[gameRow][gameList]=0;//旧地点删除
				gameRow=gameRow-1;//坐标移动
				menu[gameRow][gameList]=8;//人物出现在新位置
			}
		}
		if (move==2){//向下移动
			if (menu[gameRow+1][gameList]==1) {
				System.out.println("下面是墙，无法移动，请选择其他的方向操作！");
			}else{//当没有墙时，处理人物移动
				menu[gameRow][gameList]=0;//旧地点删除
				gameRow=gameRow+1;//坐标移动
				menu[gameRow][gameList]=8;//人物出现在新位置
			}
		}
		if (move==3){//向左移动
			if (menu[gameRow][gameList-1]==1) {
				System.out.println("左面是墙，无法移动，请选择其他的方向操作！");
			}else{//当没有墙时，处理人物移动
				menu[gameRow][gameList]=0;//旧地点删除
				gameList=gameList-1;//坐标移动
				menu[gameRow][gameList]=8;//人物出现在新位置
			}
		}
		if (move==4){//向右移动
			if (menu[gameRow][gameList+1]==1) {
				System.out.println("右面是墙，无法移动，请选择其他的方向操作！");
			}else{//当没有墙时，处理人物移动
				menu[gameRow][gameList]=0;//旧地点删除
				gameList=gameList+1;//坐标移动
				menu[gameRow][gameList]=8;//人物出现在新位置
			}
		}*/
	}
}
