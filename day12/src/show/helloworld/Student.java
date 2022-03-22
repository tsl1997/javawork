package show.helloworld;
/**这是一个学生类*/
public class Student {
	private String name;//姓名
	private int age;//年龄

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<16){
			System.out.println("请输入16-100岁的年龄！");
			return;
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String showInfo(){
		return "姓名是："+name+"\t年龄是："+age;
	}

	public Student(String name, int age) {
		setName(name);
		setAge(age);
	}
}
