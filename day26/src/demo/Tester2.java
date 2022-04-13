package demo;

public class Tester2 {
	public static void main(String[] args) {
		Test te = new Test();//创建任务对象
		Thread t = new Thread(te,"南小鸟");//创建Thread对象，参入任务参数
		Thread jk = new Thread(te,"艾米莉亚");//创建对象
		t.setPriority(8);//设置优先级
		jk.setPriority(3);
		jk.start();//开启线程
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("白："+i);//主线程内容
		}
	}
}
