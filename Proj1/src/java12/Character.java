package java12;

public abstract class Character {
	String name;
	int hp;
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public Character(String name) {
		this.name = name;
		this.hp = 100;
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した。");
	}
	
	public abstract void attack(Monster m);

}