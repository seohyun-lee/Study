package week10;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> jmap = new HashMap<>();
		jmap.put("apple", 97);
		jmap.put("banana", 98);
		jmap.put("citron", 100);
		jmap.put("dazzling", 96);
		System.out.println(jmap.size());
		Set<String> keys = jmap.keySet();
		Iterator<String> it = keys.iterator(); //Collections
		while(it.hasNext()) {
			String name = it.next();
			Integer score = jmap.get(name); //key로 접근함.
			System.out.println(name+": "+score);
		}
	}

}
