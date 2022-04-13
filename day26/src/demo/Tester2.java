package demo;

public class Tester2 {
	public static void main(String[] args) {
		Tester1 t = new Tester1();
		//t.run();
		t.start();
		Tester1 jk = new Tester1();
		jk.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("主要："+i);
		}
	}
}
