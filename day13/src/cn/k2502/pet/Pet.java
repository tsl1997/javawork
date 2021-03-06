package cn.k2502.pet;
/**这是一个宠物类*/
public class Pet {
	public String name;//昵称
	public int age;//年龄
	public int weight;//体重
	public String variety;//品种
	public String color;//颜色
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<=0){
			System.out.println("年龄一个大于0");
			return;
		}
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight<=0){
			System.out.println("体重应该大于0");
			return;
		}
		this.weight = weight;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	/**全参*/
	public Pet(String name, int age, int weight, String variety,String color) {
		setName(name);
		setAge(age);
		setWeight(weight);
		setVariety(variety);
		setColor(color);
	}
	/**无参*/
	public Pet() {
	}

	/**打印信息*/
	public String showInfo(){
		return getName()+","+getAge()+","+getWeight()+","+getVariety()+","+getColor();
	}
}
