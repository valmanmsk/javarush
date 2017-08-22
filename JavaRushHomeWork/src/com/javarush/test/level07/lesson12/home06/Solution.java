package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandPaFather = new Human("Иван", true, 65, null, null);
        Human grandPaMother = new Human("Мария", false, 62, null, null);
        Human grandMoFather = new Human("Петр", true, 69, null, null);
        Human grandMoMother = new Human("Ирина", false, 66, null, null);
        Human father = new Human("Степан", true, 35, grandPaFather, grandPaMother);
        Human mother = new Human("Ольга", false, 32, grandMoFather, grandMoMother);
        Human child1 = new Human("Олег", true, 12, father, mother);
        Human child2 = new Human("Роман", true, 10, father, mother);
        Human child3 = new Human("Анна", false, 8, father, mother);
        System.out.println(grandPaFather);
        System.out.println(grandMoFather);
        System.out.println(grandPaMother);
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
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

    }
}
