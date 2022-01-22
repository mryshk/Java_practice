package java10;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
//		h.run();
////		SuperHero sh = new SuperHero();
////		sh.run();
//		
//		SuperHero sh = new SuperHero();
//		
//		Weapon w = new Weapon();
//		System.out.println(w.name + w.price);
		
		PoisonMatango pm = new PoisonMatango('C');
		
		pm.attack(h);
		System.out.println(h.hp);
		System.out.println(pm.poisonCount);
	}


}
