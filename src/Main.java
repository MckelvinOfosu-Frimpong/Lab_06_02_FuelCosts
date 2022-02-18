import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double gasTank = 0;
        double mpg = 0;
        double gasPrice = 0 ;
        double oneHundredMiles;
        double distance;
        String trash = " ";


        Scanner console = new Scanner(System.in);

        System.out.print("Enter number of gallons of gas in the Tank: ");
        if (console.hasNextDouble())
        {
            gasTank = console.nextDouble();
            console.nextLine();
        }
        else
        {
            trash = console.nextLine();
            System.out.println("Invalid input: " + trash + " restart the program");
            System.exit(0);
        }

        System.out.print("Enter the miles per gallon: ");
        if (console.hasNextDouble())
        {
            mpg = console.nextDouble();
            console.nextLine();
        }
        else
        {
            trash = console.nextLine();
            System.out.println("Invalid input: " + trash + " restart the program");
            System.exit(0);
        }

        System.out.print("Enter the price per gallon: ");
        if (console.hasNextDouble())
        {
            gasPrice = console.nextDouble();
            console.nextLine();
        }
        else
        {
            trash = console.nextLine();
            System.out.println("Invalid input: " + trash + " restart the program");
            System.exit(0);
        }

        oneHundredMiles = ((100 / mpg ) * gasPrice);
        System.out.println("The price of 100 miles of gas is: " + oneHundredMiles);

        distance = mpg * gasTank;
        System.out.println("You can drive " + distance + " Miles Per tank ");


    }
}
