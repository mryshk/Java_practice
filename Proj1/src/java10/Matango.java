package java10;

public class Matango {
//	int hp = 50;
//	final int LEVEL = 10;
//	char suffix;
//	
//	public void run() {
//		System.out.println("おばけキノコは" + this.suffix + "逃げ出した。");
//		hp -=100;
//	}
	
	int hp = 50;
	char suffix;
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
	


}
