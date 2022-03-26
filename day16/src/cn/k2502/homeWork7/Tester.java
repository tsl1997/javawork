package cn.k2502.homeWork7;
/**这是测试类*/
public class Tester {
	public static void main(String[] args) {
		Animal[] a = new Animal[2];//创建动物对象数组
		a[0]=new Dog();//分别创建猫狗对象
		a[1]=new Cat();//向上转型
		Host host = new Host();//创建主人对象
		System.out.println(host.donateAnimal(a[0]));//调用主人对象，向下转型，自动调用toString
		System.out.println(host.donateAnimal(a[0]));
	}
}
