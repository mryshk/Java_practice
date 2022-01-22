package java10;

public class PoisonMatango extends Matango {
	
	int poisonCount = 5;
	
//	親のコントラクタをsuperで呼んでいる。
//	結局superは呼ぶ必要があるから。
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
//		superによって親クラスのattackメソッドを呼んでいる。
//		いちいち記述する面倒がなくなるし、訂正も親クラス１つで治るよ！
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒をばら撒いた");
			int dmg = h.hp / 5;
			System.out.println(dmg + "のダメージを与えた");
			h.hp -= dmg;
			poisonCount--;
		}
	}

}
