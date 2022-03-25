package cn.k2502.homeWork4;
/**这是测试类*/
public class Tester {
	public static void main(String[] args) {
		//1:创建对象
		JavaEE p1 = new JavaEE("李白", 1);
		Android p2 = new Android("王维", 2);
		Web p3 = new Web("白居易", 3);
		CPU p4 = new CPU("杜甫", 4);
		//2：调试方法
		System.out.println(p1.work());
		System.out.println(p2.work());
		System.out.println(p3.work());
		System.out.println(p4.work());
	}
}
