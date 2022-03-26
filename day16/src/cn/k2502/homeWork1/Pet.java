package cn.k2502.homeWork1;
/**这是一个父类*/
public abstract class Pet {
	//属性
	private String name;
	private String color;//
	private int TuiNumer;//腿个数
	//封装


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTuiNumer() {
		return TuiNumer;
	}

	public void setTuiNumer(int tuiNumer) {
		if (tuiNumer <1){
			return;//合法性验证
		}
		TuiNumer = tuiNumer;
	}

	public Pet(String name, String color, int tuiNumer) {
		this.name = name;
		this.color = color;
		setTuiNumer(TuiNumer);
	}

	public Pet() {
	}
	/**吃饭*/
	public abstract String meal();
}
