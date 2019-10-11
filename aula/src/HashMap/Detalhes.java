package HashMap;

import java.util.HashMap;

public class Detalhes {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "Stack");
		hashMap.put(5, "Overflow");
		
		String str1 = hashMap.get(5);
		
		System.out.println(str1);
	}

}
