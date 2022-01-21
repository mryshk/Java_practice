package java05;

public class arguments_array {
//	public static void main(String[] args) {
//		int[] array = {1,2,3};
//		printArray(array);
//	}
//	
//	public static void printArray(int[] ar) {
//		
//		for (int element: ar) {
//			System.out.println(element);
//		}
//		
//	}
	
//	配列の参照渡し。
//	呼び出し先で加えた変更が呼び出し元にも影響するようになる。
//	理由は、配列は値渡しではなく実在する配列を参照する形であるから。
	
//	public static void main(String[] args){
//		int [] array = {1,2,3};
//		incArray(array);
//		
//		for (int i : array) {
//			System.out.println(i);
//		}
//		
//	}
//	
//	public static void incArray(int [] array) {
//		for (int i=0; i <array.length; i++) {
//			array[i]++;
////		}
//	
//		
//
//	}
//	
	
//	戻り値に配列を用いる場合
//　呼び出し元
	public static void main(String[] args) {
		int [] array = makeArray(5);
		
		for(int i : array) {
			System.out.println(i);
		}
	}
//	呼び出し先
	public static int [] makeArray(int size) {
		int [] newArray = new int[size];
		
		for (int i=0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	
	
}