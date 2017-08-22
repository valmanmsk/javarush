package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
    public static void sort(int[] array)
    {

        List<Integer> arr1 = new ArrayList<Integer>();
        for (int k = 0; k < array.length; k++)
        {
            arr1.add(array[k]);
        }
        for ( int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (arr1.get(i) <= arr1.get(i + 1))
                {
                    int t = arr1.get(i + 1);
                    arr1.set(i + 1, arr1.get(i));
                    arr1.set(i, t);
                }
            }
        }
        for (int j = 0; j < array.length; j++)
        {
            array[j] = arr1.get(j);
        }
        //Напишите тут ваш код
    }
}
