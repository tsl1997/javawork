package cn.k2502.classJob;

public class Teacher extends YuanGong{
	public Teacher(String name, String post) {
		super(name, post);
	}

	@Override
	public String work() {
		return getPost()+"教员"+getName()+"在备课";
	}
}
