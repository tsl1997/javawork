package cn.k2502.homeWork3;
/**这是一个宠物类*/
public class Pet {
	//属性：昵称  健康值  亲密度 自白的方法：
	private String nikeName;
	private int HP;
	private int love;
	//封装属性

	public String getNikeName() {
		return nikeName;
	}

	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int HP) {
		if (HP < 0) {
			return; //生命值不允许为负数
		}
		this.HP = HP;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if (love <0){
			return;//亲密度不能为负数
		}
		this.love = love;
	}
	/**无参构造*/
	public Pet() {
	}
	/**有参构造*/
	public Pet(String nikeName, int HP, int love) {
		this.nikeName = nikeName;
		setHP(HP);//验证参数是否合法
		setLove(love);
	}
	/**重写toString*/
	@Override
	public String toString() {
		return "宠物的自白：\n" +
				"我的名字叫" + nikeName +
				", 健康值是：" + HP +
				", 我和主人的亲密度是：" + love;
	}
	/**健康值判断*/
	public String HPok(){
		return "**********\n"+(getHP()>60?"我很健康":"打针，吃药");
	}

}
