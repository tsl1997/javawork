package homeWork.no3;

public class Money implements Runnable {
	private int money=3000;

	@Override
	public void run() {
		quKuan();
	}
	//加上一个锁就好了
	private synchronized  void quKuan() {
		while (money>2000){
			this.money-=2000;
			System.out.println(Thread.currentThread().getName()+
					"取款2000元，余额："+money);
		}
	}
}
