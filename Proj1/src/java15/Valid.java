package java15;

public class Valid {
	
	String name;
	
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{8}");
	}

}
