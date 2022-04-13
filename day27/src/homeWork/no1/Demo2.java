package homeWork.no1;

public class Demo2 extends Thread{

	public Demo2() {
	}

	public Demo2(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i <100;i++) {
			if(i%2!=0){//取奇数
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
}
