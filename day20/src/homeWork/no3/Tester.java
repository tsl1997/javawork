package homeWork.no3;

public class Tester {
	public static void main(String[] args) {
		String a="我喜欢QY";
		String b="我喜欢QY";
		String e="我喜欢";
		String f="QY";
		String g=e+f;//结果，创建一个新的对象，内容指向常量："我喜欢QY"
		boolean c=a==b;
		boolean d=a.equals(b);
		boolean h=g==a;
		boolean i=g.equals(a);
		System.out.println("a==b "+c);//t
		System.out.println("a.equals(b) "+d);//t
		System.out.println("a==g "+h);//f
		System.out.println("a.equals(g) "+i);//t


	}
}
