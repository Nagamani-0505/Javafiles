package comparator;

import java.util.Comparator;

public class SortbyAddress implements Comparator<Student> {
	
	@Override
	public int compare(Student b1, Student b2) {
		
		return b1.address.compareTo(b2.address);
	}


}
