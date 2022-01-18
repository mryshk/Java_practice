
public class Array {
	public static void main(String[] args) {
		
		int [] scores = new int[5];
		
		System.out.println(scores[3]);
	
		int num = scores.length;
		System.out.println(num);
		
		int [] age = {23,45,6,34,25};
		System.out.println(age[0]);
		
		String [] aiue = {"おk", "おk", "よしき","わかな"};
		System.out.println( "むろ" + " " + aiue[2]);
		
//		2次元配列
		int [][] scores02 = new int [2][3];
		
		scores02[0][0] = 40;
		scores02[0][1] = 50;
		scores02[0][2] = 60;
		
		scores02[1][0] = 80;
		scores02[1][1] = 70;
		scores02[1][2] = 60;
		
		System.out.println(scores02[1][1]);
		
		int [][] age02 = {{40,30,40,50,50}, {20,34,55,5,6,7,4}};
		System.out.println(age02[1][3]);
		
		
		int [] scores03 = {20,30,40,50,80};
		int count = 0;
		for (int i=0; i < scores03.length; i++) {
			if (scores03[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は" + count + "です。");
		
		int [] seq = new int[10];
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		for (int i=0; i<seq.length; i++) {
			char [] base = {'A', 'T', 'G','C'};
			System.out.println(base[seq[i]] + " ");
		}
		
//		拡張for文
		int [] scores04 = {30, 40, 50,20, 50,40,30};
		for (int value : scores04) {
			System.out.println(value);
		}
		

	}

}
