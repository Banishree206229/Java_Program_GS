package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceNumberWhichDevidedByThreeInReverseOrder {
    public static void main(String[] args) {
        //int[] arr =  {2, 3, 5, 6, 9, 8};
        List<Integer> arr1 = Arrays.asList(2, 3, 5, 6, 9, 8);
        System.out.println(replaceNumber(arr1));
    }

    public static List<Integer> replaceNumber(List<Integer> arr) {
        // List<Integer> numbers = Arrays.asList(2, 3, 5, 6, 9, 8);
        List<Integer> three = new ArrayList<>();
        for (int num : arr) {
            if (num % 3 == 0) {
                three.add(num);
            }
        }

        Collections.reverse(three);

        int divisibleIndex = 0;
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num % 3 == 0) {
                result.add(three.get(divisibleIndex));
                divisibleIndex++;
            } else {
                result.add(num);
            }
        }
        return result;
    }
}