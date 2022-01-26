package java17;

import java.io.FileWriter;


public class Main {
	
	public static void main(String[] args) {
		
//		try {
//			FileWriter fw = new FileWriter("/Users/yoshikimuro/Desktop/text.txt");
//		}catch (IOException e){
//			System.out.println("エラー:" + e.getMessage());
//		}catch(NullPointerException e) {
//			System.out.println("nullだよ");
//		}
		
		try {
			FileWriter fw = new FileWriter("/Users/yoshikimuro/Desktop/text.txt");
			fw.write("hello");
			fw.close();
			
		}catch(Exception e) {
			System.out.println("何らかのエラーがおきました。");
		}
		
		
		
	}

}
