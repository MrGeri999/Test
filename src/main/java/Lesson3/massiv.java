package Lesson3;

import java.util.Arrays;

public class massiv {
    public static void main(String[] args) {

        int[] array = {100, 200, 300, 400, 500, 600, 700};
////
////        for (int value : array) {
////            System.out.println(value);
////        }
//
////        int[] one = new int[10];
////        one[0] = 1;
////        one[7] = 9;
////        int result = one[0] + one[7];
////        System.out.println(result);
//
        int[] drf = {1, 3, 4, 2, 6};
        int result = 0;
        for (int a = 0; a < drf.length; a++) {
            result += drf[a];
        }
        System.out.println(result);

        for ( int b = drf.length - 1; b >= 0; b--) {

            System.out.print(drf[b] + " ");
        }

        int c = drf.length;
        while (c > 0) {
            c--;

            System.out.print(drf[c] + " ");
        }


//        int[] asd = new int [10];
//        asd[0] = 1;
//        if (int i = asd.length; i--) {
//            asd[i] = asd.length-1;
//        }
    }
}
