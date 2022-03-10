import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		//1:获取用户的存款
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的存款：");
		int salary = input.nextInt();
		/*
		* 2:当存款大于等于500万时买“凯迪拉克”，
		* 当存款大于等于100万时买“帕萨特”，
		* 当存款大于等于50万时买“伊兰特”，
		* 当存款大于等于10万时买“奥拓”，
		* 否则只能买“捷安特”
		* */
		if (salary>5000000){
			System.out.println("我可以购买"+"凯迪拉克");
		}else if (salary>1000000){
			System.out.println("我可以购买"+"帕萨特");
		}else if (salary>500000){
			System.out.println("我可以购买"+"伊兰特");
		}else if (salary>100000){
			System.out.println("我可以购买"+"奥拓");
		}else {
			System.out.println("我只能购买"+"捷安特");
		}
	}
}
