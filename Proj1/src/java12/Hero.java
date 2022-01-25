package java12;

public class Hero extends Character {
	 public Hero(String name) {
		 super(name);
	 }
	 
	 
	 public void attack(Monster m) {
		 System.out.println(m.name + "へヒーローの攻撃");
	 }
	 
		public void run() {
			System.out.println("ヒーロー" + this.name + "は逃げ出した。");
		}






}
