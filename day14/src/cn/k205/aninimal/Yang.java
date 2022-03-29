package cn.k205.aninimal;

public class Yang implements Animal{
	@Override
	public void eat() {
		System.out.println("吃青草");
	}

	@Override
	public void shout() {
		System.out.println("灰太狼来了，快跑");
	}
}
