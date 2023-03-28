package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles Driven:");
        Float miles = input.nextFloat();
        System.out.println("Gallons of Gas Used:");
        Float gallons = input.nextFloat();
        Float milesPerGallon = miles / gallons;
        System.out.println("You are getting " + milesPerGallon + " mpg.");
    }
}
