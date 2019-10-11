package arraylist;

import java.util.ArrayList;

public class Detalhes {
		
		public static void main(String[] args) {
			
			ArrayList<String> lista = new ArrayList<>();
			
			lista.add("Stack");
			lista.add("Overflow");
			
			
			String str1 = lista.get(0);
			
			System.out.println(str1);
		
			System.out.println("------------");
			
			for(String str : lista) {
				System.out.println(str);
			}
	}

}
