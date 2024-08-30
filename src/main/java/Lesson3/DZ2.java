package Lesson3;

import java.util.*;

public class DZ2 { // 4 лекция в презетациях 55 слайд
//    Написать метод, который на вход принимает строку произвольной длины и произвольного содержания.
//    Найти сколько раз встречается каждый символ заданной строки.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        chisla(scanner.nextLine());
    }

    public static void chisla(String a) {
        Map<Character, Integer> mapchisla = new LinkedHashMap<>();
        for (int b = 0; b < a.length(); b++) {
            char bts = a.charAt(b); //принимает все элементы в строке a, по индексам b
            if(!mapchisla.containsKey(bts)){ // не содержится ли bts в ключах
                mapchisla.put(bts,1);
            }
            else {
                int c = mapchisla.get(bts);
                mapchisla.put(bts, ++c);
            }
        }
        for (char bt : mapchisla.keySet()) {
            int x = mapchisla.get(bt);
            System.out.print(bt + " - ");
            System.out.println(x);
        }

    }
}

