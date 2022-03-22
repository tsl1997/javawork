package show.helloworld;
/**这是一个学生类*/
public class Student {
	private String name;//姓名
	private int age;//年龄
	private int score;//成绩
	private String sex;//性别
	private String profession;//专业

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if (!"男".equals(sex) && !"女".equals(sex)){
			System.out.println("性别输入不合法，已经重置为默认值：男");
			this.sex = "男";
		}
		this.sex = sex;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

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

	public int getScore() {
		return score;
	}
	/**传入对象数组，并且修改值*/
	public void setScore(Student[] score) {
		for (int i=0;i<score.length;i++){
			if (score[i].score<60){
				for (Student student : score) {
					student.score += 2;//全体+2分
				}
			}
		}
	}
	/**这是给张三测试用的，没有验证score*/
	public Student(int score,String name){
		getName();
		this.score = score;
	}
	/**无参构造*/
	public Student(){}
	/**第五题第一个构造参数*/
	public Student(String name,int age,String demo){
		setName(name);
		setAge(age);
		setSex("男");//其他两个是默认值
		setProfession("java");
	}
	/**第五题第二个构造参数*/
	public Student(String name,int age,String sex,String profession){
		setName(name);
		setAge(age);
		setSex(sex);
		setProfession(profession);
	}



	public String showInfoTwo(){
		return getName()+"的成绩是："+score;//传递年龄和姓名
	}

	public String showInfo3() {
		return getName()+"的年龄："+getAge()+",性别："+
				getSex()+"，专业："+getProfession();
	}
}
