package cn.k2502.pet;

public class Cat extends Pet{
	//private String color;//颜色
	public Cat(String name, int age, int weight, String variety,String color) {
		super(name,age,weight,variety,color);
	}


	public void hi(){
		System.out.println("喵喵喵");
	}
}
