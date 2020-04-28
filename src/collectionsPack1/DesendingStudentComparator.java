package collectionsPack1;

import java.util.Comparator;

public class DesendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student2.getId(), student1.getId());
	}
}
