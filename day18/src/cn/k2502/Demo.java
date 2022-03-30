package cn.k2502;



public class Demo {
	public static void main(String[] args) throws Exception{
		int a=6;
		int b=0;
		Add add = new Add();
		int sum = add.add(a, b);
		System.out.println("计算结果为："+sum);
	}
}
