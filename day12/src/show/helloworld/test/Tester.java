package show.helloworld.test;
import org.junit.Test;
import show.helloworld.Book;
import show.helloworld.Employee;
import show.helloworld.Person;
import show.helloworld.Student;

public class Tester {
	@Test
	public void employee(){
		Employee e1 = new Employee("李佛摩尔","交易员",100000000,"l@a.com");
		System.out.println(e1.showInfo());
		Employee k = new Employee("K", 6666);
		System.out.println(k.showInfo());
	}

	@Test
	public void person(){
		/*Person p1 = new Person();
		System.out.println(p1.showInfo());*/
		Person p2 = new Person("明日酱",102);
		System.out.println(p2.showInfo());
		Person p3 = new Person("江户川柯南",10,"小男孩");
		System.out.println(p3.showInfo());

	}

	@Test
	public  void  student(){
		Student student = new Student("泽塔奥特曼",10);//插入信息
		System.out.println(student.showInfo());//输出自我介绍
	}

	@Test
	public void studentTest(){
		Student[] students = new Student[3];
		students[0]=new Student(56,"张三");
		students[1]=new Student(86,"李四");
		students[2]=new Student(76,"王五");

		new Student().setScore(students);//临时调用方法

		for (int i=0;i<students.length;i++){
			System.out.println(students[i].showInfoTwo());//循环打印输出
		}

	}

	@Test//测试第五题
	public void studentTest2(){
		//System.out.println(new Student("可莉",18,"无关").showInfo3());
		System.out.println(new Student("香菱",18,"女","python").showInfo3());
	}
	@Test//测试第六题
	public void bookTest(){
		Book[] books = new Book[]{new Book("B001","《西游记》","吴承恩",24),
				new Book("B002","《红楼梦》","曹雪芹",14),
				new Book("B003","《三国演义》","罗贯中",-4),
				new Book("B004","《水浒传》","施耐庵",52)};
		for (Book book : books) {
			System.out.println(book.showInfo());//循环输出内容
		}
	}

}
