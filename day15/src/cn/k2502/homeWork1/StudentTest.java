package cn.k2502.homeWork1;
/**这是学生测试类*/
public class StudentTest {
	public static void main(String[] args) {
		Student[] students ={new Student("张三",45),//定义一个对象数组
				new Student("tim",57),new Student("丽塔",88)};
		new StudentRevise().revise(students);//修改学生信息
		for (Student stu:students){
			System.out.println(stu.toString());//打印自我介绍
		}

	}
}
