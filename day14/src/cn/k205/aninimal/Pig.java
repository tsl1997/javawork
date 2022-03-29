package cn.k205.aninimal;

public class Pig implements Animal,JD{
	@Override
	public void eat() {
		System.out.println("拱白菜");
	}

	@Override
	public void shout() {
		System.out.println("哼哧哼哧");
	}

	@Override
	public void JD() {
		System.out.println("小猪猪会缉毒");
	}
}
