package java12;

public class Slime extends Monster {
	
	String name = "スライム";
	
	public Slime(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("スライムはさささッと逃げ出した。");
	}
	
	public void attack() {
		System.out.println("アタック");
	}
	
	public void sleep() {
		System.out.println("寝ます");
	}

}
