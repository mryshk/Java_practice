package java12;

public class Thief extends Character {
	
	 public Thief(String name) {
		 super(name);
	 }
	 
	 public void attack(Monster m) {
		 System.out.println("泥棒の攻撃");
	 }

		public void run() {
			System.out.println("泥棒" + this.name + "は逃げ出した。");
		}


}
