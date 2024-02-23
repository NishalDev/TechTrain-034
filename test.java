import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, " + name + "! Welcome to the Java Program.");
    }
}
