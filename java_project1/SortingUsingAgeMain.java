package java_project1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingAgeMain {

	public static void main(String[] args) {
		
		ArrayList<Student> arrayListStudent = new ArrayList<Student>();
		Student student1 = new Student(1,"Sai RAm Charan",21);
		Student student2 = new Student(2,"Subham Agarwal",23);
		Student student3 = new Student(3,"sohan",20);
		Student student4 = new Student(4,"Prithvi",1);
		
		arrayListStudent.add(student1);
		arrayListStudent.add(student2);
		arrayListStudent.add(student3);
		arrayListStudent.add(student4);
		
		for(Student stdVar : arrayListStudent) {
			System.out.println(stdVar.name+" Age is "+stdVar.age+" years.");
		}
		
		System.out.println();
		System.out.println("After sorting through Age");
		System.out.println("----------------------------------");
		
		Collections.sort(arrayListStudent);
		
		for(Student stdVar : arrayListStudent) {
			System.out.println(stdVar.name+" Age is "+stdVar.age+" Years.");
		}
		
	}
}
