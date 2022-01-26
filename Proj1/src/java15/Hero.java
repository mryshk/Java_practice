package java15;

public class Hero {
	
	private String name;
	private int hp;

	
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
