package cn.k205;

public class Demo implements Idemo1,Idemo3{
	@Override
	public void run1() {
		System.out.println("这是爸爸的方法");
	}

	@Override
	public void run3() {
		System.out.println("这是妈妈的方法");
	}

	@Override
	public void run2() {
		System.out.println("这是祖母的方法");
	}
}
