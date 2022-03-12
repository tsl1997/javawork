public class HomeWork6 {
	public static void main(String[] args) {
		/*3、在马克思手稿中有一道趣味的数学问题：一共有30个人，可能包括男人、女人和小孩。
		他们在一家饭馆吃饭共花了50先令，其中每个男人花3先令，每个女人花2先令，每个小孩花1先令。
		请问：男人、女人和小孩各几人？请编写一个程序来解决这个问题。
		提示：
		a.定义三个变量men、women和kids分别表示男人数、女人数和小孩数，可以得到如下两个关系:
		Men+women+kids=30;
		3*men+2*women+kids=50;
		b.男人数i的范围是0<=men<=10*/
		//1：定义变量
		int men = 0;
		int women = 0;
		int kids ;
		boolean isOk;
		//2:逻辑，先循环男人，再里面循环女人，小孩=30-男人-女人
		for (;men<=10;men++){
			for (;women<=(30-men);women++){
				kids=30-men-women;//确定小孩数量
				isOk=3*men+2*women+kids==50;//获取布尔值，是与否
				if (isOk){
					System.out.println("男人有："+men+"人");
					System.out.println("女人有："+women+"人");
					System.out.println("小孩有："+kids+"人");
				}
			}
		}
	}
}
