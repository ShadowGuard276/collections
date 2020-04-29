package genrics;

public class GenricsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("chicken");
		list.addElement("mutton");
		String value =list.get(0);
		System.out.println(list);
		System.out.println(value);
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(30));
		list2.addElement(Integer.valueOf(75));
		Integer num =list2.get(0);
		System.out.println(list2);
		System.out.println(num);
		
		
	}

}
