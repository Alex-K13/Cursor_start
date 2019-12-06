package net.homework.HW2;

public class ReturnAverageNumbers {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 1};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        System.out.println(sum / array.length);
    }
}
