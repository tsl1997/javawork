import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("要几个学生？：");
		int num = input.nextInt();
		double[] heights=new double[num];
		double sum=0;
		//获取身高数据
		for (int i=0;i<heights.length;i++){
			System.out.print("请输入第"+(i+1)+"位身高：");
			heights[i] = input.nextDouble();
			sum+=heights[i];//求和
		}
		//打印身高数据
		for (int j=0;j<heights.length;j++){
			if (j==heights.length-1){
				System.out.print(heights[j]+"\n");
				break;
			}
			System.out.print(heights[j]+",");
		}
		//求最大值和最小值
		double max = heights[0];
		double min = heights[0];
		for (int k=0;k<heights.length;k++){
			if (max<heights[k]){
				max=heights[k];
			}
			if (min>heights[k]){
				min=heights[k];
			}
		}
		//输出结果
		System.out.println("最大值是："+max);
		System.out.println("最小值是："+min);
		System.out.println("平均身高是："+(sum/num));

	}
}
