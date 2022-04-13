package homeWork.no2;

public class SellTickets implements Runnable{
	private int tickets=10;
	public Object o=new Object();

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	@Override
	public void run() {
		//在代码块上面加锁要添加引用类型的对象
		synchronized (o) {
			while(tickets>0) {
				this.tickets--;
				System.out.println(Thread.currentThread().getName()+
						"卖出一张票，余票："+tickets);
			}
		}
	}
}
