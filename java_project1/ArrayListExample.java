package java_project1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Subham");
		arrayList.add("Sohan");
		arrayList.add("Subham");
		
		System.out.println(arrayList);
		System.out.println(arrayList.get(1));
		
		ArrayList arrayList1 = new ArrayList();
		arrayList1.add("Subham");
		arrayList1.add("Sohan");
		arrayList1.add(12);
		arrayList1.add('c');
		System.out.println(arrayList1);
		Collections.sort(arrayList1);
		System.out.println(arrayList1);
	}
	
}
