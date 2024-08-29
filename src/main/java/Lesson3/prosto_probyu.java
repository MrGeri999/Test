package Lesson3;

public class prosto_probyu {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        int x = arr[1] + arr[2];
//        System.out.println(x);
//
//        int[] array = {10, 20, 20, 30};
//        for (int value : array) {
//            System.out.println(value);


            int[] arr1 = {1, 2, 3, 4, 6};
            int[] arr2 = {1, 2, 3, 4, 5};
            boolean areEqual = true;
            for (int i = 0; i < 5; i++) { // не понимаю, для чего нуджен сам цикл for, можно ли его просто удалить?
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }

            }
        System.out.println(areEqual);
        }

    }


