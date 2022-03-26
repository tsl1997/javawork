package cn.k2502.homeWork6;
/**这是一个企鹅类*/
public class Penguin extends Pet{
	public Penguin() {
	}
	/**全参构造*/
	public Penguin(String nikeName, int HP, int love) {
		super(nikeName, HP, love);
	}
	/**重写toString*/
	@Override
	public String toString() {
		return super.toString()+"\n我是一只胖企鹅。";
	}

	public String swim() {
		return "企鹅在南极游泳";
	}
}
