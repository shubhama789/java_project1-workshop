package java_project1;

public class Student implements Comparable<Student>{
	
	 int rollNumber;
	 String name;
	int age;
	
	public Student(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(age==o.age)
		return 0;
		else if(age>o.age) {
			return 1;
		}
		else
			return -1;
		
		}
	}
	
