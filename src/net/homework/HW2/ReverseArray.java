package net.homework.HW2;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{2, 3, 1, 7, 11};

        Arrays.sort(intArray, Collections.reverseOrder());

        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + " ");

    }
}
