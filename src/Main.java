
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter gallons of gas in the tank: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input! Enter a number.");
            in.close();
            return;
        }
        double gallons = in.nextDouble();

        System.out.print("Enter fuel efficiency in miles per gallon: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input! Enter a number.");
            in.close();
            return;
        }
        double mpg = in.nextDouble();

        System.out.print("Enter price of gas per gallon: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input! Enter a number.");
            in.close();
            return;
        }
        double price = in.nextDouble();

        if (gallons < 0 || mpg <= 0 || price < 0) {
            System.out.println("Invalid input! Values must be nonnegative, and MPG must be greater than zero.");
        } else {
            double costPer100Miles = (100.0 / mpg) * price;
            double distance = gallons * mpg;

            System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
            System.out.printf("Distance the car can travel: %.2f miles%n", distance);
        }

        in.close();
    }
}