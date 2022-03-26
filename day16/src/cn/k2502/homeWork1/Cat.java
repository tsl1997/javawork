package cn.k2502.homeWork1;

public class Cat extends Pet{
	public Cat(String name, String color, int tuiNumer) {
		super(name, color, tuiNumer);
	}

	public Cat() {
	}

	@Override
	public String meal() {
		return "猫吃鱼";
	}
	/**猫的特有方法*/
	public String catchMouse() {
		return getColor()+"的猫抓老鼠";
	}
}
