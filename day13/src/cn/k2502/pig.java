package cn.k2502;

public class pig {
	private String name;//昵称
	private int age;//年龄
	private int weight;//体重
	private String variety;//品种
	//private String color;//颜色

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

	/*public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}*/
	/**全参*/
	public pig(String name, int age, int weight, String variety, String color) {
		setName(name);
		setAge(age);
		setWeight(weight);
		setVariety(variety);
		//setColor(color);
	}
	/**无参*/
	public pig() {
	}

	public void hi(){
		System.out.println("八戒八戒");
	}
	/**打印信息*/
	public String showInfo(){
		return getName()+getAge()+getWeight()+getVariety();//+getColor();
	}
}
