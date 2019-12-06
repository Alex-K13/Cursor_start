package net.homework.HW2;

public class ReturnSumNumbers {
    public static void main(String[] args) {
        int[] array = {2, -4, 32, -63, 0, 34};
        int sum = 0;

        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
