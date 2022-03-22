package show.helloworld.test;
import org.junit.Test;
import show.helloworld.Employee;

public class Tester {
	@Test
	public void employee(){
		Employee e1 = new Employee("李佛摩尔","交易员",100000000,"l@a.com");
		System.out.println(e1.showInfo());
	}

}
