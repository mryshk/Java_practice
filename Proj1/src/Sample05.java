
public class Sample05 {
   public static void main(String[] args) {
//	   System.out.println("あなたの運勢を占います。");
//	   int fortune = new java.util.Random().nextInt(4);
////	   switch文
//	   switch(fortune) {
//	   case 1:
//		   System.out.println("大吉");
//		   break;
//	   case 2:
//		   System.out.println("中吉");
//		   break;
//	   case 3:
//		   System.out.println("小吉");
//		   break;
//	   case 4:
//		   System.out.println("吉");
//		   break;
//	   default:
//		   System.out.println("凶");
//			  
//	   }
	   
//	   while文
	int temp = 30;
	while (temp > 25) {
		temp --;
		System.out.println("温度を1下げました。");
	}
	
//	do~while文
	int temp01 = 30;
	do {
		temp01 --;
		System.out.println("温度を１度下げました。");
	} while (temp01 > 25);
	
//	for文
	for (int i = 0; i < 10; i++) {
		System.out.println("こんにちは");
	}
	
	for (int n = 6; n < 12; n+=2) {
		System.out.println("こんばんは");
	}
	
	for (int result = 0; result < 4; result++) {
		System.out.println("現在は" + (result + 1) + "周です。");
	}
	
//	for文の入れ子構造
	
	for (int a = 1; a < 10; a++) {
		for (int b = 1; b < 10; b++) {
			System.out.print(a*b);
			System.out.print(" ");
		}
	System.out.println("");
	}
	
   }
}
