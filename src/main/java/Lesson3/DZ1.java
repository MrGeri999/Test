package Lesson3;

import java.util.*;

public class DZ1 {

    public static void zadanie(List<Character> a) {
        Map<Character, Integer> mapchisla = new LinkedHashMap<>();

        for (int b = 0; b < a.size(); b++) {
            char bts = a.get(b); //принимает все элементы в строке a, по индексам b
            if (!mapchisla.containsKey(bts)) { // не содержится ли bts в ключах
                mapchisla.put(bts, 1);
            } else {
                int c = mapchisla.get(bts);
                mapchisla.put(bts, ++c);
            }
        }
        List<Character> uniq = new ArrayList<>();

        for (char k: mapchisla.keySet()) {
            if (mapchisla.get(k) == 1) {
                uniq.add(k);
            }
        }

        if (!uniq.isEmpty()) {
            System.out.println("Уникальные символы" + uniq);
        }
        else {
            System.out.println("Уникальных не найдено");
        }
        }

    public static void main(String[] args) {
        List<Character> inputList = new ArrayList<>(Arrays.asList('a','a','b','c'));
        zadanie(inputList);
        }
    }
//        int count = 0;
//
//            for (int b = 0; b < a.length(); b++){
//                String text = String.valueOf(a.charAt(b));
//
//                if (!nepovtor.contains(text)){
//                    nepovtor.add(text);
//                    count++;
//                    System.out.println("Первый уникальный" + text);
//
//                    if (count>1)
//                }
//            }
//        System.out.println("Кол.во Уникальные" +count);
//        System.out.println("Уникальные" + nepovtor);
//    }
