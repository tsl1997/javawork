package KaoShi.no5;

public class Student extends Person{
	/**学习方法*/
	public void learn(){
		System.out.println(getAge()+"岁的"+getName()+"在努力敲代码");
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public Student() {
	}

	/**重写eat方法*/
	@Override
	public void eat() {
		System.out.println(getAge()+"岁的"+getName()+"在家吃饭");
	}
}
