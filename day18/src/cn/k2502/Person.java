package cn.k2502;

public class Person {
	private String name;
	private int age;//年龄
	private char sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws RuntimeException{
		if (age<0 || age>150){
			throw new RuntimeException("年龄只能在0-150之间");
		}
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) throws Exception{
		if (sex!='男' && sex!='女' ){
			throw new Exception("性别只能是男或者女");
		}
		this.sex = sex;
	}
}
