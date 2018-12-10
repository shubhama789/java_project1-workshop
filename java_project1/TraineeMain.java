package java_project1;

public class TraineeMain {

	public static void main(String[] args) {
		
		
		
		
		Trainee trainee[] = new Trainee[3];
		trainee[0] = new Trainee(166166,"Adit",20000);
		trainee[1] = new Trainee(166176,"Subham",20000);
		trainee[2] = new Trainee(166177,"Sohan",20000);
		for(int i=0;i<trainee.length;i++) {
			System.out.println(trainee[i].empId);
		}
		
		
		
	}
}
