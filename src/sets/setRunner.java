package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setRunner {

	public static void main(String[] args) {
		List<Character> characters =List.of('a', 'c','b','z','c','z');
		//unique- set
		/*Treeset
		 * Hashset
		 * LinkedHashset
		 */
		Set<Character> treeset = new TreeSet<>(characters);
		System.out.println("treeset"+ treeset);
		Set<Character> linkedHashset = new LinkedHashSet<>(characters);
		System.out.println("linkedhashset"+ linkedHashset);
		Set<Character> hashSet =new HashSet<>(characters);
		System.out.println("Hashset"+ hashSet);
		
	}

}
