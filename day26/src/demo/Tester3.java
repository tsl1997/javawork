package demo;

public class Tester3 {
	public static void main(String[] args) {
		Test test = new Test();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("主要："+i);
		}
	}
}
