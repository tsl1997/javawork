package cn.homeWork.no7;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();//创建对象
		for (int i=1;i<=20;i++){
			System.out.println("第"+i+"个随机数是："+random.nextInt(10));
		}
	}
}
