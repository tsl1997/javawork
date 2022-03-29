package cn.k205.aninimal;

public class Dog implements Animal,JD{
	@Override
	public void eat() {
		System.out.println("啃骨头");
	}

	@Override
	public void shout() {
		System.out.println("汪汪汪");
	}

	@Override
	public void JD() {
		System.out.println("警犬缉毒");
	}
}
