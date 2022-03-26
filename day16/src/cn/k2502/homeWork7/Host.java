package cn.k2502.homeWork7;
/**这是一个主人类*/
public class Host {
	public Animal donateAnimal(Animal animal) {
		if (animal instanceof Dog){
			return (Dog)animal;//向下转型
		}
		if (animal instanceof Cat){
			return (Cat)animal;
		}
		return null;
	}
}
