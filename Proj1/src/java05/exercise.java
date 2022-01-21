package java05;


public class exercise{
//	5-1 exercise
	public static void main(String[] args) {
		produceOneself();	
		email("挨拶","w@weee","こんにちは");
		email("ete@gmail.com", "おはよう");
	
		double result1 = calcTriangleArea(2.4,4.5);
		System.out.println("面積は" + result1);
		
		double result2 = calcCircleArea(3.5);
		System.out.println("円の面積は、" + result2);
	}
	
	public static void produceOneself(){
		String name = "よしき";
		int age = 25;
		double height = 180.2;
		char zordiac = '牛';
		
		System.out.println(name + age + height + zordiac);
	}
	
//	5-2 exercise

	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
//	5-3 exercise
	
//	オーバーロードを使用。引数の数が違うため同じメソッド名でも使用可能。
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
//	5-4 exercise
	
	public static double calcTriangleArea(double bottom,double height) {
		double result = (bottom * height) / 2;
		return result;
	}

	public static double calcCircleArea(double radious) {
		double result2 = radious * radious * 3.14;
		return result2;
	}
	
	
	
	
	
	
	
}