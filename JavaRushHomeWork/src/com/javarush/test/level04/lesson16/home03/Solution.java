package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Boolean isExit;
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (isExit = false; !isExit; )
        {
        String numb1 = reader.readLine();
        isExit = numb1.equals("-1");
        int numb = Integer.parseInt(numb1);

        n = numb + n;

            //Напишите тут ваш код
        }
        System.out.println(n);
    }
}
