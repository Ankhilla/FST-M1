package Activities;
import java.util.*;
public class Activity2 {
    public static void main(String[] args) {

        int[] numArray = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArray));


        int searchNum = 10;
        int fixedSum = 30;


        System.out.println("Result: " + result(numArray, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;

        for (int number : numbers) {

            if (number == searchNum) {
                temp_sum += searchNum;

             }

            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }
}