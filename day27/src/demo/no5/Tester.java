package demo.no5;

public class Tester {
	/*编写方法计算斐波拉契数列中前10个数字的和
	提示：斐波拉契数列形如：1,1,2,3,5,8,13,21,34,.*/
	public static int Fibonacci(int num){
		if(num<1){
			return 0;
		}
		if(num==1||num==2){
			return 1;
		}
		int[] ints = new int[num];
		ints[0]=1;
		ints[1]=1;
		for(int i=2;i<num;i++){
			ints[i]=ints[i-1]+ints[i-2];
		}
		return ints[num-1];
	}

	public static void main(String[] args) {
		System.out.println(Tester.Fibonacci(10));
	}
}
