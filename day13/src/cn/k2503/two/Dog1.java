package cn.k2503.two;

public class Dog1 extends Pet1{
	public Dog1(String nickName, int hp, int love) {
		super(nickName, hp, love);
		System.out.println("子类带参构造方法");
	}
}
