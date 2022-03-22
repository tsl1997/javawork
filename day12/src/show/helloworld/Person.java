package show.helloworld;

public class Person {
	private String name;
	private int age;
	private String sex;


	public String showInfo(){
		return "姓名是："+name+"年龄是："+age+"性别是："+sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>100 || age<0 ){
			System.out.println("年龄一个在0-100之间！");
			return;
		}
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if (!sex.equals("男") &&!sex.equals("女")){
			System.out.println("性别只能是男或者女！");
			return;
		}
		this.sex = sex;
	}

	public Person(String name, int age, String sex) {
		this(name, age);
		setSex(sex);
	}

	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	public Person(){
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
