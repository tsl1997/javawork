/**
 * 类和对象，作业第三题，创建Student类*/
public class Student {
	/**
	 * 姓名 string*/
	public String name;
	/**
	 * 年龄 int*/
	public int age;
	/**
	 * 班级 int*/
	public int myClass;
	/**
	 * 爱好 string*/
	public String love;

	/**
	 * 自我介绍 年龄 班级 爱好*/
	public void showInfo(){
		System.out.println(name+"\n年龄："+age+"\n班级："+myClass+"\n爱好："+love);
	}

}
