public class HomeWork3 {
	public static void main(String[] args) {
		//平行四边形
		//1：确定行数，5行
		for (int i=1;i<=5;i++){
			//2:确定空格数量
			for (int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			//3:打印星星
			for (int k=1;k<=5;k++){
				System.out.print("* ");
			}
			System.out.println();//换行
		}
	}
}