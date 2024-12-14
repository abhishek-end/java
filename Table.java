import java.util.Scanner;
class Table { 


public static void main(String args[]) {

Scanner  scanner = new Scanner(System.in) ;
	System.out.println("Enter Any Number");
	int table = scanner.nextInt();
	System.out.println(table + "x" + 2 + "= " + table * 2);
scanner.close();
}

}