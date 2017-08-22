package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int m1,m2,m3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);

        if (a >= b)
            {
            m1 = a;
            m2 = b;
            }
        else
            {
            m1 = b;
            m2 = a;
            }
            if (m1 <= c)
                {
                m3 = m2;
                m2 = m1;
                m1 = c;
                }
            else
            if (m2 <= c)
                {
                    m1 = m1;
                    m3 = m2;
                    m2 =c;
                }
            else
            {
                m1 = m1;
                m2 = m2;
                m3 = c;
            }
    System.out.println(m1 + " " + m2 + " " + m3);
        //Напишите тут ваш код

    }
}

