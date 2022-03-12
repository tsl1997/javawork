public class HomeWork2 {
	public static void main(String[] args) {
		//等腰三角形
		//1：确定行数，5行
		for (int i=1;i<=5;i++){
			//2:确定空格数量
			for (int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			//3:打印星星
			for (int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();//换行
		}
	}
}
