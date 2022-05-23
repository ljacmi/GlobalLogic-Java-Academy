package program;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		String s = args[0];
		int length = s.length();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i < length; i++) {
			char c =  s.toLowerCase().charAt(i);
			Integer current = map.get(c);
			if(current == null) {
				map.put(c, 1);
			} else {
				map.put(c, current + 1);
			}
		}
		
		map.entrySet().stream()
		
		.sorted(new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(java.util.Map.Entry<Character, Integer> o1, java.util.Map.Entry<Character, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		})
		
		.forEach(new Consumer<Map.Entry<Character, Integer>>() {
			@Override
			public void accept(Map.Entry<Character, Integer> t) {
				System.out.println(t.getKey() + " = " + t.getValue());
				return;	
			}
		});
		
			

	}

}
