import java.util.Scanner;

public class TestQuessMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuessMachine q = new QuessMachine();//创建对象
		String d=q.initial();//获取说明信息
		System.out.println("请猜测"+d+"的价格：");
		int i = input.nextInt();//第一次猜测
		int c=q.guess(i);
		int x=0;
		for (int a=0;a<3;a++) {
			if (c == 0) {
				System.out.println("恭喜你，猜对了");
				x=1;//判断状态
				break;
			} else if (c == 1) {
				System.out.println("太大了！\n再试试看：");
				i = input.nextInt();//
				c = q.guess(i);
			} else {
				System.out.println("太小了！\n再试试看：");
				i = input.nextInt();//
				c = q.guess(i);
			}
		}
		if (x==0){
			System.out.println("4次都没有猜中，真差劲呢！");
		}

	}
}
