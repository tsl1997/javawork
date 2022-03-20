/**这是一个测试类*/
public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[3];//创建对象数组
		for (int i=0;i<students.length;i++){
			students[i]=new Student();//创建具体的对象
		}
		students[0].name="张三";//给具体的对象赋值，下同
		students[1].name="李四";
		students[2].name="王五";
		students[0].score=15;
		students[1].score=55;
		students[2].score=85;
		new StudentScore().print(students);//开始打印信息
		new StudentScore().revise(students);//修改一次学生的成绩信息
		new StudentScore().print(students);//再次打印信息
	}
}
