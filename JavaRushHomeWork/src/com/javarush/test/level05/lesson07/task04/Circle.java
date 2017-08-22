package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int centX;
    int centY;
    int rad;
    int width;
    String color;

    //Напишите тут ваш код
    public void initialize(int centX, int centY, int rad)
    {
        this.centX = centX;
        this.centY = centY;
        this.rad = rad;
    }
    public void initialize(int centX, int centY, int rad, int width)
    {
        this.centX = centX;
        this.centY = centY;
        this.rad = rad;
        this.width = width;
    }
    public void initialize(int centX, int centY, int rad, int width, String color)
    {
        this.centX = centX;
        this.centY = centY;
        this.rad = rad;
        this.width = width;
        this.color = color;
    }
}
