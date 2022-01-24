package java11;

public class Main {
	
	public static void main(String[] args) {
		
		Book b = new Book("ok", 345, "black","9876");
		
		String b_isbn = b.getIsbn();
		
		System.out.println(b_isbn);
		
		Computer com = new Computer("mac",34565,"black","apple");
		
		String result = com.getMakerName();
		
		b.setWeight(75.7);
		
		System.out.println(result);
		
		System.out.println(b.weight);
		
		
		
	}

}
