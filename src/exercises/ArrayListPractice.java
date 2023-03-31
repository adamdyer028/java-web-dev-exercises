package exercises;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(54);
        numList.add(41);
        numList.add(27);
        numList.add(59);
        numList.add(1);
        numList.add(13);
        numList.add(88);
        numList.add(9);
        numList.add(2);
        numList.add(10);
        //System.out.println(sumOfOdd(numList));

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Banana");
        strList.add("House");
        strList.add("Boat");
        strList.add("Moral");
        strList.add("Button");
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters?");
        int length = input.nextInt();

        fiveLetters(strList, length);


    }
    public static int sumOfOdd(ArrayList<Integer> numArray) {
        int sum = 0;
        for (int i : numArray) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void fiveLetters(ArrayList<String> strList, int length) {
        for (String str : strList) {
            if (str.length() == length) {
                System.out.println(str);
            }
        }

    }
}
