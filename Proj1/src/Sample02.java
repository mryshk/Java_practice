public class Sample02 {
	public static void main(String[] args) {
		float weight;
		weight = 67.5F;
		
		System.out.println("My weight is" + " " + weight + "kg");
		
		
	    int age = 22;
	    System.out.println("私の年齢は" + age);
//	    変数の置き換え。
	    age = 25;
	    System.out.println("...いや、本当の年齢は" + age + "です。");
	
//	   定数利用 定数はfinal型を使用する。
	    
	    final double PI = 3.14;
	    int pie = 5;
	    
	    System.out.println("半径" + pie + "cmのパイの面積は");
	    System.out.println(pie * pie * PI);
	    
	    
	    boolean isError = false;
	    
	    System.out.println("エラーですか？" + isError);
	    
	    System.out.println("私の好きな文字は二重引用符 (\")です。");
	    
	    int a;
	    a = 100;
	    a ++ ;
	    System.out.println(a);
	    
//	    データ型の強制変換
	    int age01 = (int)3.2;
	    System.out.println(age01);
//	    異なる型同士の計算
	    
	}
}