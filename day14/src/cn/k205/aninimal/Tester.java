package cn.k205.aninimal;

public class Tester {
	public static void main(String[] args) {
		AnimalAdmin animalAdmin = new AnimalAdmin();
		animalAdmin.letToEat(new Dog());
		animalAdmin.letToEat(new Pig());
		animalAdmin.letToEat(new Yang());

		animalAdmin.letToShout(new Dog());
		animalAdmin.letToShout(new Pig());
		animalAdmin.letToShout(new Yang());

		animalAdmin.JD(new Dog());
		animalAdmin.JD(new Pig());

	}
}
