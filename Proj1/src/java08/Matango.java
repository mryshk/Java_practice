package java08;

public class Matango {
	int hp;
	final int LEVEL = 10;
	char suffix;
	
	public void run() {
		System.out.println("おばけキノコは" + this.suffix + "逃げ出した。");
		hp -=100;
	}
	


}
