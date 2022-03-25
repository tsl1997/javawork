package cn.k2502.classJob;

public class Tester {
	public static void main(String[] args) {
		BYAC byac = new BYAC("王腾", "python程序员");
		System.out.println(byac);
		System.out.println(byac.hashCode());
		//System.out.println(new Teacher("李超","java教员").work());
	}
}
