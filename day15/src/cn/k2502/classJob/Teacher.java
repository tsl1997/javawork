package cn.k2502.classJob;

public class Teacher extends YuanGong{
	public Teacher(String name, String post) {
		super(name, post);
	}

	@Override
	public String work() {
		return getPost()+getName()+"在备课";
	}
}
