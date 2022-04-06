package kaoShi.no4;

public class Tester {
	public static void main(String[] args) {
		Player p = new Player();//创建对象
		try {
			p.play(11);
		} catch (NoThisSoundException e) {
			System.err.println(e.getMessage());//打印异常信息
		}
	}
}
