package KaoShi.no5;

public class Teacher extends Person{
	/**授课方法*/
	public void teach(){
		System.out.println(getAge()+"岁的"+getName()+"在教JAVA");
	}

	public Teacher(String name, int age) {
		super(name, age);
	}

	public Teacher() {
	}

	/**重写eat方法*/
	@Override
	public void eat() {
		System.out.println(getAge()+"岁的"+getName()+"在食堂吃饭");
	}
}
