public class TestSchool {
	/**
	 * 雷和对象，作业第二题，创建对象，引用school类的属性和方法
	 * */
	public static void main(String[] args) {
		School mySchool = new School();//创建一个对象
		mySchool.schoolName="北京";//给属性赋值
		mySchool.classNumber=10;
		mySchool.labNumber=10;

		System.out.println("***初始化成员变量后***");
		mySchool.showCenter();//调用方法
	}
}
