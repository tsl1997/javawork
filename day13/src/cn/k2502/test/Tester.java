package cn.k2502.test;

import cn.k2502.cat;
import cn.k2502.dog;
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

	}
}
