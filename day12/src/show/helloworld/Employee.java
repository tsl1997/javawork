package show.helloworld;
/**这个一个员工类*/
public class Employee {
	/**姓名*/
	String name;
	/**岗位*/
	String post;
	/**薪水*/
	int salary;
	/**邮箱*/
	String email;
	/**自我介绍*/
	public String showInfo(){
		String str ="姓名："+name+",岗位"+post+",新水："+salary+",邮箱："+email;
		return str;//把拼接结果返回
	}




}
