package java05;

public class Method {
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します。");
//		hello();
//		System.out.println("メソッドの呼び出しが終わりました。");
//	}
//	
//	public static void hello() {
//		System.out.println("湊さん、こんにちは");
//	}
	
//	呼び出す順番は必ず「mainメソッド」が一番最初！
	
//	public static void MethodA() {
//		System.out.println("MethodA");
//		MethodB();
//	}
//	public static void MethodB() {
//		System.out.println("MethodB");
//	}
//	
//	public static void main(String[] args) {
//		MethodA();
//	}
	
//	引数を渡す場合（単数）
	
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出しています。");
//		hello("湊");
//		hello("朝香");
//		hello("菅原");
//		System.out.println("メソッドの呼び出しが終わりました。");
//	}
//	public static void hello(String name) {
//		System.out.println(name + "さん、こんにちは");
//	}
	
//	引数を渡す場合（複数）
	
	public static void main(String[] args) {
		add(100,20);
		add(200,50);
	}
	
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
	
	
	
}
