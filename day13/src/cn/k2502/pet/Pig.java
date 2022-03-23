package cn.k2502.pet;

public class Pig extends Pet{
	//private String color;//颜色
	public void hi(){
		System.out.println("呲呲呲");
	}

	public Pig(String name, int age, int weight, String variety) {
		setName(name);
		setAge(age);
		setWeight(weight);
		setVariety(variety);
	}

	public String showInfo(){
		return getName()+","+getAge()+","+getWeight()+","+getVariety();
	}
}
