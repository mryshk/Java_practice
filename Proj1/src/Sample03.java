public class Sample03 {
	public static void main(String[] args) {
//		System.out.print は改行しない。
		String name = "Muro";
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.println("です。");
		
		
		int a = 3;
		int b = 5;
		
		int m = Math.max(a, b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きい方は" + m + "です。" );
		
		String age = "25";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年" + (n+1) + "歳になりますね。");
		
		int r = new java.util.Random().nextInt(80);
		System.out.println("あなたはたぶん" + r + "際ですね。");
		
////		入力を受け取る命令(Int)
//		int input = new java.util.Scanner(System.in).nextInt();
//		System.out.println("数字は" + input + "ですね。");
////      入力を受け取る命令(String)
//		
//		String s = new java.util.Scanner(System.in).nextLine();
//		System.out.println("入力した文字は" + s + "です。");
		
		
		int x = 5;
		int y = 3;
		String ana = "x+yは" + (x * y);
		System.out.println(ana);
		
		String s = 2 + "oo";
		System.out.println(s);
		
		double t = 3 + 5.0;
		System.out.println(t);
		
		
	}
}