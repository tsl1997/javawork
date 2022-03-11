public class ClassJob_99 {
	public static void main(String[] args) {
		//九九乘法表，所以类名为ClassJob_99
		for (int i=1;i<=9;i++){
			for (int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");//输出乘法内容
			}
			System.out.println();//换行
		}
	}
}
