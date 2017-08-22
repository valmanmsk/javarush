package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vmandarov on 14.09.2015.
 */
public class MoldovanHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {return 400;}
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() +  " яиц в месяц.";
    }
}
