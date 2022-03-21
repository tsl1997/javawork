import java.util.Random;

/**这是一个电视游戏类*/
public class QuessMachine {
	Random r = new Random(1);//定义随机数
	int tvPrice=r.nextInt(10000);//随机生成价格
	String[] price=new String[]{"公主电动车","王子电视","腾讯会员12个月","波音747五百元代金券","马化腾亲笔签名"};

	/**这是选择随机产品的方法*/
	public String initial(){
		int ran1 = r.nextInt(5);
		String prices=price[ran1];//随机生成
		return prices;//传递返回的值
	}
	/**这是随机产生价格*/
	public int guess(int a){
		int b=2;
		if (a == tvPrice){
			b=0;
			return b;
		}
		if (a>tvPrice){
			b=1;
			return b;
		}
		return b;
	}

}
