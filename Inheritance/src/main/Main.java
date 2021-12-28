package main;

import interfaces.IWalker;
import lib.Animal;
import lib.Cat;
import lib.Dog;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Puppy");
		dog.bark("bow wow");

		Cat cat = new Cat("Tama");
		cat.bark("Mew ~");
		
		Animal[] animals = new Animal[] {dog, cat};
		for(Animal animal: animals) {
			animal.bark("yeah!");
		}

		IWalker[] walkers = new IWalker[] {dog, cat};
		for(IWalker walker : walkers) {
			walker.walk();
		}
	}

}
