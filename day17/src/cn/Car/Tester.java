package cn.Car;

import org.junit.Test;

public class Tester {
	@Test//测试打折能够是否正常
	public void discountTest() {
		Che jiaoChe = new JiaoChe("宝马","京NY28588",800,"X6");
		jiaoChe.setDays(10);//10天
		System.out.println("当前的车牌号为："+jiaoChe.getCarNo());//588
		System.out.println("当前的折扣是："+jiaoChe.getDiscount());//800*10*0.9
		System.out.println("当前的租金是："+jiaoChe.giveMoney());
	}
}
