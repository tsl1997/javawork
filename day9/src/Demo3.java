public class Demo3 {
	public static void main(String[] args) {
		//数独3*3 将1-9填入其中，如果横竖斜着的和都相等
		int[][] moFang={{1,2,3},{4,5,6},{7,8,9}};
		//定义行求和的数据
		int[] rowNum=new int[moFang.length];
		//定义列求和的数据
		int[] listNum=new int[moFang[0].length];
		//定义斜着的求和数据
		int leanYes=0;//正斜求和
		int leanNo=0;//反斜求和

		//计算各行列斜的和
		for (int i=0;i< moFang.length;i++){
			leanYes+=moFang[i][i];//正斜求和
			leanNo+=moFang[i][moFang.length-i-1];//反斜求和
			for (int j=0;j<moFang[i].length;j++){
				rowNum[i]+=moFang[i][j];//行求和
				listNum[i]+=moFang[j][i];//列求和
			}
		}

		//输出结果
		/*System.out.println("正斜求和："+leanYes);
		System.out.println("反斜求和："+leanNo);
		for (int i=0;i< moFang.length;i++){
			System.out.println("第"+(i+1)+"行求和为："+rowNum[i]);
			System.out.println("第"+(i+1)+"列求和为："+listNum[i]);
		}*/


	}
}
