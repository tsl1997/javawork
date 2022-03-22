/**这是一个宠物类*/
public class Dog {
	private String Types;//类型
	String name;//姓名
	private int hp;//生命值
	private int love;//亲密度
	private String sex;//性别
	/**操作类型*/
	public void getTypes(int type) {
		if (type == 1){
			Types="狗狗";
			return;
		}
		if (type == 2){
			Types="企鹅";
			return;
		}
		Types="狗狗";
		System.out.println("输入错误，已经重置为默认值1：狗狗");
	}
	/**获取类型*/
	public String setTypes(){
		String type=Types;//获取类型
		return type;
	}
	/**封装后操作生命值*/
	public void getHp(int hp) {
		if (hp<0 || hp>100){//判断是否合法
			this.hp=60;//
			System.out.println("生命值一个在0-100之间哦，已经设置默认值60");
			return;
		}
		this.hp=hp;//把用户的值传递过去
	}
	/**取出生命值*/
	public int setHp() {
		int hp=this.hp;
		return hp;
	}
	/**封装后操作亲密度*/
	public void getLove(int love) {
		if (love<0 || love>100){//判断是否合法
			this.love=60;//
			System.out.println("亲密度一个在0-100之间哦，已经设置默认值60");
			return;
		}
		this.love=love;//把用户的值传递过去
	}
	/**取出亲密度*/
	public int setLove() {
		int love=this.love;
		return love;
	}
	/**性别判断*/
	public void getSex(int sex,String type) {
		if("狗狗".equals(type)) {
			if (sex == 1) {
				this.sex = "小奶狗";
				return;
			}
			if (sex == 2) {
				this.sex = "小母狗";
				return;
			}
			this.sex = "小奶狗";
			System.out.println("你输入的性别不合法，已经重置为默认值1：小奶狗");
		}
		if("企鹅".equals(type)) {
			if (sex == 1) {
				this.sex = "Q仔";
				return;
			}
			if (sex == 2) {
				this.sex = "Q妹";
				return;
			}
			this.sex = "小奶狗";
			System.out.println("你输入的性别不合法，已经重置为默认值1：小奶狗");
		}
	}
	/**性别获取*/
	public String setSex(){
		String sex=this.sex;
		return sex;
	}
	/**自我介绍*/
	public void showInfo(){
		System.out.println("我的名字叫"+name+",健康值是"+hp+"，和主人的亲密度是"+love+"。我的性别是"+sex);
	}

}
