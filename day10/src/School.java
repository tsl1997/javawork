/**
 * 类和对象，作业第一题，创建school类
 * */
public class School {
	/**
	 * 学校名称 string
	 * */
	public String schoolName;
	/**
	 * 教室编号  int
	 * */
	public int classNumber;
	/**
	 * 机器编号  int
	 * */
	public int labNumber;

	/**
	 * 打印说明：A培训学员 设备：X教Y机
	 * */
	public void showCenter(){
		System.out.println(schoolName+"培训学员\n"+"设备："+classNumber+"教"+labNumber+"机");
	}

}
