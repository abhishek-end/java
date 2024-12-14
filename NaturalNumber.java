import java.util.Scanner;

class NaturalNumber { 

public static void main(String args [] ){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter Natural number " ); 
	int number = scanner.nextInt();
	int sum = 0;
	for(int i=1; i<=number;i++)
{ 
	System.out.println(i); 
sum = sum + i;
}
	
System.out.println(sum);
	System.out.println("Loop finished");
	scanner.close();
}

}