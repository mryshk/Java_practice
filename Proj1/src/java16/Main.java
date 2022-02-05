package java16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	
	public static void main(String[] args) {
		
//		ArrayListの取り出し方が３種類ある。
//		通常for分と拡張for文、iteratorを使用する。
		
		ArrayList<Integer> grade  = new ArrayList<Integer>();
		ArrayList<Integer> points = new ArrayList<Integer>();
		
		grade.add(56);
		grade.add(45);
		grade.add(89);
		
		Iterator<Integer> iterator = grade.iterator();
		
		while(iterator.hasNext()) {
			Integer ok = iterator.next();
			System.out.println(ok);
		}
		
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
		
		System.out.println(points.get(0));
		
		for (int e : points) {
			System.out.println(e);
		}
		
		for (int i=0; i<points.size(); i++) {
			System.out.println(points.get(i));
		}
		
		Print.printList(names);
		
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("緑");
		
		for (String s : colors) {
			System.out.println(s + "→");
		}
		
		Set<String> words = new TreeSet<String>();
		
		words.add("dogs");
		words.add("animal");
		words.add("cat");
		
		for (String w : words) {
			System.out.print(w + "と");
		}
		
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府",255);
		prefs.put("東京都",1261);
		prefs.put("熊本県", 181);
		
		int Tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は"+ Tokyo);
		
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は" + value);
		}
		
		
	}


}
