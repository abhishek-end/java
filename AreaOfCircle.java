import java.util.Scanner;

class AreaOfCircle { 

public static void main(String args []) {

Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the radius of the circle");
	double radius= scanner.nextInt();
	double area = 2 * Math.PI * radius ;
	double circumferece = Math.PI * radius * radius ;
	System.out.println("Area of circle is " + area ); 
	System.out.println("Area of circumferece is " + circumferece ); 
} 
}