package ca.ucalgary.ensf593;

import java.util.Scanner;

public class MarathonWithArrayList {

    public static void main(String[] args) {

        // Define two array lists here to store the names and the running times
        // Read user input
        String sin;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the name of the participant");
            sin = scan.nextLine();
            if (sin.toUpperCase().equals("QUIT"))
                break;
            // Add the name to your ArrayList
            System.out.println("Please enter the running time of the participant");
            sin = scan.nextLine();
            // Add the running time to your array list
        }
        // Call the function findFastestRunner and pass the running times array list to it
        // Print the name of the fastestrunner to the console
    }
}
