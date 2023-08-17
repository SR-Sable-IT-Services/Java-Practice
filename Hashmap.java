import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		String str = "Sanjay";
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		System.out.println("Character Count in the string: " + charCountMap);
	}
}