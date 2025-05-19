package collectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		TreeMap <String , Object>   hash = new TreeMap<>();
		
		hash.put("name", "Priya");
		hash.put("PersonName", "Priya");
		hash.put("InstituteName", "Oranium");
		hash.put("InstituteName", "Fabevy");
		hash.put("age", 23);
		hash.put("result", true);
		hash.put("decimalNumber", 12.34);
		hash.put("gender", 'f');
		hash.put("percentage", null);
		
		System.out.println(hash);
		
		
		System.out.println(hash.size());

		Set<String> keySet = hash.keySet();
		System.out.println("--keys--");
		for( String   data : keySet) {
			System.out.println(data);
		}
		
		System.out.println("--Values--");
		Collection<Object> values = hash.values();
		for( Object   data : values) {
			System.out.println(data);
	    }
		
		
		Set<Entry<String, Object>> entrySet = hash.entrySet();
		
		System.out.println("--entry--");
		for(Entry<String, Object> data : entrySet) {
			System.out.println(data);
		}
		
		
		System.out.println(hash.get("gender"));
	}
}
