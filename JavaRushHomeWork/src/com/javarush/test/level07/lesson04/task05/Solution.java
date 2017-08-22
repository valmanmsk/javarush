package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] numb1 = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numb1.length; i++)
        {
            numb1[i] = Integer.parseInt(reader.readLine());
        }
        int[] numb2 = new int[10];
        int[] numb3 = new int[10];
        for (int i = 0; i < numb2.length; i++)
        {
           numb2[i] = numb1[i];
        }
        for (int i = 10; i < numb1.length; i++)
        {
            numb3[i - 10] = numb1[i];
            System.out.println(numb3[i-10]);
        }
        //Напишите тут ваш код

    }
}
