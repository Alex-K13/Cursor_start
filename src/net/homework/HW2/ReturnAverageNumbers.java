package net.homework.HW2;

public class ReturnAverageNumbers {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 1};
        int s = 0;

        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        System.out.println(s / array.length);
    }
}
