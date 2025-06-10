//NAME: Michael Demidov

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Displaying the main 2 options
        System.out.println("Please select one option:");
        System.out.println("Add a Service (1)");
        System.out.println("Book a Service (2)");

        //First option (Add a service)
        int service = sc.nextInt();
        if (service == 1) {
            System.out.println("Service Name (1)");
            System.out.println("Category (2)");
            System.out.println("Hourly Rate (3)");

            //Second option (Book a service)
            int serviceAdd = sc.nextInt();
        } else if (service == 2) {
            System.out.println("Electrical (1)");
            System.out.println("IT support (2)");
            System.out.println("Cleaning (3)");

            //First option of (Book a service)
            int category = sc.nextInt();
            if (category == 1) {
                System.out.println("Outlet Installation (1)");
                System.out.println("Switch Installation (2)");
                System.out.println(" (3)");
                int electricalCategory = sc.nextInt();
                if (electricalCategory == 1) {

                } else if (electricalCategory == 2) {
                } else if (electricalCategory == 3) {

                } else System.out.println("invalid character please enter a number 1 to 3");
            }
        } else System.out.println("invalid character please enter a number 1 to 3");
    }
}