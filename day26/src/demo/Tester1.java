package demo;
/**首先继承Thread，实现多线程1*/
public class Tester1 extends Thread{
	public Tester1() {
	}

	public Tester1(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i <10;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
}
