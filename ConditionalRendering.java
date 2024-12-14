import java.util.Scanner ;
class  ConditionalRendering { 

public static void main(String args []) { 
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your choice ");
int number = scanner.nextInt();

switch(number) {
 case 1 :  
	System.out.println("Namaste");
	break ; 
 case 2 : 
	System.out.println("Hello");
	break;
 case 3 : 
 	System.out.println("Bonjour");
 	break ;
default :
	System.out.println("Invalid Choices");
} 


scanner.close(); 
}

}