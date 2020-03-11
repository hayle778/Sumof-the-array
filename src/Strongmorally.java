import java.lang.reflect.Array;
import java.util.Scanner;
// Write a java program to sum values of an array

public class Strongmorally {
public static void main(String[]args) {


   // Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
// Array
    int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    int sum = 0;

    for (int i : myArray)
        sum += i;
        System.out.println("The sum is: " + sum);

}

}
