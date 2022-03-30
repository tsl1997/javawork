package homeWork.no7;

public class Demo {
	private String name;//
	private int age;//年龄
	private char sex;//性别

	public String getName() {
		return name;
	}

	public void setName(String name)throws RuntimeException{
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws RuntimeException{
		if (age<0||age>100){
			throw new RuntimeException("年龄一个在0-100之间！");
		}
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) throws RuntimeException{
		if (sex!='男'&&sex!='女'){
			throw new GenderException("性别只能是男或者女");
		}
		this.sex = sex;
	}
}
