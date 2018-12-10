package java_project1;
//import static java.lang.Math.*;

public class Box {
		double width;
		double height;
		double length;
		//static int count=0;
		
	
		//public Box() {
			//this(20);
			//count++;
			//super();
			//System.out.println("count in 0p constructor is: "+count);
			// TODO Auto-generated constructor stub
		//}
		
		
		
		public Box(double width, double height, double length) {
			super();
			//count++;
			this.width = width;
			this.height = height;
			this.length = length;
			//System.out.println("3 parameter constructor");
		}
		



		//public Box(double width) {
			//super();
			
			//this(width,30,50);
			//count++;
			//System.out.println("1parameter constructor");
			//this.width = width;
			//System.out.println("Instance value of Width of box is: "+this.width);
			//System.out.println("Instance value of Width of box is: "+this.width);
		//}



		 double volume() {
			return width*height*length;
			//System.out.println(sqrt(2));
			//return 2;
		}

		
}
