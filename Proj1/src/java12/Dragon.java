package java12;

public class Dragon extends Monster {
	
	
	public Dragon(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("ドラゴンが逃げた。");
	}
	
	public void sleep() {
		System.out.println("寝ました。");
		
	}

	
}
