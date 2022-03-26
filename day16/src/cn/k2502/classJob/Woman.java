package cn.k2502.classJob;

public class Woman extends Person{
	public Woman() {
	}

	public Woman(String name, int age) {
		super(name, age);
	}

	@Override
	public String work() {
		return super.toString()+"在纺织！";
	}

	public String buy() {
		return "买买买";
	}
}
