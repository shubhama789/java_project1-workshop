package lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Warranty {
public static void main(String[] args) {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter purcase date in format yyyy-MM-dd");
	String warranty = sc.nextLine();
	LocalDate ld = LocalDate.parse(warranty, formatter);
	System.out.println("Enter months before it warranty expires");
	int beforeWarranty = sc.nextInt();
	LocalDate ld1  = ld.plusMonths(beforeWarranty);
	System.out.println(ld1);
	System.out.println("years: "+ld1.getYear()+" Months : "+ld1.getMonth());
}
}