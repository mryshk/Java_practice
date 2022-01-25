package java12;

public abstract class Monster {
	
	String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println("モンスターは逃げ出した。");
	}
	
	public abstract void sleep();
	

	

}
