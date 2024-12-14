import java.util.* ; 
class PrimeOrNot { 

public static void main(String args [] ) {

Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
System.out.println("Enter any number") ; 

for(int i = 2 ; i < number ; i++){
		if(i % 2 == 0) { 
		System.out.println("Not a prime number" ); 
else {
		System.out.println("Prime Number"); 
 }
}

}


System.out.println("Program Terminated");
scanner.close();
} 
}