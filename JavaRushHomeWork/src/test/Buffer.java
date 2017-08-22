package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
*/

public class Buffer
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " получает " + nAge);//Напишите тут ваш код
    }
}