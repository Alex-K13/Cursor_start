package net.homework.HW3;

public class CountCreatedObjects {
    public static void main(String[] args) {
        CountObjects array1 = new CountObjects();
        CountObjects array2 = new CountObjects();
        CountObjects array3 = new CountObjects();
        CountObjects array4 = new CountObjects();
        CountObjects array5 = new CountObjects();
        CountObjects array6 = new CountObjects();

        System.out.println(CountObjects.count);
    }

    public static class CountObjects {

        public static int count;

        CountObjects() {
            count++;
        }


    }
}
