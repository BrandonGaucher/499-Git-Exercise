import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

           // variables
           int[] numArray = { 2, 9, -7, 100, 40, 5 };
           String[] stringArray = { "Brandon", "Zoe", "Joe", "Carl" };
           int temp;

        // sorting string array.

        System.out.println("the original integer  array is: ");
        for (String str : stringArray) {
            System.out.println(str + " ");

        }
        Arrays.sort(stringArray);
        System.out.println("The sorted integer Array is: ");
        for (String str : stringArray) {
            System.out.println(str + " ");
        }
        // sorting string array.

        System.out.println("the original integer  array is: ");
        for (String str : stringArray) {
            System.out.println(str + " ");

        }
        Arrays.sort(stringArray);
        System.out.println("The sorted integer Array is: ");
        for (String str : stringArray) {
            System.out.println(str + " ");
        }
    }

}
