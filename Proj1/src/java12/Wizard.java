package java12;

public class Wizard extends Character{
	
	
	
	public Wizard(String name, int hp){
		super(name,hp);
	}
	
	public Wizard(String name) {
		super(name);
	}
	
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃" + m.name + "ヘ");
	}
	
	public void fireball(Monster m) {
		System.out.println(this.name + "の炎の攻撃");
	}
	
	public void run() {
		System.out.println("魔法使い" + this.name + "は逃げ出した。");
	}

}
