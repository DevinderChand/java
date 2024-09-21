import java.util.Scanner;

public class OutletStatusProgram {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the business value in millions of dollars
        System.out.print("Enter the business value in millions of dollars: ");
        
        // Read the input value from the user
        double businessValue = sc.nextDouble();

        // Close the Scanner to prevent resource leak
        sc.close();

        // Assign a status based on the business value
        String status = assignStatus(businessValue);

        // Display the assigned status to the user
        System.out.println("Outlet Status: " + status);
    }

    // Function to assign status based on business value
    public static String assignStatus(double businessValue) {
        if (businessValue >= 90) {
            return "Platinum+";
        } else if (businessValue >= 85) {
            return "Platinum";
        } else if (businessValue >= 80) {
            return "Platinum-";
        } else if (businessValue >= 75) {
            return "Gold+";
        } else if (businessValue >= 70) {
            return "Gold";
        } else if (businessValue >= 65) {
            return "Silver+";
        } else if (businessValue >= 60) {
            return "Silver";
        } else if (businessValue >= 55) {
            return "Bronze+";
        } else if (businessValue >= 50) {
            return "Bronze";
        } else {
            return "General";
        }
    }
}
