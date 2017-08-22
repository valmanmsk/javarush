package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        String n1 = reader.readLine();
        int n = Integer.parseInt(n1);
        int i = 1;
        if (n > 0)
        {
            while (true)
            {
                String numb1 = reader.readLine();
                int numb = Integer.parseInt(numb1);

                if (i == n)
                {
                    if (maximum <= numb)
                    {
                        maximum = numb;
                    }
                   break;
                }

                if (maximum <= numb)
                {
                    maximum = numb;
                }
                    i++;

            }
        }
        else
        {
        return;

        }


        //напишите здесь ваш код




        System.out.println(maximum);
    }
}
