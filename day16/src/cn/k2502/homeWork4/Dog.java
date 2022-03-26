package cn.k2502.homeWork4;
/**这是一个狗狗类*/
public class Dog extends Pet{
	public Dog() {
	}
	/**全参构造*/
	public Dog(String nikeName, int HP, int love) {
		super(nikeName, HP, love);
	}
	/**重写toString*/
	@Override
	public String toString() {
		return super.toString()+"\n我是一只吉娃娃犬。";
	}

}
