package java_project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingUsingStringMain {

	public static void main(String[] args) {
		
		ArrayList<StudentNew> arrayListStudent = new ArrayList<StudentNew>();
		
//		StudentNew student1 = new StudentNew(1,"Sai RAm Charan",21);
//		StudentNew student2 = new StudentNew(2,"Subham Agarwal",23);
//		StudentNew student3 = new StudentNew(3,"sohan",20);
//		StudentNew student4 = new StudentNew(4,"Prithvi",1);
//		
//		arrayListStudent.add(student1);
//		arrayListStudent.add(student2);
//		arrayListStudent.add(student3);
//		arrayListStudent.add(student4);
		
	
	
		arrayListStudent.add(new StudentNew(1,"Sai RAm Charan",21));
		arrayListStudent.add(new StudentNew(3,"sohan",20));
		arrayListStudent.add(new StudentNew(2,"Subham Agarwal",23));
		arrayListStudent.add(new StudentNew(4,"Prithvi",1));
		
		for(StudentNew stdVar : arrayListStudent) {
			System.out.println(stdVar.name+" Age is "+stdVar.age+" Years.");
		}
		
			System.out.println();
			System.out.println("After sorting through Name");
			System.out.println("----------------------------------");
			
			
		Collections.sort(arrayListStudent,new nameComparator());
		Iterator<StudentNew> iterator = arrayListStudent.iterator();
		
		
		while(iterator.hasNext()) {
			StudentNew st = iterator.next();
			System.out.println(st.name+" Age is "+st.age+" Years.");
		}

	
		}
		
	}

	

