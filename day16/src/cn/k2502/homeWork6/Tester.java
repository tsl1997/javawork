package cn.k2502.homeWork6;

public class Tester {
	public static void main(String[] args) {
		Master m = new Master();//创建主人对象
		Pet[] pets = new Pet[2];//创建父类对象
		pets[0] = new Dog("旺财", 56, 88);//创建狗狗对象
		pets[1] = new Penguin("腾讯", 99, 1);//创建企鹅对象
		System.out.println(pets[0]);//打印狗狗的自白
		System.out.println(m.one(pets[0]));//狗子叼飞碟
		System.out.println(pets[1]);//打印企鹅的自白
		System.out.println(m.one(pets[1]));//企鹅游泳
	}
}
