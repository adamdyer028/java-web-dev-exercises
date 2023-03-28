package exercises;
import java.awt.*;
import java.util.Scanner;
public class CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length:");
        Float length = input.nextFloat();
        System.out.println("Width:");
        Float width = input.nextFloat();
        Float area = length * width;
        System.out.println("The rectangle has an area of " + area);


    }
}
