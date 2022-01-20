package java05;

public class overload{
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static String add(String x, String y) {
		return x + y;
	}
	
//	オーバーロードを使用している.
//	この場合は、データ型がすべて違うため、独立したメソッドとしてなりたっています。
	public static void main(String[] args) {
		System.out.println(add(10,20));
		
		System.out.println(add(2.3,3.4));
		
		System.out.println(add("こんにちは", "おはよう"));
		
		System.out.println(remove(60,40,5));
		
		System.out.println(remove(80,40));
		
	}
	
//	引数の数が違うパターン
//	この場合でも、違うメソッドとして（オーバーロード）活用することができる。
	public static int remove(int x, int y, int z) {
		return x - y -z;
	}
	public static int remove(int x, int y) {
		return x - y;
	}
}