package blockChain;
/**这是一个区块*/
public class Block {
	private int firstNUmber;//区块头
	private int lastNumber;//区块尾
	private String bockDemo;//区块体

	public int getFirstNUmber() {
		return firstNUmber;
	}

	public void setFirstNUmber(int firstNUmber) {
		this.firstNUmber = firstNUmber;
	}

	public int getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(int lastNumber) {
		this.lastNumber = lastNumber;
	}

	public String getBockDemo() {
		return bockDemo;
	}

	public void setBockDemo(String bockDemo) {
		this.bockDemo = bockDemo;
	}
	/**打印区块信息*/
	@Override
	public String toString() {
		return "区块头：" + firstNUmber +
				"\n区块内容：" + bockDemo  +
				"\n区块尾：" + lastNumber;
	}
}
