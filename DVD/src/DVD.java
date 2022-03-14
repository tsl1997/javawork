public class DVD {
	public static void main(String[] args) {
		startMenu();

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

}
