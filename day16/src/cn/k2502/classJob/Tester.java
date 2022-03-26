package cn.k2502.classJob;

public class Tester {
	public static void main(String[] args) {
		Company company = new Company();
		Person person=company.findPerson("李信");
		if(person instanceof Men){//判断对象类型
			System.out.println(((Men)person).smoking());
		}else{
			System.out.println(((Woman)person).buy());
		}

	}
}
