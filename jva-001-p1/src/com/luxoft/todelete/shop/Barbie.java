package com.luxoft.todelete.shop;

public class Barbie extends Doll
{
    private String extraClothes;

    public Barbie()
    {
        this.setCanSing(true);
    }

    public String getExtraClothes()
    {
        return extraClothes;
    }

    public void setExtraClothes(String extraClothes)
    {
        this.extraClothes = extraClothes;
    }
}
