package homeWork.no1;

public class DemoThread extends Thread {
	//现在的智能提示很牛逼啊

	//无论什么时候都要提供一个无参构造方法
	public DemoThread() {
	}
	//构造方法，传入name参数
	public DemoThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i <100;i++) {
			if(i%2==0){//取偶数
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
}
