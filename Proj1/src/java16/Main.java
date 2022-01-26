package java16;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("たなか");
		names.add("あいざわ");
		names.add("すずき");
		
//		nameのリストに対する矢印(iterator)を作成する。
//		その矢印が挿せるだけ繰り返す。
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		System.out.println(names.get(1));
		
		points.add(23);
		points.add(34);
		points.add(25);
		
		System.out.println(points.get(2));
		
		for (int e : points) {
			System.out.println(e);
		}
		
		
	}


}
