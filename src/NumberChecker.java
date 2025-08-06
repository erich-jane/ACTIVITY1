import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
           
            System.out.println("//instance 1");
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();
            
            if (num1 == 0) {
                System.out.println("Inputted number Zero\n");
            } else if (num1 % 2 == 0) {
                System.out.println("Inputted number is even\n");
            } else {
                System.out.println("Inputted number is odd\n");
            }
            
            
            System.out.println("//instance 2");
            System.out.print("Enter a number: ");
            int num2 = sc.nextInt();
            
            if (num2 == 0) {
                System.out.println("Inputted number Zero\n");
            } else if (num2 % 2 == 0) {
                System.out.println("Inputted number is even\n");
            } else {
                System.out.println("Inputted number is odd\n");
            }
            
            
            System.out.println("//instance 3");
            System.out.print("Enter a number: ");
            int num3 = sc.nextInt();
            
            if (num3 == 0) {
                System.out.println("Inputted number Zero");
            } else if (num3 % 2 == 0) {
                System.out.println("Inputted number is even");
            } else {
                System.out.println("Inputted number is odd");
            }
        }
    }
}
