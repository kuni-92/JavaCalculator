package lib;

import interfaces.IWalker;

public class Dog extends Animal implements IWalker{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void bark(String sound) {
		System.out.println(sound);
	}

	@Override
	public void walk() {
		System.out.println("Dog walking.");
	}

}
