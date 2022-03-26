package cn.k2502.homeWork1;

public class Dog extends Pet{
	public Dog(String name, String color, int tuiNumer) {
		super(name, color, tuiNumer);
	}

	public Dog() {
	}

	@Override
	public String meal() {
		return "狗啃骨头";
	}
	/**狗狗看家*/
	public String lookHome() {
		return getColor()+"的狗看家";
	}
}
