package java14;

public class Hero {
	String name;
	int hp;
	static int money;
	
	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}
	
//	newをせずともメソッドを呼び出せる。
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}

}
