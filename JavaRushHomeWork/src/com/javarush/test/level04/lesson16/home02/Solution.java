package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);
int max, mid, min;
        if (a >= b)
        {
            max = a;
            mid = b;
        }
        else
        {
            max = b;
            mid = a;
        }
        if (max <= c)
        {
            min = mid;
            mid = max;
            max = c;
        }
        else
        {
            if (mid <= c)
            {
                max = max;
                min = mid;
                mid = c;
            }
            else
            {
                max = max;
                mid = mid;
                min = c;
            }
        }
       System.out.print(mid);
        //Напишите тут ваш код

    }
}
