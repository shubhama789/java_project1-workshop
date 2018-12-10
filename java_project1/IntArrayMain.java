package java_project1;

import java.util.Arrays;

public class IntArrayMain {

	public static void main(String[] args) {
		
		int intArray[] = {2,7,5,15,4,9};
		int intArray1[] = {2,7,5,15,4,9};
		//int sum=0;
		String unSorted = "";
		for(int value:intArray)
		{
			System.out.print(value+",");
			unSorted +=value+" "; 
		}
		System.out.println();
		Arrays.sort(intArray);
		String sorted = "";
		for(int value:intArray)
		{
			System.out.print(value+",");
			sorted+=value+" ";
		}
		System.out.println();
		int index = Arrays.binarySearch(intArray,9);
		
		System.out.println("The value 9 is stored in IntArray at index : "+index);
		
		int[] arrayCopy = Arrays.copyOf(intArray, 2);
		System.out.println("First 2 elements are: ");
		for(int value:arrayCopy)
		{
			System.out.println(value);
		}
		//Arrays.sort(intArray1);
		System.out.println("Sorted array of "+unSorted+": ");
		for(int value:intArray1)
		{
			System.out.print(value+" ");
		}
		
		System.out.println();
		
		
		Arrays.sort(intArray1,1,4);
		
		System.out.println("Sorted array of "+unSorted+" from index 2 to 4 is : ");
		for(int value:intArray1)
		{
			System.out.print(value+" ");
		}
		
	}
}
