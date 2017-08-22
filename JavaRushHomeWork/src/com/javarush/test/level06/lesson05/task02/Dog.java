package com.javarush.test.level06.lesson05.task02;

/**
 * Created by vmandarov on 19.02.2015.
 */
class Dog
{

    protected void finalize() throws Throwable
    {
        System.out.println(this + " destroyed");
    }
        //Напишите тут ваш код

}
