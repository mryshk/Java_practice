package java11;

public abstract class Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した。");
	}
	
//	未詳細メソッド　≒ abstract 抽象メソッドという。
	public abstract void attack(Matango m);
		

}
