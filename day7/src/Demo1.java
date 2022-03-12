import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] statures=new double[5];
		for (int i=0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"位学生的身高：");
			statures[i]=input.nextDouble();
		}
		for (int j=0;j<5;j++){
			System.out.println("第"+(j+1)+"位学生的身高："+statures[j]);
		}
	}
}
