package collectionsPack1;

import java.util.ArrayList;
import java.util.List;

public class studentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(2,"jhon"),new Student (101,"sing"),new Student(1,"song"));
		System.out.println(students);
		ArrayList<Student> studentsAl= new ArrayList(students);
		System.out.println(studentsAl);
		
	}

}
