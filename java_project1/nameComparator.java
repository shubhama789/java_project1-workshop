package java_project1;

import java.util.Comparator;

public class nameComparator implements Comparator<StudentNew>{

	@Override
	public int compare(StudentNew o1, StudentNew o2) {
		// TODO Auto-generated method stub
		StudentNew newStudent1 = o1;
		StudentNew newStudent2 = o2;
		
		return newStudent1.name.compareTo(newStudent2.name);
	}



	
}
