
package activity1;

import java.util.Scanner;
 
public class Activity1 {


public class StudmikeentGrade {
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        
        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();

        System.out.print("Enter marks in History: ");
        int history = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Soc: ");
        int soc = sc.nextInt();

        System.out.print("Enter marks in Arts: ");
        int arts = sc.nextInt();

        
        int total = science + history + math + soc + arts;
        float percentage = total / 5.0f;

        
        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage >= 70 && percentage <= 75) {
            remarks = "Poor";
        } else if (percentage <= 80) {
            remarks = "Fair";
        } else if (percentage <= 85) {
            remarks = "Good";
        } else if (percentage <= 90) {
            remarks = "Very Good";
        } else if (percentage <= 100) {
            remarks = "Excellent";
        } else {
            remarks = "Invalid marks";
        }

        // Output
        System.out.println("\nTotal Marks: " + total);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);

        
        if (percentage >= 70 && percentage <= 100) {
            System.out.println("\nCongrats " + name + ", you Passed.");
        } else if (percentage < 70) {
            System.out.println("\nTry Again " + name + ".");
        }

    }
}

