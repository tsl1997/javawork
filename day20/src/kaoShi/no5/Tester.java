package kaoShi.no5;

public class Tester {
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();//创建对象
		int f1 = f.getFibonacciNum(-1);//测试非法数据，结果0
		int f2 = f.getFibonacciNum(2);//测试前两个数据，结果1
		int f3 = f.getFibonacciNum(10);//测试正常值，结果34
		System.out.println(f1 + " " + f2 + " " + f3);//打印结果
	}
}
