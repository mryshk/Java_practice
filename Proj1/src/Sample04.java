
public class Sample04 {
    public static void main(String[] args) {
    	String str = "月";
    	if (str.equals("夕日")) {
    		System.out.println("正解です！");
    	}
    	else if(str.equals("太陽")) {
    		System.out.println("こちらは太陽です");
    	}
    	else {
    		System.out.println("なんでもないよう");
    	}
    	
//    	javaのif文　条件分岐。
    	int a = 3;
    	if (!(a == 3)) {
    		System.out.println("正解だよー");
    	}
    	else {
    		System.out.println("間違いですよー");
    	}
    	
    	int r = new java.util.Random().nextInt(4);
    	if (r == 1) {
    		System.out.println("１です。");
    	}
    	else if (r == 2) {
    		System.out.println("２です。");
    	}
    	else if (r == 3) {
    		System.out.println("３です。");
    	}
    	else if (r == 4) {
    		System.out.println("４です。");
    	}
    	else {
    		System.out.println("なにかな？");
    	}
    }
}
