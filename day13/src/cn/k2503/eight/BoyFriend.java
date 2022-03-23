package cn.k2503.eight;

public class BoyFriend extends Human{

	public BoyFriend(String name, double height) {
		super(name, height);
	}
	/**这是会挣钱*/
	public String money(){
		return getName()+"会挣钱";
	}
	/**和女朋友玩耍*/
	public String love(String girlName){
		return getName()+"和"+girlName+"一起幸福的玩耍";
	}



}
