package cn.homeWork.no1;
/**这是一个投票类*/
public class Ballot {
	/**投票数量*/
	public static int ballot;

	public static String giveBallot(){
		if (ballot==100){
			return "投票获得已经结束！";
		}
		ballot++;
		return "V"+ballot+"：感谢您的投票！";
	}
}
