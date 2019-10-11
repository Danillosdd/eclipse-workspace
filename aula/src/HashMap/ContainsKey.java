package HashMap;

import java.util.Map;
import java.util.HashMap;

public class ContainsKey {

	public static void main(String[] args) {

		Map<Long, String> example0 = new HashMap<Long, String>();
		
		example0.put(123333333333434L, "V1");
		
		
		Map<String, String> example = new HashMap<String, String>();
		
		example.put("K1", "V1");
		example.put("K2", "V1");
		example.put("K3", "V3");
		example.put("K4", "V4");
		example.put("K5", "V5---");
		example.put("K5", "V5ss");
		
		//String keytoSearch = example.get("K1");
		
		String keytoSearch = "K1";
		
		if (example.containsKey(keytoSearch)) {
			System.out.println("Valor da Chave " + keytoSearch + " = " + example.get(keytoSearch));
			
		} else {
			
			System.out.println("Chave não existe");
		}

	System.out.println("------------");
		
	for(String key : example.keySet()) {
		
		String value = example.get(key);
		System.out.println(key + " = " + value);
	}
	
	}

}
