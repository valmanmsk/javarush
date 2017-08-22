package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vmandarov on 14.09.2015.
 */
public class BelarusianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {return 300;}
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() +  " яиц в месяц.";
    }
}