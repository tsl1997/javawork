package cn.k2502.pet;

public class Dog extends Pet{
	//private String color;//颜色

	public Dog(String name, int age, int weight, String variety,String color) {
		super(name,age,weight,variety,color);
	}

	public void hi(){
		System.out.println("汪汪汪");
	}
}
