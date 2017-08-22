package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Boolean isExit;
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true)
        {
            String numb1 = reader.readLine();
                if (numb1.equals("сумма"))
                {
                    System.out.println(n);
                    break;
                };
            int numb = Integer.parseInt(numb1);

            n = numb + n;

        }

        //Напишите тут ваш код
    }
}
