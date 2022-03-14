public class Demo1 {
	public static void main(String[] args) {
		//java入门到入土,p77,训练3
		String[][] ShuJia=new String[3][2];
		ShuJia[0][0]="历史读物";
		ShuJia[1][0]="经济读物";
		ShuJia[1][1]="现代科学";
		//输出结果
		for (int i=0;i<3;i++){
			for (int j=0;j<2;j++){
				System.out.print(ShuJia[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
