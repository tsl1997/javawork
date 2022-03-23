package cn.k2503.eight;

public class GirlFriend extends Human{
	private String face;//脸型

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	/**构造函数*/
	public GirlFriend(String name, double height,String face) {
		super(name, height);
		setFace(face);
	}
	/**洗衣服：自我介绍
	 * 传入衣服品牌和颜色*/
	public String clothes(String brand,String color){
		Clothes clothes = new Clothes(brand, color);
		return getName()+"洗"+clothes.getBrand()+"牌子，"+clothes.getColor()+"的衣服";
	}
	/**做饭：自我介绍*/
	public String cook(){
		return getName()+"\t"+getFace()+"\t身高"+getHeight()+"\t会炒菜";
	}

}
