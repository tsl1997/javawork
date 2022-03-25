package cn.k2502.homeWork4;

public class JavaEE extends Research{
	public JavaEE() {
	}

	public JavaEE(String name, int number) {
		super(name, number);
	}

	@Override
	public String work() {
		return "JavaEE工程师：员工工号为："+getNumber()+"的"+getName()+"员工，正在研发淘宝网站";
	}
}
