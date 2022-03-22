import java.util.Scanner;

/**这是一个宠物测试类*/
public class DogTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		Dog pet = new Dog();//创建对象
		System.out.print("请输入你要领养的宠物名字：");
		pet.name = input.next();//获取姓名并赋值

		System.out.print("请选择你要领养的宠物类型(1：狗狗 2：:企鹅)：");
		pet.getTypes(input.nextInt());//获取用户输入的值，并调用方法
		String type = pet.setTypes();//获取宠物的类型
		System.out.print("请输入"+type+"性别(1：公 2：母)：");
		int sex = input.nextInt();
		pet.getSex(sex,type);//操作性别
		System.out.print("请输入"+type+"的健康值《 1~100之间):");
		pet.getHp(input.nextInt());//输入生命值传递值
		System.out.print("请输入"+type+"的亲密度《 1~100之间):");
		pet.getLove(input.nextInt());//输入亲密度传递值
		pet.showInfo();//打印自我介绍
	}
}
