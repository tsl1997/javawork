package cn.k2502.homeWork4;

public class Android extends Research{
	public Android() {
	}

	public Android(String name, int number) {
		super(name, number);
	}

	@Override
	public String work() {
		return "Android工程师：员工工号为："+getNumber()+"的"+getName()+"员工，正在研发淘宝手机客户端软件";
	}
}
