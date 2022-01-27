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
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("data.txt");
//			fw.write("hello");
//			System.out.println("うまくいきました");
//			
//		}catch(Exception e) {
//			System.out.println("何らかのエラーがおきました。");
//		}finally {
//			if (fw != null) {
//				try {
//					fw.close();
//				}catch(IOException e){
//					;
//				}
//			}
//			
//		}
		
//		try()によってfinalyが自動適用される。
		try (FileWriter fw = new FileWriter("data.txt");){
			fw.write("Hello");
		}catch(Exception e) {
			System.out.println("何らかのエラーがおきました。");
		}
		
		
		
	}

}
