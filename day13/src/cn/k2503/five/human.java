package cn.k2503.five;
/**这是一个人类*/
public class human {
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
		if (age <= 0 || age>100){
			this.age = 1;
			return; //人类年龄不能为负数
		}
		this.age = age;
	}
	/**打印吃饭*/
	public String dine(){
		return "人都要吃饭";
	}
}
