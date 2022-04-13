package homeWork.no3;

public class Tester {
	public static void main(String[] args) {
		/*3、银行储户张三在招商银行有一个账户，账户目前的余额是3000。
		张三和妻子分别从该账户中取款。张三取款2000元，妻子全款2000，
		每次取完打印账户余额。（思考：这个案例是否存在线程安全的问题，如何解决）*/
		//当然存在啦
		Money toMoney = new Money();//创建任务
		Thread t1 = new Thread(toMoney,"张三");
		Thread t2 = new Thread(toMoney,"李四");
		t1.start();//开启线程
		t2.start();
	}
}
