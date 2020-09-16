import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] numArray = { 2, 9, -7, 100, 40, 5 };
        int temp;
        String[] stringArray = { "Brandon", "Zoe", "Joe", "Carl" };

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
