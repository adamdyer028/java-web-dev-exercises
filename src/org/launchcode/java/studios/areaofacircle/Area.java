package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Radius:");
        Double radius;
        do {
            System.out.println("Radius:");
            while (!input.hasNextDouble()) {
                System.out.println("That's not a valid radius!");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0 || !input.hasNextDouble());
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
