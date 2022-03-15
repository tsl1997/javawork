public class Demo1 {
	public static void main(String[] args) {
		int[][] arrs=new int[4][3];
		for (int i=0;i< arrs.length;i++){
			for (int j=0;j<arrs[i].length;j++){
				System.out.print(arrs[i][j]);
			}
			System.out.println();//换行
		}
	}
}
