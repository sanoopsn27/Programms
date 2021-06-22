
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");

    // takes input from the keyboard
    int name = input.nextInt();

    // prints the name
    System.out.println("My name is " + name);

    // closes the scanner
    input.close();
  }
}