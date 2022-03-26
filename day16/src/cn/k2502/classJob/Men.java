package cn.k2502.classJob;

public class Men extends Person{
	public Men() {
	}

	public Men(String name, int age) {
		super(name, age);
	}

	@Override
	public String work() {
		return super.toString()+"在耕地！";
	}

	public String smoking() {
		return "抽烟！";
	}
}
