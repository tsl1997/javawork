package cn.k2502.homeWork3;
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
}
