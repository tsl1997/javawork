package cn.k205;

public class Tester {
	public static void main(String[] args) {
		System.out.println("NUM="+Demo.NO);
		System.out.println("PI="+Demo.PI);

		Idemo1 demo = new Demo();//向上转型
		demo.run1();
		Idemo2 demoX = new Demo();
		((Demo)demoX).run1();//向下转型，子类
		((Idemo1)demoX).run1();//向下转型，父接口
		Idemo3 demoS = new Demo();
		((Idemo1)demoX).run1();//向下转型，子类
	}
}
