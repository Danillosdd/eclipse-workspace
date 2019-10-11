package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("AA");
		arrayList.add("ZZ");
		arrayList.add("CC");
		arrayList.add("FF");
		
		
		System.out.println("-----");
		
		System.out.println("Before Sorting: ");
		
		for(String str: arrayList) {
			
			System.out.println(str);
		}
		
		Collections.sort(arrayList, Collections.reverseOrder());
		
		System.out.println("-----");
		
		System.out.println("ArrayList in descending order:");
		
		for(String str : arrayList) {
			
			System.out.println(str);
		}
	}

}
