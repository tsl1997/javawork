/**
 * 类和对象，作业第三题，创建Teacher类*/
public class Teacher {
	/**
	 * 姓名 string*/
	public String name;
	/**
	 * 专业方向 string*/
	public String specialty;
	/**
	 * 授课教程 string*/
	public String course;
	/**
	 * 教龄 int*/
	public int age;

	/**
	 * 自我介绍：姓名 专业 授课 教龄*/
	public void showInfo(){
		System.out.println(name+"\n专业方向："+specialty+"\n教授课程："+course+"\n教龄："+age);
	}

}
