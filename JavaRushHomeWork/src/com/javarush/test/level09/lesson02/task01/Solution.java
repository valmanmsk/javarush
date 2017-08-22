package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        method2();
        StackTraceElement[] stackTraceElement1 = Thread.currentThread().getStackTrace();
        return stackTraceElement1;
        //Напишите тут ваш код

    }

    public static StackTraceElement[] method2()
    {
        method3();
        StackTraceElement[] stackTraceElement2 = Thread.currentThread().getStackTrace();
        return stackTraceElement2;
        //Напишите тут ваш код

    }

    public static StackTraceElement[] method3()
    {
        method4();
        StackTraceElement[] stackTraceElement3 = Thread.currentThread().getStackTrace();
        return stackTraceElement3;
        //Напишите тут ваш код

    }

    public static StackTraceElement[] method4()
    {
        method5();
        StackTraceElement[] stackTraceElement4 = Thread.currentThread().getStackTrace();
        return stackTraceElement4;
        //Напишите тут ваш код

    }

    public static StackTraceElement[] method5()
    {
        StackTraceElement[] stackTraceElement5 = Thread.currentThread().getStackTrace();
        return stackTraceElement5;
        //Напишите тут ваш код

    }
}
