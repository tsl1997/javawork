package cn.k2502.homeWork4;

public class Web extends Maintain{

	@Override
	public String work() {
		return "网络维护工程师：员工工号为："+getNumber()+"的"+getName()+"员工，正在检查网络是否畅通";
	}
}
