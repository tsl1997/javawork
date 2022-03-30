package cn.k2502;

public class TestPerson {
	public static void main(String[] args) throws Exception{
		Person p = new Person();
		p.setName("哆啦A梦");
		try {
			p.setAge(500);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
		p.setSex('男');
	}

}
