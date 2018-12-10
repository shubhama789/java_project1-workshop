package labAssignments;

public class RemoveDuplicate {
	
	public void removeDuplicate(String newString) {

		char[] newString1 = newString.toCharArray();
		for(int i=0;i<newString.length();i++) {
			//newString1[i]='#';
		}
		newString = String.valueOf(newString1);
		System.out.println("String after replacing odd positions character with # is : "+newString);
		
		}

}
