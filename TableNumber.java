import java.util.Scanner;

class TableNumber { 

public static void main(String args [] ){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter Natural number " ); 
	int number = scanner.nextInt();

		

	for(int i=1; i<=10;i++){ 
	System.out.println( number + " x " + i + " = " + number * i  );
}
	
	System.out.println("Loop finished");
	scanner.close();
}
}