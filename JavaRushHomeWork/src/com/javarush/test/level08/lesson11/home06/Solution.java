package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> ch = new ArrayList<Human>();
        ArrayList<Human> pa = new ArrayList<Human>();
        ArrayList<Human> ma = new ArrayList<Human>();

        Human child1 = new Human("Олег", true, 12, new ArrayList<Human>());
        Human child2 = new Human("Роман", true, 10, new ArrayList<Human>());
        Human child3 = new Human("Анна", false, 8, new ArrayList<Human>());

        ch.add(child1);
        ch.add(child2);
        ch.add(child3);

        Human father = new Human("Степан", true, 35, ch);
        Human mother = new Human("Ольга", false, 32, ch);

        Human grandPaFather = new Human("Иван", true, 65, pa);
        Human grandPaMother = new Human("Мария", false, 62, pa);
        Human grandMoFather = new Human("Петр", true, 69, ma);
        Human grandMoMother = new Human("Ирина", false, 66, ma);

        pa.add(father);
        ma.add(mother);

        System.out.println(grandPaFather);
        System.out.println(grandPaMother);
        System.out.println(grandMoFather);
        System.out.println(grandMoMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        //Написать тут ваш код
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
