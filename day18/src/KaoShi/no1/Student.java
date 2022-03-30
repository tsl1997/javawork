package KaoShi.no1;
/**这是一个学生类
 * 第一题
 **/
public class Student {
	private String name;//姓名
	private int age;//年龄

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/**全参构造*/
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**无参构造*/
	public Student() {
	}
	/**打印信息*/
	public void show(){
		System.out.println("姓名是："+getName()+",年龄是："+getAge());
	}
}
