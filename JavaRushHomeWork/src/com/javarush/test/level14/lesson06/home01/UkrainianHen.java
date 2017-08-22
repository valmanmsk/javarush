package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vmandarov on 14.09.2015.
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {return 700;}
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() +  " яиц в месяц.";
    }
}
