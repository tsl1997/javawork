package demo;

public class Ticket implements Runnable{
	//共100票
	int ticket = 100;
	//定义锁对象
	Object lock = new Object();

	@Override
	public void run() {
		//模拟卖票
		while(true) {
			method();
		}
	}

	private synchronized void method() {
		if (ticket > 0) {
				//模拟选坐的操作
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在卖票:" + ticket--);
		}
	}
}
