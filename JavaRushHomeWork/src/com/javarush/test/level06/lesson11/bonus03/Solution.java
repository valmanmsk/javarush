package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/
//считай в цикле 5 чисел в массив и потом отсортируй и выведи
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        int n5 = Integer.parseInt(reader.readLine());

        int m1, m2, m3, m4, m5;

        if (n1 >= n2)
        {
            m1 = n1;
            m2 = n2;
        }
            else
            {
                m1 = n2;
                m2 = n1;
            }

        if (m1 <= n3)
            {
                m3 = m2;
                m2 = m1;
                m1 = n3;
                if (m1 <= n4)
                {
                    m4 = m3;
                    m3 = m2;
                    m2 = m1;
                    m1 = n4;
                }
                if (m1 <= n5)
                {
                    //m5 = m4;
                    m4 = m3;
                    m3 = m2;
                    m2 = m1;
                    m1 = n5;
                }


            }

        //Напишите тут ваш код
    }
}
