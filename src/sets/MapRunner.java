package sets;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awsom occasion. This has never happen before.";
		Map<Character,Integer> occurences= new HashMap<>();
		char[] characters =str.toCharArray();
		for(char character:characters) {
			Integer integer =occurences.get(character);
			if(integer==null) {
				occurences.put(character, 1);
			}
			else {
				occurences.put(character, integer+1);
				}
		
	}
		System.out.println(occurences);

	Map<String,Integer> stringOccurences= new HashMap<>();
	String[] words=str.split(" ");
	for(String word:words) {
		Integer integer =stringOccurences.get(word);
		if(integer==null) {
			stringOccurences.put(word, 1);
		}
		else {
			stringOccurences.put(word, integer+1);
			
		}
	}
	System.out.println(stringOccurences);
	}
}
