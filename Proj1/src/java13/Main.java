package java13;

public class Main {
	
	public static void main(String[] args) {
		
		Hero h = new Hero();
		Wizard w = new Wizard();
		
		h.setName("よしき");
		
		h.setHp(34);
		
		w.setName("魔法使いA");
		w.setMp(50);
		w.setHp(89);
		
		System.out.println(w.getHp() + "がMPです。");
		
	}
	

	

}
