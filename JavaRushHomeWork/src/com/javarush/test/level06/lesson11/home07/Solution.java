package com.javarush.test.level06.lesson11.home07;

import java.util.ArrayList;

/* Три статические переменных name
Создай 3 public статических переменных: String Solution.name, String Cat.name, String Dog.name
*/

public class Solution
{
    static String name = "Ivan";
    Solution(String name)
    {this.name = name;}
    public static class Cat {
        static String name = "Murka";
        Cat(String name)
        {this.name = name;}
    }

    public static class Dog {
        static String name = "Bobik";
        Dog(String name)
        {this.name = name;}
    }

}
