package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Иванов", new Date("february 12 1968"));
        map.put("Петров", new Date("december 25 1999"));
        map.put("Сидоров", new Date("november 7 1988"));
        map.put("Тихонов", new Date("january 18 1963"));
        map.put("Смирнов", new Date("september 8 1970"));
        map.put("Путин", new Date("june 22 1975"));
        map.put("Жеглов", new Date("august 8 1985"));
        map.put("Шарапов", new Date("july 19 1984"));
        map.put("Миронова", new Date("may 9 1975"));
return map;
        //Напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if (month > 4 && month < 8)
            {
                iterator.remove();
            }
        }
        //Напишите тут ваш код

    }

    public static void main(String[] args)
    {
        HashMap<String,Date> map = createMap();
        removeAllSummerPeople(map);
        for(Map.Entry<String,Date> pair : map.entrySet())
            System.out.println(pair);
    }
}
