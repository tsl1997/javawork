package show.helloworld;
/**这个一个员工类*/
public class Employee {
	/**姓名*/
	public String name;
	/**岗位*/
	public String post;
	/**薪水*/
	public int salary;
	/**邮箱*/
	public String email;
	/**构造方法*/
	public Employee(String name, String post, int salary, String email) {
		this.name = name;
		this.post = post;
		this.salary = salary;
		this.email = email;
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee(){

	}

	/**自我介绍*/
	public String showInfo(){
		String str ="姓名："+name+",岗位"+post+",新水："+salary+",邮箱："+email;
		return str;//把拼接结果返回
	}




}
