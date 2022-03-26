package cn.k2502.classJob;

public class Company {
	/**找人*/
	public Person findPerson(String name) {
		Person[] people = new Person[2];
		people[0]=new Men("李信",23);
		people[1]=new Woman("上官婉儿",18);
		for (Person person : people) {
			if (person.getName().equals(name)){
				return person;
			}
		}
		return null;
	}
}
