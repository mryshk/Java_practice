package java05;

public class Return {
	
// 戻り値。呼び出して受け取るメソッド（メイン）があり。
//	特定の作業を行い、呼び出し元へ戻すメソッドがある。
//	その戻す値のことを戻り値をいいます。
	
//	public static int add(int x , int y) {
//		int ans = x + y;
//		return ans;
//	}
	
//	public static int remove(int s, int j) {
//		int num = s - j;
//		return num;
//	}
	
//	データ型　＋　変数名　＝　メソッド名（引数リスト）
//	右辺にメソッド名を持っていく事を忘れずに！
	public static void main(String[] args) {
//		int ans = add(100,10);
//		System.out.println("100 + 10 =" + " " +  ans);
		
		System.out.println(add(add(10,20),add(30,40)));
		
		System.out.println(remove(remove(40,30),remove(50,45)));
		
//		int num = remove(100, 10);
//		System.out.println("100 - 10 =" + " " + num);
	}
	
//　変数を利用せずにそのまま使用する。
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static int remove(int s, int j){
		int num = s - j;
		return num;
	}

}


