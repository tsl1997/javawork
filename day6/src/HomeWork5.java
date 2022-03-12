public class HomeWork5 {
	public static void main(String[] args) {
		/*2、鸡兔同笼是我国古代的趣题之一。大月在1500年前，《孙子算经》中记载了这样一道题目：
		今有鸡兔同笼，上有三十五头，下有九十四足，问鸡兔各几只？试编写程序解决这个问题。
		提示：定义变量chookNum,rabbitNum分别表示鸡的数量、兔子的数量，二者有如下两个关系。
		chookNum+rabbitNum=35;
		2*chookNum+4*rabbitNum=94;
		鸡的数量chookNum的范围是0<=chookNum<=35，利用循环结构实现*/
		//1:定义变量
		int chookNum=0;//定义鸡的变量
		int rabbitNum=0;//定义兔子的变量
		boolean isOk;//定义解
		for (;chookNum<=35;chookNum++){
			rabbitNum=35-chookNum;//一共35个头
			isOk=2*chookNum+4*rabbitNum==94;//解
			if (isOk){
				System.out.println("鸡的数量为："+chookNum);
				System.out.println("兔子的数量为："+rabbitNum);
			}
		}
	}
}
