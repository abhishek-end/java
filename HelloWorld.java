import java.util.Scanner; // Import Scanner

class HelloWorld {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter your name: "); // Prompt user
        String name = sc.nextLine(); // Read input
        System.out.println("Hello, " + name + "!"); // Use the input
    }
}
