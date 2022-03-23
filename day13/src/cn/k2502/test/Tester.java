package cn.k2502.test;

import cn.k2502.cat;
import cn.k2502.dog;
import cn.k2502.pet.Cat;
import cn.k2502.pet.Dog;
import cn.k2502.pet.Pig;
import org.junit.Test;

public class Tester {
	@Test
	public void petTest(){
		dog dog = new dog("旺财",1,2,"招财狗","白色");
		dog.hi();//叫一下
		System.out.println(dog.showInfo());
		cat cat = new cat("朱竹清",18,40,"幽冥灵猫","黑色");
		cat.hi();//叫一下
		System.out.println(cat.showInfo());

	}
	@Test
	public void TestPet(){
		Dog dog = new Dog("陶森林",25,90,"单身贵族","绿色");
		dog.hi();//叫一下
		System.out.println(dog.showInfo());//自我介绍
		Cat cat = new Cat("朱竹清",18,40,"幽冥灵猫","黑色");
		cat.hi();//叫一下
		System.out.println(cat.showInfo());
		Pig pig = new Pig("猪八戒",18,200,"烤乳猪");
		pig.hi();//叫一下
		System.out.println(pig.showInfo());

	}
}
