package java12;

public class Wizard extends Character{
	
	
	
	public Wizard(String name, int hp){
		super(name,hp);
	}
	
	public Wizard(String name) {
		super(name);
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "の炎の攻撃");
	}

}
