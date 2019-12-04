package net.homework.HW2;

import java.util.Arrays;

public class ReturnSumNumbers {
    public static void main(String[] args) {
        int[] array = {2, -4, 32, -63, 0, 34};
        int s = 0;

        for (int i : array) {
            if (i > 0) {
                s += i;
            }
        }
        System.out.println(s);
    }
}
