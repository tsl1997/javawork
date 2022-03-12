public class KaoShi5 {
	public static void main(String[] args) {
		//打印一个6行的直角三角形，用*填充
		for (int i=1;i<=6;i++){
			for (int j=1;j<=i;j++){
				System.out.print("*\t");//每次打印一个，打印次数随着i变化而变化
			}
			System.out.println();//打印换行
		}
	}
}
