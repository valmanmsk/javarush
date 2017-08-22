package com.javarush.test.level06.lesson05.task03;

/**
 * Created by vmandarov on 19.02.2015.
 */
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}
