package test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vmandarov on 19.02.2015.
 */
public class test
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandfatherName = reader.readLine();
        Cat catGrandpa = new Cat(grandfatherName, null, null);
        String grandmotherName = reader.readLine();
        Cat catGrandma = new Cat(grandmotherName, null, null);
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandpa, null);
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandma);
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);
        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }
    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;
        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }
        @Override
        public String toString()
        {
            if (father == null && mother == null) {
                return "Cat name is " + name + ", no mother, no father"; }
            else if (mother == null && father != null) {
                return "Cat name is " + name + ", no mother, father is " + father.name; }
            else if (mother != null && father == null) {
                return "Cat name is " + name + ", mother is " + mother.name + ", no father"; }
            else {
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name; }
        }
    }
}
