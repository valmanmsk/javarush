package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{
    public static Object createArrayList()
    {
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");
        return list;
        //Напишите тут ваш код

    }

    public static Object createLinkedList()
    {
        List<String> list = new LinkedList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");
        return list;
        //Напишите тут ваш код

    }
}
