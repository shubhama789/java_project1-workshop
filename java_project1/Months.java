package java_project1;

public enum Months { Jan(31),Feb(28),Mar(31),Apr(30),May(31),Jun(30),Jul(31),Aug(31),Sep(30),Oct(31),Nov(30),Dec(31);
	int days;
	
	Months(int days){
		this.days = days;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
	
}
