package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("Дом", new String[]{"Жилище", "Хата", "Берлога", "Крыша"});
        dictionary.put("Ручка", new String[]{"Рука", "Дверная ручка", "Детская ручка"});
        dictionary.put("Красивый", new String[]{"Привлекательный", "Превосходный", "Шикарный", "Фантастический"});
        dictionary.put("Человек", new String[]{"Сапиенс", "Персона", "Индивид", "Личность"});
        dictionary.put("Большой", new String[]{"Огромный", "Великий", "Громадный", "Гигантский"});
        dictionary.put("Хороший", new String[]{"Неплохой", "Отличный", "Гудовый", "Прекрасный"});
        dictionary.put("Плохой", new String[]{"Отвратительный", "Фу-Бака", "Наихудший"});

        for (Map.Entry<String, String[]> item : dictionary.entrySet()) {
            System.out.println("Ключи: " + item.getKey() + " ||| Значения: " + Arrays.toString(item.getValue()));
        }

        System.out.println("----------------------------------------------------------------------------------");
        HashMap<String, String[]> bigDictionary = new HashMap<>();
        bigDictionary.putAll(dictionary);
        Set<String> keys = dictionary.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String key = it.next();
            for (int i = 0; i < dictionary.get(key).length; i++) {
                ArrayList<String> a = new ArrayList<>();
                Collections.addAll(a, dictionary.get(key));
                String s = a.get(i);
                a.set(i, key);
                String[] a1 = new String[a.size()];
                for (int j = 0; j < a.size(); j++) {
                    a1[j] = a.get(j);
                }
                bigDictionary.put(s, a1);
            }
        }

        for (Map.Entry<String, String[]> print : bigDictionary.entrySet()) {
            System.out.println("Ключи: " + print.getKey() + " ||| Значения: " + Arrays.toString(print.getValue()));
        }
    }
}