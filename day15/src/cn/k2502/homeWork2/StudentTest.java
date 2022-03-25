package cn.k2502.homeWork2;
/**测试类*/
public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("420117199710065224", "李太白");//创建对象，下同
		Student s2 = new Student("420117199710065224", "李太白");
		System.out.println(s1.equals(s2));//打印结果
		System.out.println(s1==s2);//哈希地址是否相等
	}
}
