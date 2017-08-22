package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();//Напишите тут ваш код

    }

    public static int readInt() throws Exception
    {
        return Integer.parseInt(readString());//Напишите тут ваш код

    }

    public static double readDouble() throws Exception
    {
        return Double.parseDouble(readString());//Напишите тут ваш код
    }

    public static void readLn() throws Exception
    {
        readString();//Напишите тут ваш код

    }
}
