package cn.k2502.homeWork3;

public class Tester {
	public static void main(String[] args) {
		Dog dog = new Dog("旺财", 56, 88);//创建狗狗对象
		System.out.println(dog.toString());//打印狗狗的自白
		System.out.println(dog.HPok());//查看狗狗的健康状态
		Penguin p = new Penguin("腾讯", 99, 1);//创建企鹅对象
		System.out.println(p.toString());//打印企鹅的自白
		System.out.println(p.HPok());//查看企鹅的状态
	}
}
