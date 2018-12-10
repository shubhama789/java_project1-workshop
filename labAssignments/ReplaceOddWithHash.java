package labAssignments;

public class ReplaceOddWithHash {
	
	public void replaceOddWithHash(String newString) {

	char[] newString1 = newString.toCharArray();
	for(int i=1;i<newString.length();i=i+2) {
		newString1[i]='#';
	}
	newString = String.valueOf(newString1);
	System.out.println("String after replacing odd positions character with # is : "+newString);
	
	}
	
}
