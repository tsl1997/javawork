package KaoShi.no3;

public class Rose extends Flower{
	private String origin;//产地

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**全参构造*/
	public Rose(String color, double price, String origin) {
		super(color, price);
		this.origin = origin;
	}
	/**无参构造*/
	public Rose() {
	}
	/**重写show方法*/
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("产地是："+getOrigin());
	}
	/**提示警告*/
	public void warn(){
		System.out.println("不要摘玫瑰花，小心扎手！");
	}
}
