package java09;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	
	public static void main(String[] args) {
		int baseUp= 25;
		Thief t = new Thief("アサカ" ,baseUp);
		System.out.println(baseUp  +":" + t.hp);
		
//		値渡しであるため、値を変更しても呼び出し元に影響はない。
		heal(baseUp);
//		クラス型の場合は、参照渡しであるため、呼び出し元への影響あり。
		heal(t);
		System.out.println(baseUp + ":" + t.hp);
	}
}
