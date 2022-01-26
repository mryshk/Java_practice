package java08;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが全回復しました。");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は、" + sec + "秒間点に祈った");
		
		int recover = new Random().nextInt(3) + sec;
		
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		
		this.mp += recoverActual;
		
		System.out.println("MPが" + recoverActual + "回復した。");
		
		
		System.out.println("MPが" + this.mp + "になりました。");
		return recoverActual;
	}

}
