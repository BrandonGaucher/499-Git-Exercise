import java.util.Scanner;
import java.util.Arrays;

//The author of this program Brandon Gaucher

public class ArraySort {
    public static void main(String[] args) {

        int[] numArray = { 2, 9, -7, 100, 40, 5 };
        String[] stringArray = { "Brandon", "Zoe", "Joe", "Carl" };
        int temp;

        // sorting integer

        System.out.println("the original integer  array is: ");
        for (int num : numArray) {
            System.out.println(num + " ");

        }
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < numArray.length - 1; i++) {
            System.out.print(numArray[i] + ", ");
        }
        System.out.print(numArray[numArray.length - 1]);

        // sorting string array.

        System.out.println("the original string  array is: ");
        for (String str : stringArray) {
            System.out.println(str + " ");

        }
        Arrays.sort(stringArray);
        System.out.println("The sorted string Array is: ");
        for (String str : stringArray) {
            System.out.println(str + " ");
        }

    }

}
