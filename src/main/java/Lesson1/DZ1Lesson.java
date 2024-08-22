package Lesson1;

public class DZ1Lesson {
    public static void main(String[] args) {
        for (int a = 20; a < 41; a++) {
            System.out.printf("Все числа %d \n", a);
        }

        int a = 20;
        do {
            System.out.println(a);
            a++;
        } while (a < 41);
    }
}

