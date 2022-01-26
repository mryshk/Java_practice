package java14;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		
		h2.name = "ミナト";
		h2.hp = 100;
		
		if (h1.equals(h2)) {
			System.out.println("同じ内容です。");
			
		}else {
			System.out.println("違う内容です。");
		}
		
//		newせずともクラス型に対してメソッドを呼んでいる。＝　静的メソッド。
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		
		Hero h3 = new Hero();
		System.out.println(h3.money);
		
		Hero.money = 100;
		System.out.println(Hero.money);
		System.out.println(h2.money);
		
		h2.money = 300;
		
		System.out.println(h1.money);
	}

}
