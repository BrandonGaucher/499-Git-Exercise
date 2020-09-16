import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        String[] stringArray = { "Brandon", "Zoe", "Joe", "Carl" };

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
