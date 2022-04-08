package classJob;

import java.util.HashSet;
import java.util.Iterator;

public class Tester2 {
	public static void main(String[] args) {
		HashSet<Person> people = new HashSet<>();
		people.add(new Person("10086","中国移动"));
		people.add(new Person("10010","中国联通"));
		people.add(new Person("10086","中国移动MAX"));
		Iterator<Person> it = people.iterator();
		while(it.hasNext()){
			Person n = it.next();
			System.out.println(n.getID()+"\t"+n.getName());
		}
	}
}
