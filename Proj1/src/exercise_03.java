
public class exercise_03 {
    public static void main(String[] args) {
    	int weight = 69;
    	if (weight == 60) {
    		System.out.println("True");
    	}else {
    		System.out.println("false");
    	}
    	
    	int age1 = 20;
    	int age2 = 25;
    	if ((age1 + age2) * 2 > 60) {
    		System.out.println("True");
    	}
    	
    	int age = 3;
    	if (!(age % 2 == 0)) {
    		System.out.println("It's odd");
    	}else {
    		System.out.println("It's even");
    	}
    	
    	String name = "良樹";
    	if (name.equals("湊")) {
    		System.out.println(name + "です。"); 
    	}else {
    		System.out.println("Not 湊");
    	}
//    練習3-5
//    	System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更");
//    	
//    	int selected = new java.util.Scanner(System.in).nextInt();
//    	
////    	switch(selected) {
////    	case 1:
//    		System.out.println("検索します");
//    		break;
//    	case 2:
//    		System.out.println("登録します。");
//    		break;
//    	case 3:
//    		System.out.println("削除します");
//    		break;
//    	case 4:
//    		System.out.println("削除します");
//    	}
    	
//    	練習3-6
    	System.out.println("[数あてゲーム]");
    	
    	int ans = new java.util.Random().nextInt(9);
    	for (int i = 0; i < 5; i++) {
    		System.out.println("０〜９までの数字を入力してください");
    		int num = new java.util.Scanner(System.in).nextInt();
    		if (ans == num) {
    			System.out.println("当たり");
    			break;
    		}else {
    			System.out.println("違います");
    		}
    	}
    	System.out.println("ゲームを終了します。");
    }
}
