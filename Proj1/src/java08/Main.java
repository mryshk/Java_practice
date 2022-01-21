package java08;

public class Main {
   public static void main(String[] args) {
	   Hero h = new Hero();
	   h.name ="ミナト";
	   h.hp = 100;
	   System.out.println("勇者" + h.name + "を生み出しました。");
	   
	  
	   Matango m = new Matango();
	   
	   m.suffix = 'A';
	   m.hp = 100;
	   
	   System.out.println("キノコ" + m.suffix + "が現れた。");
	   
	   Matango m2 = new Matango();
	   
	   m2.hp = 48;
	   m2.suffix = 'B';
	   
	   System.out.println("キノコが" + m2.suffix + "が現れた。");
	   
	   h.slip();
	   h.slip();
	   m.run();
	   h.sit(10);
	   m2.run();
	   h.run();
	   
	   Cleric c = new Cleric();
	   
	   c.selfAid();
	   c.pray(4);
   }
}
