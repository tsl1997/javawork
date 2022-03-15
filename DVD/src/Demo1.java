public class Demo1 {
	public static void main(String[] args) {
		int[][] arrs={{1,4}, {1}, {2,5,9}, {3}, {4}};
		for (int i=0;i< arrs.length;i++){
			for (int j=0;j< arrs[i].length;j++){
				System.out.println(arrs[i][j]);
			}
		}
	}
}
