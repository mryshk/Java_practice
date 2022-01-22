package java08;

public class Main {
   public static void main(String[] args) {
//	   Hero h = new Hero();
//	   h.name ="ミナト";
//	   h.hp = 100;
//	   System.out.println("勇者" + h.name + "を生み出しました。");
//	   
//	  
//	   Matango m = new Matango();
//	   
//	   m.suffix = 'A';
//	   m.hp = 100;
//	   
//	   System.out.println("キノコ" + m.suffix + "が現れた。");
//	   
//	   Matango m2 = new Matango();
//	   
//	   m2.hp = 48;
//	   m2.suffix = 'B';
//	   
//	   System.out.println("キノコが" + m2.suffix + "が現れた。");
//	   
//	   h.slip();
//	   h.slip();
//	   m.run();
//	   h.sit(10);
//	   m2.run();
//	   h.run();
//	   
//	   Cleric c = new Cleric();
//	   
//	   c.selfAid();
//	   c.pray(4);
	   
//	   Sword s = new Sword();
//	   s.name ="炎の剣";
//	   s.damage = 10;
//	   
//	   Hero h = new Hero();
//	   h.name = "ミナト";
//	   h.hp = 100;
//	   h.sword = s;
//	   
//	   System.out.println("現在の武器は、" + h.sword.name);
//	   
//	   Hero h1 = new Hero();
//	   h1.name = "ミナト";
//	   h1.hp = 100;
//	   
//	   Hero h2 = new Hero();
//	   
//	   h2.name = "アサカ";
//	   h2.hp = 100;
//	   
//	   Wizard w = new Wizard();
//	   w.name ="スガワラ";
//	   w.hp = 100;
//	   
//	   w.heal(h1);
//	   w.heal(h2);
//	   w.heal(h2);
	   
	   Hero h = new Hero("ミナト");
	   System.out.println(h.hp);
	   System.out.println(h.name);
	  
	   Hero h2 = new Hero();
	   System.out.println(h2.name + h2.hp);
	   
   }
}
