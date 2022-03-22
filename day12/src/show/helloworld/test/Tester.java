package show.helloworld.test;
import org.junit.Test;
import show.helloworld.Employee;
import show.helloworld.Person;

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
		Person p1 = new Person();
		System.out.println(p1.showInfo());
		Person p2 = new Person("明日酱",12);
		System.out.println(p2.showInfo());
		Person p3 = new Person("江户川柯南",10,"小男孩");
		System.out.println(p3.showInfo());

	}

}
