package com.javarush.test.level06.lesson05.task03;

/* По 50 000 объектов Cat и Dog
Создать в цикле по 50 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 50000; i++)
        {
            Cat cat = new Cat();
            Dog dog = new Dog();

        }
        //Напишите тут ваш код
    }
}

