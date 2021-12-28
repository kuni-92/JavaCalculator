package lib;

public class Animal {
	
	public String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public void bark(String sound) {
		System.out.println(name + " : " + sound);
	}
	
	public void walk() {
		System.out.println(name + " : " + "walking.");
	}
}
