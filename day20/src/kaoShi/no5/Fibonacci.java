package kaoShi.no5;

public class Fibonacci {
	public int getFibonacciNum(int n){
		if(n<=1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		int[] ints = new int[n];//创建数组
		ints[0]=0;//设定起始值
		ints[1]=1;
		int num=0;
		for (int i=2;i<n;i++){
			ints[i]=ints[i-1]+ints[i-2];
			num=ints[i];//获取结果
		}
		return num;
	}
}
