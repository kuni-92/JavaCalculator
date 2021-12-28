package lib;

import interfaces.IWalker;

public class Cat extends Animal implements IWalker{

	public Cat(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void bark(String sound) {
		System.out.println(sound);
	}

	@Override
	public void walk() {
		System.out.println("Cat walking.");
	}

}
