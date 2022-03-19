public class Counter {
	/**加法
	 * @param a 第一个变量
	 * @param b 第二个变量*/
	public int add(int a,int b,int c){
		int sum=a+b+c;
		return sum;
	}
	/**多个整数求和，传入数组
	 * @param a 第一个数组*/
	public int adds(int[] a){
		int sum=0;
		for (int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
}
