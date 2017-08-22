package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");
        map.put("Тихонов", "Иван");
        map.put("Петрова", "Мария");
        map.put("Сидорова", "Анна");
        map.put("Ивановский", "Петр");
        map.put("Петровский", "Андрей");
        map.put("Смирнов", "Сергей");
        map.put("Горохов", "Иван");
        return map;
        //Напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        List<String> keys = new ArrayList<String>(copy.keySet());
        List<String> values = new ArrayList<String>(copy.values());
            for (Map.Entry<String, String> pair : copy.entrySet())
            {
                String currentKey = pair.getKey();
                for (int i = 0; i < values.size(); i++)
                {
                    if (values.get(i).equals(pair.getValue()) && !keys.get(i).equals(currentKey))
                        removeItemFromMapByValue(map, pair.getValue());
                }
            }

        //Напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
            {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args)
    {
        HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for(Map.Entry<String,String> pair : map.entrySet())
            System.out.println(pair);
    }
}
