package lib;

public abstract class Animal {
	
	public String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public abstract void bark(String sound);

	public abstract void walk();
}
