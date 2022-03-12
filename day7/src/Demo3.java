import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names={"艾米莉亚","涂山红红","南小鸟","亚当娜"};
		System.out.print("请输入你要查找的人：");
		String name1=input.next();//需要找的人
		int nameNum=-1;//定义一个接受找到的值
		//寻找人
		for (int i=0;i<names.length;i++){
			if (names[i].equals(name1)){
				nameNum=i;
				break;//找到后结束程序
			}
		}
		//判断人
		if (nameNum>=0) {
			System.out.println("找到了！在数值第" + nameNum + "个元素");
		}else {
			System.out.println("查无此人！");
		}
	}
}
