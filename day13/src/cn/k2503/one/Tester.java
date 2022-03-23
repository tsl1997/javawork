package cn.k2503.one;

import org.junit.Test;

/**这是一个测试类*/
public class Tester {
	@Test
	public void testPet(){
		Dog dog = new Dog();//创建子类狗狗对象
		dog.setNickName("旺财");//给狗狗分别赋值，调用父类pet方法
		dog.setHp(66);
		dog.setLove(88);
		System.out.println(dog.showInfo());//呼唤狗狗

		Penguin p = new Penguin();//创建企鹅对象
		p.setNickName("腾讯");
		p.setHp(5);//腾讯，你妈没了
		p.setLove(1);//给负数会修改成60，这是最低值
		System.out.println(p.showInfo());//乖儿子，给爷爷笑一个

	}
}
