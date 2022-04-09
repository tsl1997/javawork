package homeWork.no3;

public class Tester {
	public static void main(String[] args) {
		//		3、递归实现：
		//   实现1+2+3+4+…+n的功能，要求不能使用for、while、乘法等
		long add = add(100);
		System.out.println("从1加到100的和是："+add);

	}

	public static long add(int num){
		if(num==1){
			return 1;//跳出无限递归的出口
		}
		return add(num-1)+num;
	}
}
