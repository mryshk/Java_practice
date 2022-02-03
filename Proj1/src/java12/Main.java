package java12;

public class Main {
	
	public static void main(String[] args) {
//		Character c = new Wizard("yo");
//		
//		Matango m = new Matango("キノコ");
//		
//		c.attack(m);
//		
		Slime s = new Slime("スライム1"); Monster mo = new Slime("スライム2");
		Monster dragon = new Dragon("dragon~xys");
//		s.run();
//		mo.run();
//		dragon.run();
		
		Character[] c = new Character[5];
		
		c[0] = new Hero("田中");
		c[1] = new Hero("青木");
		c[2] = new Thief("steven");
		c[3] = new Wizard("yoshiki");
		c[4] = new Wizard("sibuya");

	
		for (Character ch :c ) {
			ch.run();
		}
		
		Hero hero = new Hero("yeah");
		Wizard wizard = new Wizard("魔法使い１");
		
		Hero hero2 = new Hero("yoshiki");
		Wizard wiz = new Wizard("wizard");
		
		hero.attack(dragon);
		wizard.attack(s);
		
		hero2.attack(dragon);
		wiz.fireball(dragon);
		
		Plant pl = new Care_plant("草");
		
		pl.care(wiz);
		pl.setName("草生えe");
		
		System.out.println("ようこそ" + pl.getName());
		
	}
	

	

}
