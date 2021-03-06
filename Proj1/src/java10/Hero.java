package java10;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	
	public Hero() {
		System.out.println("Heroのコントラクタが動作");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5のダメージを与えた！");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した。");
	}

}
