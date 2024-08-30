package Lesson1;

public class DZ1Lesson { // 1 Лекция. Написать программу, которая выведет на консоль все целые числа в диапазоне от 20 до 40
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

