package java12;

public class Care_plant extends Plant {

	public Care_plant(String name) {
		super(name);
	}
	
	public void care(Character c) {
		c.hp = 100;
		System.out.println(c.name + "は回復した。");
		System.out.println(c.name + "のHPは" + c.hp + "になった。");
	}
	
}
