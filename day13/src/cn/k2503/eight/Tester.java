package cn.k2503.eight;

import org.junit.Test;

public class Tester {
	@Test
	public void boyAndGirl() {
		GirlFriend girlFriend = new GirlFriend("芸娘", 1.5, "含情目");
		System.out.println(girlFriend.cook());//输出做饭
		System.out.println(girlFriend.clothes("太虚幻境","白色"));//输出洗衣服
		BoyFriend sanBai = new BoyFriend("沈三白", 1.8);
		System.out.println(sanBai.money());//输出赚钱
		System.out.println(sanBai.love(girlFriend.getName()));//输出和女朋友玩耍

	}
}
