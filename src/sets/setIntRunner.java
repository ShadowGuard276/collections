package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setIntRunner {

	public static void main(String[] args) {
		List<Integer> integers = List.of(114,397,97,224,634,852,971);
		
		Set<Integer> treeSet =new TreeSet<>(integers);
		System.out.println("TreeSet" + treeSet);
		Set<Integer> linkedHashSet = new LinkedHashSet<>(integers);
		System.out.println("LinkedHashSet"+ linkedHashSet);
		Set<Integer> hashSet =new HashSet<>(integers);
		System.out.println("HashSet"+ hashSet);
		
	}

}
