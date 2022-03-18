/**
 * 宠物类
 * */
public class Pet {
	/**
	 * 姓名 string
	 */
	public String nikeName;
	/**
	 * 颜色 string
	 */
	public String color;
	/**
	 * 性别 sex
	 */
	public String sex;
	/**
	 * 品种 string
	 */
	public String brand;
	/**
	 * 价格 int
	 */
	public int price;

	public Pet(String nikeName, String color, String sex, String brand, int price) {
		this.nikeName = nikeName;
		this.color = color;
		this.sex = sex;
		this.brand = brand;
		this.price = price;
	}

	public Pet() {

	}

	/**
	 * 自我介绍 姓名，颜色，性别，品种，价格
	 */
	public void showInfo(){
		System.out.println("它的昵称是："+nikeName+"\n它的颜色是："+color+"\n它的性别是："+
				sex+"\n它的品种是："+brand+"\n它的价格是："+price);
	}

}
