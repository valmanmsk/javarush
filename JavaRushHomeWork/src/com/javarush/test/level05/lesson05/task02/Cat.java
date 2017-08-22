package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {

    }

    public boolean fight (Cat anotherCat)
    {
        int s1 = (this.strength + this.age);
        int s2 = (anotherCat.strength + anotherCat.age);

        if (s1 > s2)
        {
            return true;
        }

        else
        {
            return false;

        }
        //Напишите тут ваш код

    } public static void main(String[] args)
{ // этот метод тоже для примера
    Cat cat1 = new Cat();
    cat1.strength = 10;
    cat1.age = 3;
    Cat cat2 = new Cat();
    cat2.strength =8;
    cat2.age = 6;
    System.out.println("cat1 - " + cat1.fight(cat2));
    System.out.println("cat2 - " + cat2.fight(cat1));
}
}