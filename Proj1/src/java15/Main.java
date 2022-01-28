package java15;

public class Main {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "Java and Javascript";
		String s5 = "abc,def:ghi";
		
		
		Valid va = new Valid();
		
		va.name = "A090923OD";
		
		if (va.isValidPlayerName(va.name)) {
			System.out.println("OK");
		}else {
			System.out.println("No");
		}
		
		
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		
		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ正しい。");
		}
		
		System.out.println("s1の長さは"+ s1.length()+"です。");
		
		if (s1.isEmpty()) {
			System.out.println("s1は空白です。");
		}
		
		if (s4.contains("Java")) {
			System.out.println("Javaを含んでいます。");
		}
		
		if (s4.indexOf("Java") == 0) {
			System.out.println("あ");
		}
		
		if (s4.endsWith("Javascript")) {
			System.out.println("い");
		}
		
		String[] words = s5.split("[,:]");
		
		for (String w : words) {
			System.out.print(w + "->");
		}
		
		String re = s5.replaceAll("[bcf]", "X");
		System.out.println(re);
		
		String rep = s4.replaceAll("[a]", "A");	
		System.out.println(rep);
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for (int i= 0; i<100; i++) {
			sb.append("java");
		}
		String s = sb.toString();
		
		System.out.println(s);
		
		Hero h1 = new Hero();
		if (h1.isValidPlayerName("A0980000")) {
			System.out.println("OKです");
		}
		
	}
	

}
