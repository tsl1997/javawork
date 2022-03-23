package cn.k2503.one;
/**课后迆第一题
 * 宠物类，父类*/
public class Pet {
	//属性：昵称  健康值  亲密度 自白的方法：showInfo()
	private String nickName;
	private int hp;
	private int love;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp =60;
			return; //生命值不合法
		}
		this.hp = hp;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if (love<=0){
			this.love = 60;
			return;//亲密度不合法
		}
		this.love = love;
	}

	public String showInfo(){
		return "宠物的自白：\n我的名字叫："+getNickName()+"，我的健康值是："+getHp()
				+"，我和主人的亲密度是："+getLove();
	}
}
