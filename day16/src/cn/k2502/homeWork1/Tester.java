package cn.k2502.homeWork1;

import oracle.jrockit.jfr.StringConstantPool;

public class Tester {
	public static void main(String[] args) {
		Pet[] pets = new Pet[2];//创建父类对象数组
		pets[0] = new Cat("汤姆","黑色",4);
		pets[1] = new Dog("101忠狗","白色",4);
		System.out.println(pets[0].meal());
		String a=((Cat)pets[0]).catchMouse();//调用猫的特有行为
		System.out.println(a);
		System.out.println(pets[1].meal());
		String b=((Dog)pets[1]).lookHome();//调用狗的特有行为
		System.out.println(b);
	}
}
