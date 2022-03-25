package cn.k2502.classJob;

public class BYAC extends YuanGong{
	public BYAC(String name, String post) {
		super(name, post);
	}
	//教师

	@Override
	public String work() {
		return getPost()+getName()+"在写代码";
	}

	@Override
	public String toString() {
		return getName()+","+getPost();
	}
}
