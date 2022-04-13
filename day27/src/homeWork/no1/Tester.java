package homeWork.no1;

public class Tester {
	/*1、创建两个子线程，让其中一个输出1-100之间的偶数，另一个输出1-100之间的奇数。*/
	public static void main(String[] args) {
		//1:先创建一个可以执行的子线程，有两种方案
		//2：创建一个类来继承Thread，重写run()方法
		DemoThread d1 = new DemoThread("艾米莉亚");
		Demo2 d2 = new Demo2("涂山红红");
		d1.start();//开启线程
		d2.start();//这里就写完了
	}
}
