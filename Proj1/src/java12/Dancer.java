package java12;

public class Dancer extends Character {
	public void dance() {
		System.out.println(this.name + "が踊った");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println(m.name + "に３ポイントのダメージ");
		m.hp -= 3;
		
	}

	
}
