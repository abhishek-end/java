import java.util.Scanner;

class TwoVariables{ 

public static void main(String args[])  
 {

Scanner sc = new Scanner(System.in); 

System.out.println("Enter First number");
int num1  = sc.nextInt();

System.out.println("Enter Second Number");
int num2 = sc.nextInt();

int sum = num1 + num2 ; 

System.out.println("The addition of " + num1 + " and " + num2 + " is " + sum
);
sc.close();
}
} 
