package homeWork.no2;

public class Tester {
	public static void main(String[] args) {
		/*2、模拟火车站售票程序，开启三个窗口售票。*/
		//现在来说第二种实现多线程的方式，Runnable接口
		SellTickets sell = new SellTickets();//创建任务
		Thread t1 = new Thread(sell,"小白");
		Thread t2 = new Thread(sell,"小红");
		Thread t3 = new Thread(sell,"小绿");
		t1.setPriority(10);//设置优先级，但是不绝对
		t2.setPriority(1);
		t3.setPriority(8);
		t1.start();//开启任务
		t2.start();
		t3.start();
	}
}
